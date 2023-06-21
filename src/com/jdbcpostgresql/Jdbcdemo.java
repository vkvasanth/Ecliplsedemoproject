package com.jdbcpostgresql;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcdemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stubuserName
		String jdbcURL ="jdbc:postgresql://localhost:5432/jdbcdemo";
		String userName="postgres";
		String password ="postgres";
		Class.forName("org.postgresql.Driver");
		java.sql.Connection conn=null;
		try {
			conn=DriverManager.getConnection(jdbcURL,userName,password);
			if(conn!=null)
				System.out.println("connected successful");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection it coming error");
			e.printStackTrace();
		}
		

	}

}
