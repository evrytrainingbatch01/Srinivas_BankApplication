package com.evry.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.evry.dao.CustomerDAO;
import com.evry.domain.Admin;
import com.evry.domain.Customer;
import com.evry.util.MySqlCon;

/**
 * @author srinivas.p
 *
 */
public class CustomerDAOImp implements CustomerDAO {
	Connection con = MySqlCon.getConnection();

	public Customer getCustomerDetails(Integer id) {
		ResultSet rs;
		Statement statement = null;
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("select * from customer where id=" + id);
			if (rs.next()) {
				Customer custData = new Customer();
				custData.setId(rs.getInt(1));
				custData.setFirstName(rs.getString(2));
				custData.setLastName(rs.getString(3));
				custData.setAge(rs.getInt(4));
				custData.setCity(rs.getString(5));
				custData.setCountry(rs.getString(6));
				custData.setMobileNo(rs.getInt(7));
				custData.setBalance(rs.getInt(8));
				custData.setPassword(rs.getString(9));
				return custData;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public boolean UpdateCustomerBal(Customer customer, Integer balance) {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("update customer set balance=? where id=?");
			stmt.setInt(1, customer.getId());
			stmt.setInt(2, balance);
			int i = stmt.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}



	@Override
	public Customer loginCustomer(String firstname, String password) {
		Customer customer=null;
		PreparedStatement stmt = null;
		ResultSet rs;
		try {
			stmt = con.prepareStatement("select * from customer where firstname = ? and password = ?");
		stmt.setString(1, firstname);
		stmt.setString(2, password);
		rs= stmt.executeQuery();
		customer =new  Customer();
		if(rs.next()) {
			customer.setActive(rs.getInt("active"));
		}
	}catch (Exception e) {
		e.printStackTrace();
		
	}
		return customer;
	}
	
	@Override
	public boolean UpdateCustomerBal(Integer id, Integer balance) {
		// TODO Auto-generated method stub
		return false;
	}

}
