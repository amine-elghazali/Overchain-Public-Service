package com.users.service.services;

import com.users.service.entity.Contract;
import com.users.service.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContractService {

    @Autowired
    ContractRepository contractRepository;

    public List<Contract> getContracts() {
        return contractRepository.findAll();
    }

    public Contract getContract(String contractID) {
        return contractRepository.findById(contractID).get();
    }


}
