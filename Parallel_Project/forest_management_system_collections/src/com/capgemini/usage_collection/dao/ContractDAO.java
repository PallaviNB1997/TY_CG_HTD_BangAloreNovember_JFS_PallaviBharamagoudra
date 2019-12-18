package com.capgemini.usage_collection.dao;

import java.util.List;

import com.capgemini.usage_collection.bean.ContractBean;
import com.capgemini.usage_collection.bean.CustomerBean;

public interface ContractDAO {
public boolean addContract(ContractBean bean);
public boolean deleteContract(int contractId);
List<ContractBean> getAllContract();
}



