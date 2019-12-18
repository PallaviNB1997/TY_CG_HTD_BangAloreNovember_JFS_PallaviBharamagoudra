package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;

		try 
		{
			//Load driver
     //		Driver driver = new com.mysql.jdbc.Driver();//it throws sqlexp so it should be written in try catch block
		//	DriverManager.registerDriver(driver);//to register driver
			
			
			//29-11-19
			
			Class.forName("com.mysql.jdbc.Driver"); //we ca gv className at runtime also
			
			System.out.println("driver loaded");

			//get DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter db user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established");
			
			//Issue sql query
			String query="DELETE from users_info where userid=?" +" and password=?";
			pstmt=conn.prepareStatement(query);
			
			System.out.println("enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));//integer to string
			System.out.println("enter password");
			pstmt.setString(2, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("user deleted.....");
			}
			else
			{
				System.err.println("Something went wrong");
			}

		}
		catch(Exception  e)
		{
			e.printStackTrace();
		} 

		
		//process the results returned
		//close all jdbc connections

	}

}
