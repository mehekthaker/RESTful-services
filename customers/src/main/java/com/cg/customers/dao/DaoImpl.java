package com.cg.customers.dao;

import java.util.ArrayList;

import com.cg.customers.Customer;

public class DaoImpl implements Dao{

	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
		
	}

	public ArrayList<Customer> viewAllCustomers() {
		return customerList;
	}

}
