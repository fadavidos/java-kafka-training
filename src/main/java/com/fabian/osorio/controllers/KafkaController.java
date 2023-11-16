package com.fabian.osorio.controllers;

import com.fabian.osorio.PersonDTO;
import com.fabian.osorio.services.ProducerKafkaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final ProducerKafkaService producerKafkaService;

    public KafkaController(ProducerKafkaService producerKafkaService) {
        this.producerKafkaService = producerKafkaService;
    }

    @PostMapping("/publish")
    public void publishMessage(@RequestBody PersonDTO message){
        producerKafkaService.sendMessage(message);
    }
}
