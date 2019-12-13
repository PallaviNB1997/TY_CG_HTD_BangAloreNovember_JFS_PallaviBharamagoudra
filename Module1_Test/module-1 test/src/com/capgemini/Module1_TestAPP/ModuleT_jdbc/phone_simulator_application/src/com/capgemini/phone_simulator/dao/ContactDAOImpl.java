package com.capgemini.phone_simulator.dao;                     //



import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phone_simulator.bean.ContactBean; //

public class ContactDAOImpl implements ContactDAO{

	FileReader reader;
	Properties prop;
	ContactBean bean;
	public ContactDAOImpl() {
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
	public boolean addContact(ContactBean bean) {

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addContactQuery"));
				){
			pstmt.setString(1,bean.getContactName());
			pstmt.setInt(2, bean.getContactNumber());
			pstmt.setString(3, bean.getGroupName());


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
	public boolean deleteContact(String contactName) {
		// TODO Auto-generated method stub

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteContactQuery"))){
			pstmt.setString(1, contactName);

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
	public boolean updateContact(String contactName, int contactNumber) {
		// TODO Auto-generated method stub

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateContactQuery"));
				){
			pstmt.setString(1, contactName);
			pstmt.setInt(2, contactNumber);

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
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub

		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				bean = new ContactBean();
				bean.setContactName(rs.getString(1));
				bean.setContactNumber(rs.getInt(2));
				bean.setGroupName(rs.getString(3));

				list.add(bean);				
			}
			return list;

		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}

























