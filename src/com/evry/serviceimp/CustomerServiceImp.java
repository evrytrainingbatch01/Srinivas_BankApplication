package com.evry.serviceimp;

import com.evry.daoimp.CustomerDAOImp;
import com.evry.domain.Customer;
import com.evry.service.CustomerService;

/**
 * @author srinivas.p
 *
 */
public class CustomerServiceImp implements CustomerService {

	CustomerDAOImp custSerImp = new CustomerDAOImp();

	@Override
	public Customer getCustomerDetails(Integer id) {
		return custSerImp.getCustomerDetails(id);
	}

	@Override
	public boolean UpdateCustomerBal(Customer customer, Integer balance) {
		// TODO Auto-generated method stub
		return custSerImp.UpdateCustomerBal(customer, balance);
	}

	@Override
	public boolean UpdateCustomerBal(Integer balance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer loginCustomer(String firstname, String password) {
		// TODO Auto-generated method stub
		return custSerImp.loginCustomer(firstname, password);
	}

}
