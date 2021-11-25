package com.controller;



import com.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

    @Autowired
    Producer producer;

    @GetMapping(value="/post")
    public String sendMessage(@RequestParam("msg") String msg) {

        producer.publishToTopic(msg);
        return "Hello i m chiru and this is my spring boot integrated with kafka assignment";
    }
}