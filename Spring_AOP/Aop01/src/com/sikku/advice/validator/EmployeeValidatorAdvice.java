package com.sikku.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.sikku.beans.Employee;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] param, Object target) throws Throwable {
		Employee emp = (Employee) param[0];
		System.out.println("Validation message for " + method.getName());
		System.out.println("---------------------------------");

		if (emp.getEno() < 100 || emp.getEno() > 999) {
			System.out.println("Employee number must be three digit number");
		}

		if (emp.getEsal() < 20000 || emp.getEsal() > 50000) {
			System.out.println("Employee salary must be in the range of 20000 and 50000");
		}
		if (!emp.getEmobile().startsWith("91")) {
			System.out.println("Employee mobile number is invalid");
		}
		if(!emp.getEemail().endsWith("@gmail.com")) {
			System.out.println("Employee email Id is invalid");
		}

	}

}
