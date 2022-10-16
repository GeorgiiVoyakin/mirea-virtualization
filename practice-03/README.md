## How to run

### Build

```bash
docker build -t practice03:latest .
```

### Create volume

```bash
docker volume create logs
```

### Run

```bash
docker run -v logs:/logs -p8080:8080 practice03:latest
```

## View logs

```bash
sudo cat /var/lib/docker/volumes/logs/_data/logs.txt
```
