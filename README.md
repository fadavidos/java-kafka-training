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
curl --location 'localhost:8080/publish/person' \
--header 'Content-Type: application/json' \
--data '{
    "id": "123",
    "name": "John",
    "age": 3
}'
```

```
curl --location 'localhost:8080/publish/car' \
--header 'Content-Type: application/json' \
--data '{
    "id": "342",
    "brand": "Toyota",
    "model": "2024"
}'
```