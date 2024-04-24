package com.example.restservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.kafkaIntegration.KafkaIntegration;
import com.example.restservice.types.CustomEventBody;

@RestController
public class CustomEventController {

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/newCustomEvent")
	public void produceCustomEventToKafka(@RequestBody CustomEventBody customEventBody) {
		String bootstrapServers = "127.0.0.1:9092";

		String topic = "quickstart-events";

        KafkaIntegration kafkaIntegration = new KafkaIntegration(bootstrapServers);
		
        kafkaIntegration.produceToTopic(topic, customEventBody);
		
	}
}
