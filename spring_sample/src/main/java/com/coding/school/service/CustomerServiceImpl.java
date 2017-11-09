package com.coding.school.service;

import com.coding.school.model.Customer;
import com.coding.school.repository.CustomerRepository;
import com.coding.school.repository.HibernateCustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository =
            new HibernateCustomerRepository();

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
