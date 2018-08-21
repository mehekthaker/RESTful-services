package com.cg.customers.service;


import java.util.Collection;

import com.cg.customers.Customer;

public interface Service {

	public abstract void addCustomer(Customer customer);
	public abstract Collection<Customer> viewAllCustomers();
	public abstract void updateCustomer(Customer customer);
	public abstract void deleteCustomer(int customerId);
}
