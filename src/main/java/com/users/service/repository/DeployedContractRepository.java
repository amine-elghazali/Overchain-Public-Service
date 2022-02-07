package com.users.service.repository;

import com.users.service.entity.DeployedContract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeployedContractRepository extends MongoRepository<DeployedContract, String> {

}
