package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.ContractBean;

public interface ContractServices
{	
	public boolean addContract(ContractBean contract);
	
	public boolean deleteContract(int contractNo);
	
	public List<ContractBean> getAllContract();
}