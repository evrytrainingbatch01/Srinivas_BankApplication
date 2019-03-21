package com.evry.serviceimp;

import com.evry.daoimp.CustomerDAOImp;
import com.evry.domain.Customer;
import com.evry.service.CustomerService;

public class CustomerServiceImp implements CustomerService {
	
	CustomerDAOImp custSerImp=new CustomerDAOImp();

	@Override
	public Customer getCustomerDetails(Integer id) {
		return custSerImp.getCustomerDetails(id);
	}

	@Override
	public boolean UpdateCustomerBal(Integer id, Integer balance) {
		// TODO Auto-generated method stub
		return custSerImp.UpdateCustomerBal(id, balance);
	}

	
	

}
