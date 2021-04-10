package com.JDBC.practice2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
		private static Connection con;
		
		public static Connection getConnection()
		{
			try 
			{
				if(con==null)
				{
					//Class.forName("com.mysql.jdbc.Driver");
					
					String url = "jdbc:mysql://localhost:3306/youtube";
					String username = "root";
					String password = "2802";
					con = DriverManager.getConnection(url, username, password);
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return con;
		}
}
