package com.evry.daoimp;
/*package com.evry.daoimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.evry.dao.UserDAO;
import com.evry.domain.Customer;
import com.evry.util.MySqlCon;

public class UserDAOImp implements UserDAO{
	Connection con = MySqlCon.getConnection();

	// GET ALL ADMINS
	public Set<Customer> getAllAdmins() {

		Set<Customer> setOfAdmins = new HashSet<>();

		String sqlQueryString = "select * from customer";
		ResultSet rs = null;
		Statement statement = null;
		try {
			statement = con.createStatement();
			rs = statement.executeQuery(sqlQueryString);
			while (rs.next()) {
				Customer cus = new Customer();
				admin.setId(rs.getInt(1));
				admin.setFirstname(rs.getString(2));
				admin.setLastname(rs.getString(3));
				admin.setAge(rs.getInt(4));
				setOfAdmins.add(admin);
				// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
				// + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return setOfAdmins;
	}
}
*/