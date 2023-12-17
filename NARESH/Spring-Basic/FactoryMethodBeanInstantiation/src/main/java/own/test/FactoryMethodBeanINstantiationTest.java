package own.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodBeanINstantiationTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("own/sikku/cfgs/ApplicationContext.xml");

		Class c1 = (Class) context.getBean("c1", Class.class);
		System.out.println(c1.toString() + "  " + c1.getClass());

		System.out.println("/////////////////////////////////");

		Calendar cal = (Calendar) context.getBean("cal", Calendar.class);
		System.out.println(cal.toString() + "  " + cal.getClass());

		System.out.println("/////////////////////////////////");

		Properties props = (Properties) context.getBean("props", Properties.class);
		System.out.println(props.toString() + "  " + props.getClass());

		System.out.println("/////////////////////////////////");
		
		
		String s1 = (String) context.getBean("s1", String.class);
		System.out.println(s1.toString() + "  " + s1.getClass());

		System.out.println("/////////////////////////////////");
		
		String s2 = (String) context.getBean("s2", String.class);
		System.out.println(s2.toString() + "  " + s2.getClass());

		System.out.println("/////////////////////////////////");


	}

}
