package com.JDBC.practice1;

//we already created images table in database
//blob binary large object can save upto 65 kb of data
// data more than that should be svad in file and should
// be opened with other interface like swing etc...
// later we will change it to mediumblob or longblob

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageSave {
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
			String q = "insert into images(pic) values(?)";

			// get the Prepared statement object
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the values(image) to query
			FileInputStream fis = new FileInputStream("mypic.jpg");
			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();

			System.out.println("image inserted...");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
