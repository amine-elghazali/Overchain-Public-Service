package com.users.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeployedContractsDto {
    public String propertyCode;
    public String contractAddress;
    public String type;
    public String sellerWallet;
    public Float price;
    public String title;
    public String description;
    public String propertyAddress;
}
