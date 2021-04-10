package com.JDBC.practice2;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{		
			Connection c = ConnectionProvider.getConnection();
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			String q = "insert into images(pic) values(?)"; 

			//get the Prepared statement object
			PreparedStatement pstmt = c.prepareStatement(q);

			JFileChooser jfc = new JFileChooser(); ///component of swing that provides dialog box for choosing file
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			

			//	set the values(image) to query
			FileInputStream fis = new FileInputStream(file);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();

			System.out.println("image inserted...");
			JOptionPane.showMessageDialog(null,"Success...");
			c.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
