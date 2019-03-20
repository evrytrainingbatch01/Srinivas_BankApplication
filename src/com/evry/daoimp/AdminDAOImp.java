package com.evry.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.evry.dao.AdminDao;
import com.evry.domain.Admin;
import com.evry.domain.Customer;
import com.evry.util.MySqlCon;

public class AdminDAOImp implements AdminDao {
	Connection con = MySqlCon.getConnection();

	public Admin getAdmin(Integer id) {
		ResultSet rs;
		Statement statement = null;
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("select * from admin where id=" + id);
			if (rs.next()) {
				Admin ad = new Admin();
				ad.setId(rs.getInt(1));
				ad.setFirstName(rs.getString(2));
				ad.setLastName(rs.getString(3));
				ad.setAge(rs.getInt(4));
				return ad;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public boolean addCustomer(Customer customer)
	{
		
		 
		 PreparedStatement stmt=null;
		 
		 try {
			 stmt = con.prepareStatement("insert into customer(firstname,lastname,age,city,country,mobileno) VALUES (?, ?, ?, ?, ?, ?)");
		        stmt.setString(1, customer.getFirstName());
		        stmt.setString(2, customer.getLastName());
		        stmt.setInt(3, customer.getAge());
		        stmt.setString(4, customer.getCity());
		        stmt.setString(5, customer.getCountry());
		        stmt.setInt(6, customer.getMobileNo());
		       
		        int i = stmt.executeUpdate();
		      if(i == 1) {
		    	  return true;
		      }
		 }catch (SQLException ex) {
		        ex.printStackTrace();
		 }
		return false;
		
	}
}

