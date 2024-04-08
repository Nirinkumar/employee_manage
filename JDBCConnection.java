package com.employeemanage;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	
	static Connection conn;
	public static Connection createDBConnection(){
		
		try {
			//load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get connection
			String url="jdbc:mysql://localhost:3306/employeemanagement";
			String username="root";
			String password="Pnirin@121898";
			conn=DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
