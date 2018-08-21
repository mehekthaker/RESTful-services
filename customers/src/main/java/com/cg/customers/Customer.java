package com.cg.customers;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

/**
 * 
 * @author Satyen Singh
 *
 *Maintaining customer details of money money bank
 */
@XmlRootElement
public class Customer extends ResourceSupport{
	private int customerId;
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String dateOfBirth;

	/*private static int custId;
	
	static {
		custId = 200;
	}
	
	this.customerId = custId;*/
	
		
/*	public Customer(int customerId, String customerName, long contactNumber, String dateOfBirth, String email) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailId = email;
	}*/
	
	public Customer() {
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + "]";
	}


	
}
