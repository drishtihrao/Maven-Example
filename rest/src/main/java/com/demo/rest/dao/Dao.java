package com.demo.rest.dao;

import java.util.ArrayList;

import com.demo.rest.pojo.Customer;

public interface Dao {
	void addCustomer(Customer customer);
	ArrayList<Customer> viewAllCustomers();
}
