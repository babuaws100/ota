.PHONY: all build-services up down restart

all: build-services up

build-services:
	cd user-service && mvn clean install
	cd address-service && mvn clean install
	cd otel-javaagent-spring-extension && mvn clean install
	docker-compose restart user-service address-service
	

up:
	docker-compose up -d

down:
	docker-compose down

restart: down up