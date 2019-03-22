package com.evry.dao;

import java.util.List;

import com.evry.domain.Admin;
import com.evry.domain.Customer;

/**
 * @author srinivas.p
 *
 */
public interface AdminDao {
	public Admin getAdmin(Integer id);

	public boolean addCustomer(Customer customer);

	public boolean delCustomer(Integer id);

	public List<Customer> viewCustomers();

}
