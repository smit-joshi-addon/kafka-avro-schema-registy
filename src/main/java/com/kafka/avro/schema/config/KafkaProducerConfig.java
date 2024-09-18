package com.kafka.avro.schema.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

	@Value("${app.kafka.topic.name}")
	private String topicName;

	@Bean
	NewTopic craeteTopic() {
		return new NewTopic(topicName, 3, (short) 1);
	}

//	@Bean
//	Map<String, Object> producerConfig() {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
//		props.put("spring.kafka.producer.properties.schema.registry.url", "http://127.0.0.1:8081");
//		return props;
//	}
//
//	@Bean
//	ProducerFactory<String, Object> producerFactory() {
//		return new DefaultKafkaProducerFactory<>(producerConfig());
//	}
//
//	@Bean
//	KafkaTemplate<String, Object> kafkaTemplate() {
//		return new KafkaTemplate<>(producerFactory());
//	}
}
