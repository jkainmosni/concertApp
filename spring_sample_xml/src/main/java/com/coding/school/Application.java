package com.coding.school;

import com.coding.school.service.CustomerService;
import com.coding.school.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //--Old Practice
        //CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println("Customer's first name is: " + customerService.findAll().get(0).getFirstname());
        System.out.println("Customer's last name is: " + customerService.findAll().get(0).getLastname());

    }

}
