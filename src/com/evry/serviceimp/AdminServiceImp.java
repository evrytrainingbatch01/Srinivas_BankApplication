package com.evry.serviceimp;

import java.util.List;

import com.evry.daoimp.AdminDAOImp;
import com.evry.domain.Admin;
import com.evry.domain.Customer;
import com.evry.service.AdminService;

/**
 * @author srinivas.p
 *
 */
public class AdminServiceImp implements AdminService {

	AdminDAOImp adi = new AdminDAOImp();

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

	@Override
	public boolean delCustomer(Integer id) {
		// TODO Auto-generated method stub
		return adi.delCustomer(id);
	}

	@Override
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		return adi.viewCustomers();
	}

	@Override
	public Admin loginAdmin(String firstname, String password) {
		// TODO Auto-generated method stub
		return adi.loginAdmin(firstname, password);
	}

}
