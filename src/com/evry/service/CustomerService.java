package com.evry.service;

import com.evry.domain.Customer;

public interface CustomerService {
	public Customer getCustomerDetails(Integer id);
	public boolean UpdateCustomerBal(Integer id,Integer balance);
}
