package com.cg.customers.dao;

import java.util.ArrayList;

import com.cg.customers.Customer;

public interface Dao {
	public abstract void addCustomer(Customer customer);
	public abstract ArrayList<Customer> viewAllCustomers();
}
