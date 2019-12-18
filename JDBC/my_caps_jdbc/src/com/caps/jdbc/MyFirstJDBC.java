package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class MyFirstJDBC {

	public static void main(String[] args, ResultSet rs) {
		Connection conn =null;
		java.sql.Statement stmt=null;
		ResultSet rs1 = null;

		try{//Load the driver

		    Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");


			//get DB connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"user=root&password=root"; //create (ty_cg_nov6) file in mysql

			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection established....");



			//Issue SQL querries via connections
			String query = "SELECT * FROM users_info"; // create (users_info) in mysql
			stmt=conn.createStatement();
			rs= stmt.executeQuery(query); //result Set
			System.out.println("Query issued...");
			System.out.println("**************");




			//Process the results return by sql.....get xxx method....

			while(rs.next()) {
				System.out.println("Userid: "+  rs.getInt("userid"));
				System.out.println("UserName: "+  rs.getString("username"));
				System.out.println("Email: "+  rs.getString("email"));
				System.out.println("***************************");
			}



		}catch(SQLException e) {
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
				if (stmt != null) {
					stmt.close();
				}				}		

			catch(SQLException e) {
				e.printStackTrace();
			}
		}


	}

}	



