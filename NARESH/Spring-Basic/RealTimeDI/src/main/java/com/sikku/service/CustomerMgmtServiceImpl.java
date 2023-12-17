package com.sikku.service;

import com.sikku.bo.CustomerBO;
import com.sikku.dao.ICustomerDAO;
import com.sikku.dto.CustomerDTO;

import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@NonNull
	private ICustomerDAO dao;

	@Override
	public String registerCustomer(CustomerDTO custDto) throws Exception {
		// write business logic to calculate interest amount
		Double intramt = (custDto.getPamt() * custDto.getRate() * custDto.getTime()) / 100.0;
		// prepare CustomeBO class obj having persistable data

		CustomerBO custBo = new CustomerBO();
		custBo.setCname(custDto.getCname());
		custBo.setCadd(custDto.getCadd());
		custBo.setPamt(custDto.getPamt());
		custBo.setIntramt(intramt);

		// use Dao
		int count = dao.insert(custBo);
		return count == 1 ? "Registration Success Interest Rate is " + intramt : "Registration Fail";
	}

}
