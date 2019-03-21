package com.evry.dao;

import com.evry.domain.Customer;

public interface CustomerDAO {
	public Customer getCustomerDetails(Integer id);
	public boolean UpdateCustomerBal(Integer id,Integer balance);
}
