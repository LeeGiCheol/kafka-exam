package com.example.kafka_exam.kafka;


import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaConfig kafkaConfig;

    public void sendMessage() {
        Properties configs = new Properties();
        configs.put(kafkaConfig.getBootstrapServersKey(), kafkaConfig.getBootstrapServers());
        configs.put(kafkaConfig.getKeySerializerKey(), kafkaConfig.getKeySerializer());
        configs.put(kafkaConfig.getValueSerializerKey(), kafkaConfig.getValueSerializer());

        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(configs);

        // kafkatest topic에 value를 전송
        ProducerRecord<String, String> record = new ProducerRecord<>(kafkaConfig.getTopic(), "테스트입니다.");

        kafkaProducer.send(record);
        kafkaProducer.close();
    }

}
