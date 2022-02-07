package com.users.service.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaContractListener {

    @KafkaListener(topics = "contract" , groupId = "group")
    void listener(String data) {
        System.out.println(data);
    }
}
