package com.edureka.training.session4.BankService.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bank_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
}
