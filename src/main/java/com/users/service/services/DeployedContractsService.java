package com.users.service.services;

import com.users.service.dto.DeployedContractsDto;
import com.users.service.entity.Contract;
import com.users.service.entity.Property;
import com.users.service.repository.ContractRepository;
import com.users.service.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DeployedContractsService {
    @Autowired
    ContractRepository contractRepository;

    @Autowired
    PropertyRepository propertyRepository;

    public List<DeployedContractsDto> getDeployedContarcts(){
        List<Contract> contracts = this.contractRepository.findByIsDeployedIsTrue();

        List<DeployedContractsDto> deployedContracts = new ArrayList<>();

        for (Contract contract : contracts
             ) {
            //System.out.println(this.propertyRepository.findById(contract.getPropertyId()).get()+"\n");
            Property propertyDeployed = this.propertyRepository.findById(contract.getPropertyId()).get();

            deployedContracts.add(
                    new DeployedContractsDto(
                            propertyDeployed.getCode(),
                            contract.getContractAddress(),
                            contract.getType().toString(),
                            contract.getSellerWallet(),
                            contract.getPrice(),
                            propertyDeployed.getTitle(),
                            propertyDeployed.getDescription(),
                            propertyDeployed.getAddress()
                    )
            );
        }
        return deployedContracts;
    }
}
