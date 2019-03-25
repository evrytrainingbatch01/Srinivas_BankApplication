package com.evry.dao;

import com.evry.domain.Admin;
import com.evry.domain.Customer;

/**
 * @author srinivas.p
 *
 */
public interface CustomerDAO {

	public Customer getCustomerDetails(Integer id);

	public boolean UpdateCustomerBal(Integer id, Integer balance);
	
	public Customer loginCustomer(String firstname, String password);
}
