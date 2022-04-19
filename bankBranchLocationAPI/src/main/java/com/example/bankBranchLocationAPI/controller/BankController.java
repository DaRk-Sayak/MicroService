package com.example.bankBranchLocationAPI.controller;

import com.example.bankBranchLocationAPI.model.Bank;
import com.example.bankBranchLocationAPI.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bank")
public class BankController {
    @Autowired
    private BankService bankService;
    @PostMapping("/addBank")
    public Bank addBank(@RequestBody Bank bank){return bankService.createBank(bank);}
    @PostMapping("/addBanks")
    public List<Bank> addBanks(@RequestBody List<Bank> banks){
        return bankService.createBanks(banks);
    }
    @GetMapping("/getLocation")
    public List<Bank> getAllBanks(){
        return bankService.getAll();
    }
}
