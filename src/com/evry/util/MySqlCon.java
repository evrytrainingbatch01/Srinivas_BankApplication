package com.evry.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class MySqlCon {

	public static Connection getConnection(){
		Connection con = null;
		
		final String path = "jdbc:mysql://localhost:3306/evrytestdb";
		final String uname = "root";
		final String pswd = "root";  

	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		 con=DriverManager.getConnection(path,uname,pswd);  
		}catch(Exception e)
	{
			System.out.println(e);
	}  
	return con;
	}
	
}
