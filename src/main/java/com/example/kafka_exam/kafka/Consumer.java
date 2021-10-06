package com.example.kafka_exam.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

    private final KafkaConfig kafkaConfig;

    public void subscribeMessage() {
        Properties configs = new Properties();
        configs.put(kafkaConfig.getBootstrapServersKey(), kafkaConfig.getBootstrapServers());
        configs.put(kafkaConfig.getGroupIdKey(), kafkaConfig.getGroupId());
        configs.put(kafkaConfig.getKeyDeserializerKey(), kafkaConfig.getKeyDeserializer());
        configs.put(kafkaConfig.getValueDeserializerKey(), kafkaConfig.getValueDeserializer());

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(configs);

        consumer.subscribe(List.of(kafkaConfig.getTopic()));

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(500));

            for (ConsumerRecord<String, String> record : records) {
                log.info("record.value() : {}", record.value());
            }
        }
    }

}
