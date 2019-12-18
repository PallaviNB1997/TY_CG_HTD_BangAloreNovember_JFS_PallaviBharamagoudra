 package com.capgemini.forest_management.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forest_management.bean.ContractBean;
import com.capgemini.forest_management.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {

	//add implemantations
			FileReader reader;
			Properties prop;
			CustomerBean bean;
		public CustomerDAOImpl() {
			try {
				
				reader = new FileReader("db.properties");
				prop =new Properties();
				prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	
	@Override
	public boolean addCustomer(CustomerBean bean) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addCustomerQuery"));
				){
			
			pstmt.setInt(1, bean.getCustomerId());
			pstmt.setString(2,bean.getCustomerName());
			pstmt.setString(7,bean.getEmail());
			pstmt.setInt(6, bean.getPostalCode());
			pstmt.setString(3, bean.getStreetAddress1());
			pstmt.setString(4, bean.getStreetAddress2());
			pstmt.setString(5, bean.getTown());
			pstmt.setInt(8, bean.getTelephone());
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}		
		}catch (Exception e) {
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyCustomer(int customerid,String email) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("modifyCustomerQuery"));
				){
			
			pstmt.setInt(2, customerid);
			pstmt.setString(1, email);
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}		
		}catch (Exception e) {
		e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		List<CustomerBean> list = new ArrayList<CustomerBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query2"))){
			while(rs.next()) {
				bean = new CustomerBean();
				bean.setCustomerId(rs.getInt(1));
				bean.setCustomerName(rs.getString(2));
				bean.setStreetAddress1(rs.getString(3));
				bean.setStreetAddress2(rs.getString(4));
				bean.setTown(rs.getString(5));
				bean.setPostalCode(rs.getInt(6));
				bean.setEmail(rs.getString(7));
				bean.setTelephone(rs.getInt(8));
				
				list.add(bean);				
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteCustomerQuery"))){
			
			pstmt.setInt(1, customerid);
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}		
		}catch (Exception e) {
		e.printStackTrace();
		}
		
		return false;
	}

	

}
