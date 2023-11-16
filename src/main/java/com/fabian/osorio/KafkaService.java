package com.fabian.osorio;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @KafkaListener(topics = "my_test", groupId = "my_group_id")
    public void listenTopic(String message){
        System.out.println(String.format("KafkaService: the listen message is: %s", message));
    }
}
