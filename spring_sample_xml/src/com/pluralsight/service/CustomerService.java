package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Dev on 23/09/2015.
 */
public interface CustomerService {
    List<Customer> findAll();
}
