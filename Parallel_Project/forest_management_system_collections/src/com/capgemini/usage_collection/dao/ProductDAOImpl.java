package com.capgemini.usage_collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.usage_collection.bean.ContractBean;
import com.capgemini.usage_collection.bean.CustomerBean;
import com.capgemini.usage_collection.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO
{
	List<ProductBean> l1=new ArrayList<ProductBean>();
	@Override
	public boolean addProduct(ProductBean bean) {
		for (ProductBean productBean : l1) {
			if(productBean.getProductId()==bean.getProductId()) {
				return false;
			}
		}
		l1.add(bean);
		return true;
	}

	@Override
	public boolean deleteProduct(int productId) {
		ProductBean bean = null;
		for (ProductBean c1 : l1) {
			if(c1.getProductId()==productId)
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
	public List<ProductBean> getAllProduct() {
		
		return l1;
	}

}
