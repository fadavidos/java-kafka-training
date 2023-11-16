# JAVA-KAFKA-TRAINING


## How to run it:

### Docker compose:

There is a file named `docker-compose.yml` that should be executed

```
docker-compose up -d
```


### Spring Boot Application 

Run the Spring Boot Application as usual. 



## How to publish a new message in kafka:

There is an endpoint `/publish` who publish messages to kafka.

```
curl --location 'localhost:8080/publish' \
--header 'Content-Type: application/json' \
--data 'hello world'
```