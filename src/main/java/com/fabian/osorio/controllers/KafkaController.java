package com.fabian.osorio.controllers;

import com.fabian.osorio.dtos.CarDTO;
import com.fabian.osorio.dtos.PersonDTO;
import com.fabian.osorio.services.ProducerKafkaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/publish")
public class KafkaController {
    private final ProducerKafkaService producerKafkaService;

    public KafkaController(ProducerKafkaService producerKafkaService) {
        this.producerKafkaService = producerKafkaService;
    }

    @PostMapping("/person")
    public void publishPersonMessage(@RequestBody PersonDTO message){
        producerKafkaService.sendMessage(message);
    }

    @PostMapping("/car")
    public void publishCarMessage(@RequestBody CarDTO message){
        producerKafkaService.sendMessage(message);
    }
}
