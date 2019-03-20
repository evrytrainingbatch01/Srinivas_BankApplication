package com.evry.serviceimp;

import com.evry.daoimp.AdminDAOImp;
import com.evry.domain.Admin;
import com.evry.domain.Customer;
import com.evry.service.AdminService;

public class AdminServiceImp implements AdminService{
	
	
AdminDAOImp adi=new AdminDAOImp();

	@Override
	public Admin getAdmin(Integer id) {
		// TODO Auto-generated method stub
		return adi.getAdmin(id);
	}

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return adi.addCustomer(customer);
	}

}
