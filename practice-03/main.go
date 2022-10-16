package main

import (
	"flag"
	"fmt"
	"io"
	"io/ioutil"
	"log"
	"net/http"
	"os"
	"strings"
)

const (
	PORT = "8080"
)

func main() {
	logs_file, err := os.OpenFile("/logs/logs.txt", os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	if err != nil {
		log.Fatal(err)
	}
	defer logs_file.Close()
	mw := io.MultiWriter(logs_file, os.Stdout)
	log.SetOutput(mw)

	a := flag.Bool("a", false, "Example flag")
	b := flag.Bool("b", false, "Another example flag")
	flag.Parse()

	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		io.WriteString(w, os.Getenv("TOKEN"))
		log.Println("GET /")
	})

	files, err := ioutil.ReadDir("/important_files")
	if err != nil {
		log.Fatal(err)
	}
	file_names := make([]string, 0, 10)
	for _, f := range files {
		file_names = append(file_names, f.Name())
	}
	http.HandleFunc("/files", func(w http.ResponseWriter, r *http.Request) {
		io.WriteString(w, strings.Join(file_names, " "))
		log.Println("GET /files")
	})

	log.Printf("Server listen on port %s\n", PORT)
	log.Printf("a is %t, b is %t\n", *a, *b)
	log.Fatal(http.ListenAndServe(fmt.Sprintf(":%s", PORT), nil))
}
