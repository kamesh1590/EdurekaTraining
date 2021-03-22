package com.edureka.training.session4.BankService.service;

import com.edureka.training.session4.BankService.entities.Customer;
import com.edureka.training.session4.BankService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EntityManager em;

    public List<Customer> fetchAll() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        Customer customer1 = customerRepository.findById(customer.getId()).orElse(null);

        em.merge(customer);

        return customer1;
    }
}
