package com.JDBC.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "2802";
			
			// opening connection
			Connection con = DriverManager.getConnection(url, username, password);

			// creating query
			String q = "create table table1(tId int(20) primary key auto_increment , tName varchar(200) not null , tCity varchar(400))";

			// creating Statement
			Statement stmt = con.createStatement();

			stmt.executeUpdate(q);

			System.out.println("Table Created in database...");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}