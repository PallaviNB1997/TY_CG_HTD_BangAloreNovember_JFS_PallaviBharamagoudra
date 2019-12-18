package com.capgemini.forest_management.dao;
import java.sql.Statement;
//import java.beans.Statement;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forest_management.bean.ContractBean;
//import com.capgemini.forest_management.bean.CustomerBean;
import com.capgemini.forest_management.bean.ProductBean;

public class ContractDAOImpl implements ContractDAO 
{

	//add implemantations
	FileReader reader;
	Properties prop;
	ContractBean bean;
	public ContractDAOImpl() 
	{
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
	public boolean addContract(ContractBean bean) {
		
		try 
			(java.sql.Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"), 
					prop.getProperty("dbPassword"));
			PreparedStatement pstmt=con.prepareStatement(prop.getProperty("addContractQuery"));
			)		
			{
				pstmt.setInt(1, bean.getContractNo());
				pstmt.setInt(2, bean.getCustomerId());
				pstmt.setInt(3, bean.getProductId());
				pstmt.setInt(4, bean.getHaulierId());				
				pstmt.setString(5, bean.getDeliveryDate());
				pstmt.setString(6, bean.getDeliveryDay());
				pstmt.setInt(7, bean.getQuantity());
				
				int count = pstmt.executeUpdate();
				
				if(count>0) 
				{
					return true;
				}
				else {
					return false;
				}
			}


		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteContract(int contractId) {
		try (Connection con =DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
		PreparedStatement pstmt = con.prepareStatement(prop.getProperty("deleteContractQuery"));)
		{
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<ContractBean> getAllContract() {
		List<ContractBean> list = new ArrayList<ContractBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				bean = new ContractBean();
				bean.setContractNo(rs.getInt(1));
				bean.setCustomerId(rs.getInt(2));
				
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
