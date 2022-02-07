package com.users.service.services;

import com.users.service.entity.DeployedContract;
import com.users.service.repository.DeployedContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeployedContractService {

    @Autowired
    DeployedContractRepository contractRepository;

    public List<DeployedContract> getContracts() {
        return contractRepository.findAll();
    }

    public DeployedContract getContract(String contractID) {
        return contractRepository.findById(contractID).get();
    }


}
