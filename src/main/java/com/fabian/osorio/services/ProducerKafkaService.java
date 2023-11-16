package com.fabian.osorio.services;


import com.fabian.osorio.kafka.TopicNames;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerKafkaService {

    private final KafkaTemplate<String, String> kafkaTemplate;


    public ProducerKafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        kafkaTemplate.send(
                TopicNames.TOPIC_FIRST_TOPIC,
                message
        );
    }
}
