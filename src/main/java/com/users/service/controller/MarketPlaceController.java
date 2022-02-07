package com.users.service.controller;


import com.users.service.entity.Contract;
import com.users.service.services.ContractService;
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
    ContractService contractService;

    @GetMapping("properties")
    public ResponseEntity<List<Contract>> getDeployedProperties(){
        List<Contract> deployedContracts = this.contractService.getContracts();
        return ResponseEntity.ok(deployedContracts);
    }
}
