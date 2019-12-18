package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.ContractBean;
import com.capgemini.forest_management.dao.ContractDAO;
import com.capgemini.forest_management.factory.Factory;

public class ContractServicesImpl implements ContractServices 
{
	ContractDAO dao =Factory.instanceOfContractDAOImpl();
	
	@Override
	public boolean addContract(ContractBean contract) {
		// TODO Auto-generated method stub
		return dao.addContract(contract);
	}

	@Override
	public boolean deleteContract(int contractNo) {
		// TODO Auto-generated method stub
		return dao.deleteContract(contractNo);
	}

	@Override
	public List<ContractBean> getAllContract() {
		// TODO Auto-generated method stub
		return dao.getAllContract( );
	}

}
