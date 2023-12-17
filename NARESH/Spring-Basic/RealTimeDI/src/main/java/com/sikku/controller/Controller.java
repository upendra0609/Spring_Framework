package com.sikku.controller;

import com.sikku.dto.CustomerDTO;
import com.sikku.service.ICustomerMgmtService;
import com.sikku.vo.CustomerVO;

import lombok.Data;
import lombok.NonNull;

/**
 * Hello world!
 *
 */
@Data
public final class Controller {
	@NonNull
	private ICustomerMgmtService custServise;

	public String processCustomer(CustomerVO custVo) throws Exception {
		// convert VO class obj to DTO class obj
		CustomerDTO custDto = new CustomerDTO();
		custDto.setCname(custVo.getCname());
		custDto.setCadd(custVo.getCadd());
		custDto.setPamt(Double.parseDouble(custVo.getPamt()));
		custDto.setTime(Double.parseDouble(custVo.getTime()));
		custDto.setRate(Double.parseDouble(custVo.getRate()));

		// user service

		String result = custServise.registerCustomer(custDto);
		return result;
	}
}
