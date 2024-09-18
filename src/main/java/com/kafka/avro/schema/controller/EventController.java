package com.kafka.avro.schema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.avro.schema.dto.Employee;
import com.kafka.avro.schema.producer.KafkaAvroProducer;

@RestController
@RequestMapping("/api")
public class EventController {

	@Autowired
	private KafkaAvroProducer producer;

	@PostMapping("/publish")
	public String sendMessage(@RequestBody Employee employee) {
		producer.send(employee);
		return "Message published";
	}

}
