package com.sikku.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateInterestAmountMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("method replacer");
		Double pamt = (Double) args[0];
		Double rate = (Double) args[1];
		Double time = (Double) args[2];
		// calculate Interest;
		return (pamt * rate * time) / 100.0;
	}

}
