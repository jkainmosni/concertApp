package com.coding.school.service;

import com.coding.school.model.Customer;
import com.coding.school.repository.CustomerRepository;
import com.coding.school.repository.HibernateCustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
