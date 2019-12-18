package com.capgemini.usage_collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.usage_collection.bean.ContractBean;

public class ContractDAOImpl implements ContractDAO{
	List<ContractBean> l2=new ArrayList<ContractBean>();
	@Override
	public boolean addContract(ContractBean bean) {

		for (ContractBean contractBean : l2) {
			if(contractBean.getCustomerId()==bean.getCustomerId()) {
				return false;
			}
		}
		l2.add(bean);

		return true;
	}

	@Override
	public boolean deleteContract(int customerId) {
		for (ContractBean contractBean : l2) {
			if(contractBean.getCustomerId()==customerId) {
				l2.remove(contractBean);
				return true;

			}
		}
	
		return false;
	}

	@Override
	public List<ContractBean> getAllContract() {
		// TODO Auto-generated method stub
		return l2;
	}
}
