package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {

		Connection conn=null;
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstmt=null;

		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--driver loaded---");

			//get Db Connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and Password");
			String user=sc.nextLine();
			String password=sc.nextLine();				
			conn=DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection established....");



			//Issue sql querries via connnection

			String query="update users_info set email = ? where userid=? and password=?";
			pstmt = conn.prepareStatement(query);

			System.out.println("------enter userid---------");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("enter the new email--");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password to update");
			pstmt.setString(3, sc.nextLine());


			int count = pstmt.executeUpdate();
			System.out.println("Query issued");



			//proces the results returned
			if(count>0)
			{
				System.out.println("query ok"+count+"rows affected");
			}		
			else {
				System.err.println("something went wrong");
			}
			sc.close();


		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(pstmt!=null)
					pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}



	// closed the jdbc objects
}
