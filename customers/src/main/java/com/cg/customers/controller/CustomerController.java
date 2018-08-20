package com.cg.customers.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customers.Customer;
import com.cg.customers.service.ServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private ServiceImpl service; 
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public void addCustomer(int customerId, String customerName, long contactNumber, String dateOfBirth, String email) {
		Customer customer1 = new Customer(customerId, customerName, contactNumber, dateOfBirth, email);
		service.addCustomer(customer1);
	}
	
	@RequestMapping("/customer")
	public ArrayList<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
		
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.PUT, consumes="application/json")
	public void updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.DELETE, consumes="application/json")
	public void deleteCustomer(@RequestBody Customer customer) {
		service.deleteCustomer(customer);
	}

}
