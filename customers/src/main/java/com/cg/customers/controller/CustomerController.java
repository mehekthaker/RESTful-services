package com.cg.customers.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customers.Customer;
import com.cg.customers.service.ServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private ServiceImpl service; 
	
	@RequestMapping(value="/customer/add", method=RequestMethod.POST, consumes="application/json")
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.GET, produces=MediaType.ALL_VALUE)
	public Collection<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
		
	}
	
	@RequestMapping(value="/customer/update", method=RequestMethod.PUT, consumes="application/json")
	public void updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}
	
	@RequestMapping(value="/customer/delete", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteCustomer(@RequestParam(value="customerId")int customerId) {
		service.deleteCustomer(customerId);
		return new ResponseEntity<String>("Deleted entity", new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getById", method=RequestMethod.GET)
	public Resource<Customer> getById(int customerId){
		Resource<Customer> resource = null;
		for(Customer customer: service.viewAllCustomers()) {
			if(customer.getCustomerId() == customerId) {
				resource = new Resource<Customer>(customer);
			break;
			}
		}
		ControllerLinkBuilder link = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).viewAllCustomers());
		resource.add(link.withRel("All-Customers"));
		resource.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).deleteCustomer(customerId)).withRel("Update-this-customer"));
		return resource;
		
	}

}
