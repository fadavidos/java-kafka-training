package com.fabian.osorio.services;


import com.fabian.osorio.PersonDTO;
import com.fabian.osorio.kafka.TopicNames;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerKafkaService {

    private final KafkaTemplate<String, PersonDTO> kafkaTemplate;


    public ProducerKafkaService(KafkaTemplate<String, PersonDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(PersonDTO message){
        kafkaTemplate.send(
                TopicNames.TOPIC_FIRST_TOPIC,
                message
        );
    }
}
