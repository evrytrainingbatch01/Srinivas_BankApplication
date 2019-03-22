package com.evry.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.evry.dao.AdminDao;
import com.evry.domain.Admin;
import com.evry.domain.Customer;
import com.evry.util.MySqlCon;

/**
 * @author srinivas.p
 *
 */
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

	public boolean addCustomer(Customer customer) {

		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"insert into customer(firstname,lastname,age,city,country,mobileno,balance) values (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, customer.getFirstName());
			stmt.setString(2, customer.getLastName());
			stmt.setInt(3, customer.getAge());
			stmt.setString(4, customer.getCity());
			stmt.setString(5, customer.getCountry());
			stmt.setInt(6, customer.getMobileNo());
			stmt.setInt(7, customer.getBalance());

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
	public boolean delCustomer(Integer id) {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("delete from customer where id = ?");
			stmt.setInt(1, id);
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
	public List<Customer> viewCustomers() {
		ResultSet rs;
		Statement statement = null;
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("select * from customer");
			while (rs.next()) {
				Customer custList = new Customer();
				custList.setId(rs.getInt(1));
				custList.setFirstName(rs.getString(2));
				custList.setLastName(rs.getString(3));
				custList.setAge(rs.getInt(4));
				custList.setCity(rs.getString(5));
				custList.setCountry(rs.getString(6));
				custList.setMobileNo(rs.getInt(7));
				custList.setBalance(rs.getInt(8));
				customerList.add(custList);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return customerList;
	}

}
