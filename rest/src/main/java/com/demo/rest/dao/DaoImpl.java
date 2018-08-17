package com.demo.rest.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.demo.rest.pojo.Customer;

@Component
public class DaoImpl implements Dao {
	private static ArrayList<Customer> customerList;
	static {
		customerList = new ArrayList<>();
	}

	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer + "is the new customer");
		customerList.add(customer);
		
	}

	@Override
	public ArrayList<Customer> viewAllCustomers() {
		return customerList;
	}
	
	


	
}
