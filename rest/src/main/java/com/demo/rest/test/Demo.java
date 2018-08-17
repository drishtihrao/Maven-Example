package com.demo.rest.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.pojo.Customer;
import com.demo.rest.service.ServiceImpl;

@RestController
@Component
public class Demo {

	@Autowired
	ServiceImpl service; //= new ServiceImpl();

	@RequestMapping(value = "/customer/add", method = RequestMethod.PUT)
	public void addCustomer(Customer customer) {
		service.addCustomer(customer);
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ArrayList<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
	}

}
