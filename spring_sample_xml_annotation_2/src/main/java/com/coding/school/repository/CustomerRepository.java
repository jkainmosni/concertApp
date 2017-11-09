package com.coding.school.repository;

import com.coding.school.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
