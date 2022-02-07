package com.users.service.controller;


import com.users.service.entity.DeployedContract;
import com.users.service.services.DeployedContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/onSale/")
public class MarketPlaceController {

    @Autowired
    DeployedContractService contractService;

    @GetMapping("properties")
    public ResponseEntity<List<DeployedContract>> getDeployedProperties(){
        List<DeployedContract> deployedContracts = this.contractService.getContracts();
        return ResponseEntity.ok(deployedContracts);
    }
}
