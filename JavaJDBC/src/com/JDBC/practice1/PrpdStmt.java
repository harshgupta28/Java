package com.JDBC.practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrpdStmt {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "0000";
			Connection con = DriverManager.getConnection(url, username, password);

			// create a query
			String q = "insert into table1(tName,tCity) values(?,?)";

			// get the Prepared statement object
			PreparedStatement pstmt = con.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name : ");
			String name = br.readLine();
			System.out.println("Enter city : ");
			String city = br.readLine();

			// set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();

			System.out.println("inserted...");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
