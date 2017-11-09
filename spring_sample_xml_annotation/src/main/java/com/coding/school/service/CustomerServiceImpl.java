package com.coding.school.service;

import com.coding.school.model.Customer;
import com.coding.school.repository.CustomerRepository;
import com.coding.school.repository.HibernateCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;
    /*
    public CustomerServiceImpl() {

    }
    //@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Im Using Constructor Injection");
    }
    */
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Im Using Setter Injection");
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
