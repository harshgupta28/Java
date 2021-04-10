package com.JDBC.practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {

	public static void main(String[] args) {
		
		try 
		{		
			Connection c = ConnectionProvider.getConnection();
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			String q = "update table1 set tName=? , tCity=? where tId=?"; 
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter id : ");
			Integer id = Integer.parseInt(br.readLine());
			System.out.println("Enter new name : ");
			String name = br.readLine();
			System.out.println("Enter new city : ");
			String city = br.readLine();

			
			//get the Prepared statement object
			PreparedStatement pstmt = c.prepareStatement(q);
			
			//set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
				
			pstmt.executeUpdate();
			System.out.println("done.....");
			c.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
