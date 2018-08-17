package com.cg.customers.service;

import java.util.ArrayList;


import com.cg.customers.Customer;

public interface Service {

	public abstract void addCustomer(Customer customer);
	public abstract ArrayList<Customer> viewAllCustomers();
}
