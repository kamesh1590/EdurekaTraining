package com.edureka.training.session4.BankService.api;

import com.edureka.training.session4.BankService.entities.Customer;
import com.edureka.training.session4.BankService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerApiImpl implements CustomerApi {
    @Autowired
    private CustomerService customerService;

    @Override
    public ResponseEntity<List<Customer>> retrieveCustomer() {
        return ResponseEntity.ok().body(customerService.fetchAll());
    }

    @Override
    public ResponseEntity<Customer> createCustomer(@Valid Customer body) {
        return ResponseEntity.ok().body(customerService.createCustomer(body));
    }

    @Override
    public ResponseEntity<Customer> updateCustomer(@Valid Customer body) {
        return ResponseEntity.ok().body(customerService.updateCustomer(body));
    }
}
