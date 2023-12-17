package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.controller.Controller;
import com.sikku.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sikku/cfg/ApplicationContext.xml");
		Controller controller = (Controller) context.getBean("custController", Controller.class);

		CustomerVO custVo = new CustomerVO();
		custVo.setCname("BBB");
		custVo.setCadd("Delhi");
		custVo.setPamt("5000");
		custVo.setRate("15");
		custVo.setTime("3");

		try {
			String result = controller.processCustomer(custVo);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Problem in Customer Registration " + e.getMessage());
//			e.printStackTrace();
		}

	}

}
