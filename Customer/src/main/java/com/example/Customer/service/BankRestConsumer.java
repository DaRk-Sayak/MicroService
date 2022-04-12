package com.example.Customer.service;

import com.example.Customer.model.Bank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BANK-SERVICE")
public interface BankRestConsumer {
    @GetMapping("/getLocation")
    public List<Bank> getAllBanks();
}
