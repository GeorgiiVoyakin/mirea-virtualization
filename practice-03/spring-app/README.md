## How to run

### Build

```bash
docker build -t spring-app-practice03:latest .
```

### Start DB

```bash
docker run --rm -p5432:5432 -e POSTGRES_PASSWORD=postgres postgres
```

### Run

```bash
docker run --rm -p8080:8080 spring-app-practice03:latest
```
