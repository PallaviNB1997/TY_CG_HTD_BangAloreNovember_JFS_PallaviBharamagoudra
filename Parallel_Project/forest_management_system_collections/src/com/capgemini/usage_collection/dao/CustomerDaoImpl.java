package com.capgemini.usage_collection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.usage_collection.bean.CustomerBean;

public class CustomerDaoImpl implements CustomerDAO  {
	List<CustomerBean> l1=new ArrayList<CustomerBean>();
	CustomerBean bean=new CustomerBean();
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean addCustomer(CustomerBean bean) {
		for (CustomerBean customerBean : l1) {
			if(customerBean.getCustomerId()==bean.getCustomerId()) {
				return false;			
			}
		}
		l1.add(bean);
		return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		CustomerBean bean = null;
		for (CustomerBean c1 : l1) {
			if(c1.getCustomerId()==customerId)
			{
				bean =c1;
			}
		}
		if(bean!=null)
		{
			l1.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		//bean=null;
		for (CustomerBean customerBean : l1) {
//			{
//				if(customerBean.getCustomerId() == bean.getCustomerId());
//				{
//					System.out.println("1.modify Customer name\n2. modify Customer Id\n3.Modify Customer mail\n4. modify Customer postalcode\n5.modify Customer Address1\n6.modify Customer Address1");
//					char ch ='a';
//					while(ch=='a') {
//						
//					
//					int option=sc.nextInt();
//					switch(option) {
//					case 1:
//						System.out.println("enter customer name to be modified..");
//						customerBean.setCustomerName(sc.next());
//						System.out.println("modified Success");
//						ch='b';
//						break;
//					case 2:
//						customerBean.setCustomerId(bean.getCustomerId());
//						break;
//					case 3:
//						customerBean.setEmail(bean.getEmail());
//						break;
//					case 4:
//						customerBean.setPostalCode(bean.getPostalCode());
//						break;
//					case 5:
//						System.out.println("street 1");
//						customerBean.setStreetAddress1(bean.getStreetAddress1());
//						break;
//					case 6:
//						System.out.println("street 2");
//						customerBean.setStreetAddress2(bean.getStreetAddress2());
//						break;
//					case 7 :
//						ch='b';
//					default:
//						break;
//					}
//					}
					customerBean.setCustomerName(bean.getCustomerName());
					customerBean.setCustomerId(bean.getCustomerId());
					customerBean.setEmail(bean.getEmail());
				customerBean.setPostalCode(bean.getPostalCode());
				customerBean.setStreetAddress1(bean.getStreetAddress1());
					customerBean.setStreetAddress2(bean.getStreetAddress2());
					
				}
	//		}
			
		//}
		return false;
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		// TODO Auto-generated method stub
		return l1;
	}

	}


