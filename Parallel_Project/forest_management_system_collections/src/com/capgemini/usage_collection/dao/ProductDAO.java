package com.capgemini.usage_collection.dao;

import java.util.List;

import com.capgemini.usage_collection.bean.ContractBean;
import com.capgemini.usage_collection.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int ProductId);
	List<ProductBean> getAllProduct();
}
