package com.fabian.osorio.services;


import com.fabian.osorio.PersonDTO;
import com.fabian.osorio.kafka.TopicNames;
import com.fabian.osorio.kafka.messages.MessagesKafka;
import com.fabian.osorio.kafka.messages.PersonMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerKafkaService {

    private final KafkaTemplate<String, MessagesKafka> kafkaTemplate;


    public ProducerKafkaService(KafkaTemplate<String, MessagesKafka> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(PersonDTO message){
        kafkaTemplate.send(
                TopicNames.TOPIC_FIRST_TOPIC,
                new PersonMessage(message.id(), message.name(), message.age())
        );
    }
}
