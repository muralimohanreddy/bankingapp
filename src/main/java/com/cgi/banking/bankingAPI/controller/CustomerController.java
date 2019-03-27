package com.cgi.banking.bankingAPI.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.banking.bankingAPI.modal.Customer;
import com.cgi.banking.bankingAPI.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@CrossOrigin("*")
	@RequestMapping(value="/addCustomer", method= RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@CrossOrigin("*")
	@RequestMapping( value="/getAllCustomer", method= RequestMethod.GET)
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomers();
	}
	
	@CrossOrigin("*")
	@RequestMapping(value="/getCustomerById/{id}", method= RequestMethod.GET)
	public Customer getCustomerById( @PathParam("id") long  id) {
		return customerService.getCustomerById(id);
	}
	
	@CrossOrigin("*")
	@RequestMapping(value="/deleteCustomerById/{id}", method= RequestMethod.DELETE)
	public void deleteCustomerById( @PathParam("id") long  id) {
		 customerService.deleteCustomerById(id);
	}

}
