package com.sikku.service;

import com.sikku.dto.CustomerDTO;

public interface ICustomerMgmtService {
	String registerCustomer(CustomerDTO custDto) throws Exception;

}
