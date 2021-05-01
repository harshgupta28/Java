package com.JDBC.practice1;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating connection
			String url = "jdbc:mysql://localhost:3306/CentralHospital";
			String username = "root";
			String password = "0000";
			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed())
				System.out.println("Connection is still closed");
			else
				System.out.println("Connection Created...");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
