package com.JDBC.practice2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{		
			Connection c = ConnectionProvider.getConnection();
			Class.forName("com.mysql.cj.jdbc.Driver");

			String q = "select * from table1"; 

			//get the Prepared statement object
			Statement stmt = c.createStatement();

			ResultSet set = stmt.executeQuery(q); // result set is by default non updatable and cursor moves only forward

			while(set.next())
			{
				int id = set.getInt(1);//coloumn no. or name
				String name = set.getString(2);
				String city = set.getString(3);
				
				System.out.println(id +" "+name+" "+city);
			}
			System.out.println("done...");
			c.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
