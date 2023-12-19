package com.example.praticekafka.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    @Value("${kafka.hello.topic}")
    private String topic;

    @Value("${kafka.hello.key}")
    private String helloKey;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send(topic, helloKey, message);
    }
}
