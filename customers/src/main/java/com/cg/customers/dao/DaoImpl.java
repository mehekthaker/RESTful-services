package com.cg.customers.dao;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cg.customers.Customer;

@Component
public class DaoImpl implements Dao {

	private Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();

	public void addCustomer(Customer customer) {
		System.out.println(customer);
		customerMap.put(customer.getCustomerId(), customer);

	}

	public Collection<Customer> viewAllCustomers() {
		return customerMap.values();
	}

	public void deleteCustomer(int customerId) {
		for (Customer cust : customerMap.values()) {
			if (cust.getCustomerId() == customerId)
				customerMap.remove(cust.getCustomerId());
		}

	}

	public void updateCustomer(Customer customer) {
		for (Customer cus : customerMap.values())
		{
			
			if (cus.getCustomerId() == customer.getCustomerId())
			{
				customerMap.put(customer.getCustomerId(), customer);
			
			}
			
		}
	}

	

}
