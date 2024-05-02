# grafana-monitoring-example

## Stack
* Grafana
* Loki
* Prometheus
* Tempo
* Promtail
* Open telemetry
* node-exporter

## How to start?
Monitoring System

Grafana default account : admin/admin
```
docker-compose up -d
```

Spring Boot Example
```
cd spring-sample
./gradlew build
cd deploy
docker-compose up -d
```

## Url
* Grafana
  * http://localhost:3000
* Prometheus
  * http://localhost:9090
* Tempo
  * http://localhost:3200
  * http://localhost:4317 (grpc)
* Loki
  * http://localhost:3100
