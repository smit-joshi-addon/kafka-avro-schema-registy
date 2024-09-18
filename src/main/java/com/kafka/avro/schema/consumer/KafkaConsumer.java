package com.kafka.avro.schema.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.avro.schema.dto.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "${app.kafka.topic.name}")
	public void read(ConsumerRecord<String, Employee> record) {
		String key = record.key();
		Employee value = record.value();
		log.info("Avro message received for key : " + key + " value : " + value);
	}

}
