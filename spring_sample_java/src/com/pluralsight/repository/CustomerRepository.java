package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Dev on 23/09/2015.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
