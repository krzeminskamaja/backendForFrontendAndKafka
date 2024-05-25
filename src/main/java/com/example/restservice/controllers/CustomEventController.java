package com.example.restservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.kafkaIntegration.KafkaIntegration;
import com.example.restservice.types.CustomEventBody;
//import edu.ucsd.sccn.LSL;

@RestController
public class CustomEventController {

	//KafkaIntegration kafkaIntegration = new KafkaIntegration("127.0.0.1:9092");

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/newCustomEvent")
	public void produceCustomEventToKafka(@RequestBody CustomEventBody customEventBody) {
		
       // kafkaIntegration.produceToTopic(customEventBody.topicName, customEventBody);
	/*   System.out.println("Creating a new StreamInfo...");
	   LSL.StreamInfo info = new LSL.StreamInfo("BioSemi","EEG",8,100,LSL.ChannelFormat.float32,"myuid324457");

	   System.out.println("Creating an outlet...");
	   LSL.StreamOutlet outlet = new LSL.StreamOutlet(info);
	   
	   System.out.println("Sending data...");
	   float[] sample = new float[8];
	   for (int t=0;t<100000;t++) {
		   for (int k=0;k<8;k++)
			   sample[k] = (float)Math.random()*50-25;
		   outlet.push_sample(sample);
		   Thread.sleep(10);
	   }
	   
	   outlet.close();
	   info.destroy(); */
	}
}
