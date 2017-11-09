package com.coding.school.repository;

import com.coding.school.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepository implements CustomerRepository {

    public List<Customer> findAll() {

        //    This is a stub Repository will return a fixed List of one customer
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();

        customer.setFirstname("Dimitris");
        customer.setLastname("Koutsodimos");

        customers.add(customer);

        return customers;
    }

}
