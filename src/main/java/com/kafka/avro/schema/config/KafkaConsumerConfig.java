package com.kafka.avro.schema.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumerConfig {

//	Map<String, Object> consumerConfig() {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
//		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//		props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.kafka.avro.schema.dto");
//		props.put("spring.kafka.consumer.properties.schema.registry.url", "http://127.0.0.1:8081");
//		props.put("spring.kafka.consumer.specific.avro.reader", "true");
//
//		return props;
//	}
//
//	@Bean
//	ConsumerFactory<String, Object> consumerFactory() {
//		return new DefaultKafkaConsumerFactory<>(consumerConfig());
//	}
//
//	@Bean
//	KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}
}
