package com.example.Customer.controller;

import com.example.Customer.model.Bank;
import com.example.Customer.service.BankRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private BankRestConsumer bankRestConsumer;
    @GetMapping("/allBanks")
    public List<Bank> getAll(){
        return bankRestConsumer.getAll();
    }
}
