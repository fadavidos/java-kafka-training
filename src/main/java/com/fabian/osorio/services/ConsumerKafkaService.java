package com.fabian.osorio.services;

import com.fabian.osorio.PersonDTO;
import com.fabian.osorio.kafka.TopicNames;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerKafkaService {

    @KafkaListener(topics = TopicNames.TOPIC_FIRST_TOPIC, groupId = "my_group_id")
    public void listenTopic(PersonDTO message){
        System.out.printf("KafkaService: the listen message is: %s%n", message);
    }
}
