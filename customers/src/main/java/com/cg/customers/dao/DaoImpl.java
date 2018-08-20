package com.cg.customers.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.cg.customers.Customer;

@Component
public class DaoImpl implements Dao {

	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	public void addCustomer(Customer customer) {
		customerList.add(customer);

	}

	public ArrayList<Customer> viewAllCustomers() {
		return customerList;
	}

	public void deleteCustomer(Customer customer) {
		for (Customer cust : customerList) {
			if (cust.getCustomerId() == customer.getCustomerId())
				customerList.remove(customer);
		}

	}

	public void updateCustomer(Customer customer) {
		for (Customer cus : customerList)
		{
			
			if (cus.getCustomerId() == customer.getCustomerId())
			{
				customerList.remove(cus);
				customerList.add(customer);
				break;
			}
			
		}
	}

	

}
