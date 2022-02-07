package com.users.service.listener;

import com.google.gson.Gson;
import com.users.service.entity.DeployedContract;
import com.users.service.repository.DeployedContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaContractListener {

    @Autowired
    DeployedContractRepository deployedContractRepository;

    @KafkaListener(topics = "contract" , groupId = "group")
    void listener(String contractPayload) {
        Gson gson = new Gson();
        DeployedContract contract = gson.fromJson(contractPayload, DeployedContract.class);
        deployedContractRepository.save(contract);
        System.out.println(contract.contractAddress);
    }
}
