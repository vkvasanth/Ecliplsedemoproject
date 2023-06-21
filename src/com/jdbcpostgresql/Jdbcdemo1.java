package com.jdbcpostgresql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;	

public class Jdbcdemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:postgresql://localhost:5432/jdbcdemo";
		String userName="postgres";
		String password="postgres";
		
			Class.forName("org.postgresql.Driver");
			String query= "select *from employee2";
			
			try {
				Connection	conn= DriverManager.getConnection(jdbcURL,userName,password);
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				}
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
	}

}
