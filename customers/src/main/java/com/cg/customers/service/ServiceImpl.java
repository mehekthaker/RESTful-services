package com.cg.customers.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customers.Customer;
import com.cg.customers.dao.DaoImpl;

@Component
public class ServiceImpl implements Service{
	
	@Autowired
	private DaoImpl dao;

	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
		
	}

	public Collection<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
	}


	public void updateCustomer(Customer customer) {
		 dao.updateCustomer(customer);
		return;
	}

	public void deleteCustomer(int customerId) {
		dao.deleteCustomer(customerId);
		
	}

	
	
}
