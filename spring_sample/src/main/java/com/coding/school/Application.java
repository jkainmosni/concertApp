package com.coding.school;

import com.coding.school.service.CustomerService;
import com.coding.school.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();

        System.out.println("Customer's first name is: " + customerService.findAll().get(0).getFirstname());
        System.out.println("Customer's last name is: " + customerService.findAll().get(0).getLastname());

    }

}
