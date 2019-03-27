package com.cgi.banking.bankingAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.banking.bankingAPI.modal.Customer;
import com.cgi.banking.bankingAPI.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;

	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}
	
	public Customer getCustomerById(long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteCustomerById(long id) {
		repo.deleteById(id);
	}
	
	public Customer updateCustomer(long id, Customer customer) {
		Customer obj= getCustomerById(id);
		obj = customer;
		return repo.save(obj);
	}
	
	public Customer getCustomerByMobileNo(long no) {
		return repo.findByMobileNo(no);
	}
}
