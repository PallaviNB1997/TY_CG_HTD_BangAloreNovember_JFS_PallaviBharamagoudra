package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.ProductBean;
import com.capgemini.forest_management.dao.ProductDAO;
import com.capgemini.forest_management.factory.Factory;

public class ProductServicesImpl implements ProductServices {
 ProductDAO dao = Factory.instanceOfProductDAOImpl();
	@Override
	public boolean addProduct(ProductBean bean) {
		
		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int ProductId) {
		
		return dao.deleteProduct(ProductId);
	}

	@Override
	public List<ProductBean> getAllProduct() {
		
		return dao.getAllProduct();
	}

}
