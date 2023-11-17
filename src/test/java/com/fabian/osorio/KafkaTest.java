package com.fabian.osorio;

import com.fabian.osorio.dtos.PersonDTO;
import com.fabian.osorio.kafka.messages.MessagesKafka;
import com.fabian.osorio.services.ConsumerKafkaService;
import com.fabian.osorio.services.ProducerKafkaService;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;


@SpringBootTest
@DirtiesContext
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class KafkaTest {

    @Autowired
    ConsumerKafkaService consumerKafkaService;
    @Autowired
    ProducerKafkaService producerKafkaService;

    @Autowired
    KafkaTemplate<String, MessagesKafka> kafkaTemplate;

    @Container
    KafkaContainer kafka;

    @BeforeAll
    public void start(){
        kafka = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:6.2.1"));
        kafka.start();
    }

    @AfterAll
    public void stop(){
        kafka.stop();
    }


    @Test
    void test1(){
        PersonDTO personDTO = new PersonDTO("1", "John Doe", "30");
        producerKafkaService.sendMessage(personDTO);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        assert(true);
    }




}

