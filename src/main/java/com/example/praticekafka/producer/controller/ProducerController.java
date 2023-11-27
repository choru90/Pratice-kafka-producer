package com.example.praticekafka.producer.controller;

import com.example.praticekafka.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService service;

    @RequestMapping("/publish")
    public String publish(String message){
        service.send(message);
        return "publish message " +message;
    }
}
