package com.example.kafka_exam;

import com.example.kafka_exam.kafka.KafkaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KafkaConfig.class)
public class KafkaExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExamApplication.class, args);
    }

}
