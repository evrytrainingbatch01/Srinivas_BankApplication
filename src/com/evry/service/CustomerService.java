package com.evry.service;

import com.evry.domain.Admin;
import com.evry.domain.Customer;

/**
 * @author srinivas.p
 *
 */
public interface CustomerService {
	public Customer getCustomerDetails(Integer id);

	public boolean UpdateCustomerBal(Customer customer, Integer balance);

	boolean UpdateCustomerBal(Integer balance);
	
	public Customer loginCustomer(String firstname, String password);
}
