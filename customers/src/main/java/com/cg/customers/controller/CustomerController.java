package com.cg.customers.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customers.Customer;
import com.cg.customers.service.ServiceImpl;

@RestController
public class CustomerController {
	
	ServiceImpl service = new ServiceImpl();
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addCustomer(String customerName, long contactNumber, String dateOfBirth, String email) {
		Customer customer1 = new Customer(customerName, contactNumber, dateOfBirth, email);
		service.addCustomer(customer1);
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ArrayList<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
		
	}

}
