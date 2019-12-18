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
import java.util.Scanner;

import com.capgemini.forest_management.bean.ProductBean;
import com.capgemini.forest_management.factory.Factory;
import com.capgemini.forest_management.services.ProductServices;


public class ProductDAOImpl implements ProductDAO{
	
	//add implemantations
		FileReader reader;
		Properties prop;
		ProductBean bean;
	public ProductDAOImpl() {
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
	public boolean addProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addProductQuery"));
				){
			
			pstmt.setInt(1, bean.getProductId());
			pstmt.setString(2,bean.getProductName());
			
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
	public boolean deleteProduct(int ProductId) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query2"));
				){
			
			pstmt.setInt(1, ProductId);
			
			
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
	public List<ProductBean> getAllProduct() {
		
		List<ProductBean> list = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query3"))){
			while(rs.next()) {
				bean = new ProductBean();
				bean.setProductId(rs.getInt(1));
				bean.setProductName(rs.getString(2));
				
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
