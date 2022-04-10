package com.example.bankBranchLocationAPI.service;

import com.example.bankBranchLocationAPI.model.Bank;
import com.example.bankBranchLocationAPI.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    BankRepository bankRepository;
    //Create Bank
    public Bank createBank(Bank bank){
        return bankRepository.save(bank);
    }
    //Add More Then one bank
    public List<Bank> createBanks(List<Bank> banks){
       return bankRepository.saveAll(banks);
    }
    //Getting all location
    public List<Bank> getAll(){
        return bankRepository.findAll();
    }
}
