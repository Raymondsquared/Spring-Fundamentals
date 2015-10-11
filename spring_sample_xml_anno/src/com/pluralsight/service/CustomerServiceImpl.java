package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl()
    {

    }

    //@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository)
    {
        System.out.println("we are using construction injection");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we are using setter injection");

        this.customerRepository = customerRepository;
    }


    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
