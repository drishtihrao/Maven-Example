package com.demo.rest.service;

import java.util.ArrayList;

import com.demo.rest.pojo.Customer;

public interface Service {
	void addCustomer(Customer customer);
	ArrayList<Customer> viewAllCustomers();
}
