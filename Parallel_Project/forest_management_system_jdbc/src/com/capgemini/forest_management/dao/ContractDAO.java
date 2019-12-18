package com.capgemini.forest_management.dao;

import java.util.List;

import com.capgemini.forest_management.bean.ContractBean;

public interface ContractDAO 
{
	public boolean addContract(ContractBean bean);
	public boolean deleteContract(int contractId);
	public List<ContractBean> getAllContract();
}
 