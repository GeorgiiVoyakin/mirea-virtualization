FROM golang:1.19 AS builder
COPY main.go .
RUN CGO_ENABLED=0 go build main.go

FROM alpine:3.13
LABEL author="Georgii Voyakin"
EXPOSE 8080
VOLUME /logs
COPY ./important_files /important_files
ADD https://gist.githubusercontent.com/GeorgiiVoyakin/a3d024e21dd8b31a17f225451262cfeb/raw/d070bb50c91049d6127de64d176a4a76ffc4cb38/main.go /important_files/code_from_net.go
ENV TOKEN="ajdfoiwjer"
WORKDIR /app
COPY --from=builder /go/main ./main
ENTRYPOINT ["./main"]
CMD ["-a"]
ONBUILD RUN echo 'image is used as a base for new build'