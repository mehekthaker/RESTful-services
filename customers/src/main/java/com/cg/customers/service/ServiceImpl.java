package com.cg.customers.service;

import java.util.ArrayList;

import com.cg.customers.Customer;

import com.cg.customers.dao.DaoImpl;

public class ServiceImpl implements Service{
	DaoImpl dao = new DaoImpl();

	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
		
	}

	public ArrayList<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
	}

	
	
}
