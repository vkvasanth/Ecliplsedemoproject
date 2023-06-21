package com.jdbcpostgresql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

 public class InsertJdbc {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost:5432/jdbcdemo";
		String userName ="postgres";
		String password ="postgres";
		//int empid=6;
		String query="Update employee2 set salary=? where empid=?";
		Class.forName("org.postgresql.Driver");
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL,userName,password);
			PreparedStatement pt=conn.prepareStatement(query);
			pt.setInt(1,5555);
			pt.setInt(2,4);
			int rows =pt.executeUpdate();
			System.out.println("no of row affected"+rows);
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
