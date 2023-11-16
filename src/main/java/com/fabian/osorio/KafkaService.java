package com.fabian.osorio;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @KafkaListener(topics = TopicNames.TOPIC_FIRST_TOPIC, groupId = "my_group_id")
    public void listenTopic(String message){
        System.out.printf("KafkaService: the listen message is: %s%n", message);
    }
}
