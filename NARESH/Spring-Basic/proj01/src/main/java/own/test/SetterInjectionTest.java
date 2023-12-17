package own.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import own.sikku.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("own/sikku/cfgs/applicationContext.xml");
		WishMessageGenerator bean = (WishMessageGenerator) context.getBean("wmg");
		
		
		System.out.println(bean.generateMessage("a"));
		((ClassPathXmlApplicationContext) context).close();
	}

}
