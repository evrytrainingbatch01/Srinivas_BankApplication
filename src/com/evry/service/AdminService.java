package com.evry.service;

import java.util.List;

import com.evry.domain.Admin;
import com.evry.domain.Customer;

public interface AdminService {
	 public Admin getAdmin(Integer id);
	 public boolean addCustomer(Customer customer);
	 public boolean delCustomer(Integer id);
	 public List<Customer> viewCustomers();
}
