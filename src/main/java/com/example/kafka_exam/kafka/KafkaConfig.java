package com.example.kafka_exam.kafka;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("kafka")
public class KafkaConfig {

    private String topic;

    private String bootstrapServers;

    private String keySerializer;

    private String valueSerializer;

    private String keyDeserializer;

    private String valueDeserializer;

    private String groupId;


    private String bootstrapServersKey;

    private String keySerializerKey;

    private String valueSerializerKey;

    private String keyDeserializerKey;

    private String valueDeserializerKey;

    private String groupIdKey;


}
