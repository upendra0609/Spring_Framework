package com.sikku.dao;

import com.sikku.bo.CustomerBO;

public interface ICustomerDAO {
	int insert(CustomerBO custBO) throws Exception;

}
