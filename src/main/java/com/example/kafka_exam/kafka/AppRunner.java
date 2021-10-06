package com.example.kafka_exam.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final Producer producer;
    private final Consumer consumer;

    @Override
    public void run(ApplicationArguments args) {
        producer.sendMessage();
        consumer.subscribeMessage();
    }

}
