package com.users.service.controller;


import com.users.service.dto.DeployedContractsDto;
import com.users.service.entity.Contract;
import com.users.service.services.DeployedContractsService;
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
    DeployedContractsService deployedContractsService;

    @GetMapping("properties")
    public ResponseEntity<List<DeployedContractsDto>> getDeployedProperties(){
        List<DeployedContractsDto> deployedContracts = this.deployedContractsService.getDeployedContarcts();
        return ResponseEntity.ok(deployedContracts);
    }
}
