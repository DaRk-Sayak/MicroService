package com.example.bankBranchLocationAPI;

import com.example.bankBranchLocationAPI.model.Bank;
import com.example.bankBranchLocationAPI.repository.BankRepository;
import com.example.bankBranchLocationAPI.service.BankService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit.jupiter.SpringExtension;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BankBranchLocationApiApplicationTests {
	@Autowired
	private BankService service;
	@MockBean
	private BankRepository repository;
	@Test
	public void getBanksTest(){
		when(repository.findAll()).thenReturn((List<Bank>) Stream.of(new Bank(3,"Axis","YTRE",700090),new Bank(4,"Hdfc","Iuyt",700080)).collect(Collectors.toList()));
		assertEquals(2,service.getAll().size());
	}
	@Test
	public void addBank(){
		Bank bank=new Bank(999,"HSBC","Add",800090);
		when(repository.save(bank)).thenReturn(bank);
		assertEquals(bank,service.createBank(bank));
	}
}
