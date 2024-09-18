package com.kafka.avro.schema.producer;

import java.util.concurrent.CompletableFuture;

import org.apache.kafka.common.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.kafka.avro.schema.dto.Employee;

@Service
public class KafkaAvroProducer {

	@Value("${app.kafka.topic.name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void send(Employee employee) {
		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topicName,
				Uuid.randomUuid().toString(), employee);
		future.whenComplete((result, ex) -> {
			if (ex == null) {
				System.out.println(
						"Sent message=[" + employee + "] with offset=[" + result.getRecordMetadata().offset() + "]");
			} else {
				System.out.println("Unable to send message=[" + employee + "] due to : " + ex.getLocalizedMessage());
			}
		});
	}

}
