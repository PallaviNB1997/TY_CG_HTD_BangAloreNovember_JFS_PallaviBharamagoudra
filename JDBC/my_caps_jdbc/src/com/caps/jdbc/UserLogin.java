package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
public static void main(String[] args) {
	//Load Driver
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver loaded....");
		
		
		//Get DB connection via driver
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		
		System.out.println("Enter user name and password");
		String dbUser = sc.nextLine();
		String dbPass = sc.nextLine();
		
		DriverManager.getConnection(dbUrl, dbUser, dbPass);
		System.out.println("Connection establish....");
		
		
		//Issue Sql Querry via connection
		
		//for static query
		
//		String query = "SELECT * FROM users_info" + 
//		"where userid=1001 AND password='pallavipavan' ";
//		 stmt = conn.createStatement();
//		 rs = stmt.executeQuery(query);
		
		
		//for dynamic query
		
		String query = "SELECT * FROM users_info where userid=? AND password=? ";
			 pstmt = conn.prepareStatement(query);
			 
			 
			 System.out.println("enter userid...");
			 pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			 System.out.println("enter password..");
			 pstmt.setString(2, sc.nextLine());
				 rs = pstmt.executeQuery();
		
		
		
		 System.out.println("Querry issued and executed......");
		System.out.println("____________________********___________");
		
		//Process the result returned..
		if(rs.next()) {
			System.out.println("Userid: "+  rs.getInt(1));
			System.out.println("UserName: "+  rs.getInt(2));
			System.out.println("Email: "+  rs.getInt(3));
			System.out.println("***************************");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
		if (conn != null) {
			conn.close();
		}	}		
		
		catch(SQLException e) {
			e.printStackTrace();
			}
		try {
			if (pstmt != null) {
				pstmt.close();
			}				}		
			
			catch(SQLException e) {
				e.printStackTrace();
				}
			}
}
}
