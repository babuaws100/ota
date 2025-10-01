.PHONY: up

up:
	java -javaagent:target/opentelemetry-javaagent.jar \
        -Dotel.service.name=user-service \
        -Dotel.traces.exporter=logging \
        -Dotel.metrics.exporter=none \
        -Dotel.logs.exporter=none \
        -Dotel.javaagent.extensions=../otel-javaagent-spring-extension/target/otel-javaagent-spring-extension-1.0-SNAPSHOT.jar \
        -jar target/user-service-0.0.1-SNAPSHOT.jar