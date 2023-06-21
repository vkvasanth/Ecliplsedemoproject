package com.jdbcpostgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Connection {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost:5432/jdbcdemo";
		String userName ="postgres";
		String password ="postgres";
		int empid=6;
		String ename="varun";
		int salary =50000;
		String job_desc="engineer";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter empid");
		int empIid=sc.nextInt();
		System.out.println("enter ename");
		String eName=sc.nextLine();
		System.out.println("enter salary");
		int Salary=sc.nextInt();
		System.out.println("enter jobdesc");
		String Job_desc=sc.nextLine();
		String query="insert into employee2 values (?,?,?,?)";
		Class.forName("org.postgresql.Driver");
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL,userName,password);
			PreparedStatement pt=conn.prepareStatement(query);
			pt.setInt(1,empid);
			pt.setString(2,ename);
			pt.setInt(3,salary);
			pt.setString(4,job_desc);
			int rows =pt.executeUpdate();
			System.out.println("no of row affected"+rows);
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			
			
		
		

	}

}
