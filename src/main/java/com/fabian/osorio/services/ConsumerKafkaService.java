package com.fabian.osorio.services;

import com.fabian.osorio.kafka.TopicNames;
import com.fabian.osorio.kafka.messages.CarMessage;
import com.fabian.osorio.kafka.messages.PersonMessage;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(id = "my_group_id", topics = TopicNames.TOPIC_FIRST_TOPIC)
public class ConsumerKafkaService {

    @KafkaHandler
    public void listenTopic(CarMessage message){
        System.out.printf("ConsumerKafkaService.CarMessage: the listen message is: %s%n", message);
    }
    @KafkaHandler
    public void listenTopic(PersonMessage message){
        System.out.printf("ConsumerKafkaService.PersonMessage: the listen message is: %s%n", message);
    }
}
