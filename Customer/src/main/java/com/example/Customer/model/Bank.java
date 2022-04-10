package com.example.Customer.model;

import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message="The Bank Name Should Not be Empty")
    private String name;
    @NotNull(message="The Bank Address Should Not be Empty")
    private String address;
    @NotNull(message="The Pine Code Should Not be Empty")
    private int pineCode;
}
