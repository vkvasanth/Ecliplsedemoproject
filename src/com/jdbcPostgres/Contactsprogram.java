package com.jdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Contactsprogram {
	public static void main(String[] args) {
		String jdbcURL="jdbc:postgresql://localhost:5432/shopme";
		String username = "postgres";
		String password= "postgres";
		Connection conn;
		try {
			conn = DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("connected successfull");
			String sql ="insert into contacts(first_name,last_name,email)"+"values('Ravi','kumar','ravi2202@gmail.com')";
			Statement st=conn.createStatement();
			int row= st.executeUpdate(sql);
			if(row>0) {
				System.out.println("a new contact has been inserted");
			}
			conn.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erroe in cpnnecting to postgreSQL server");
			e.printStackTrace();
		}
		

	}
	}
