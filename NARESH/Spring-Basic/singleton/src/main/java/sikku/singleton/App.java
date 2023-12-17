package sikku.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/sikku/singleton/cfgs/ApplicationContext.xml");
		/*
		 * SingletonDemo s1 = context.getBean("s1",SingletonDemo.class); SingletonDemo
		 * s2 = context.getBean("s2",SingletonDemo.class); System.out.println(s1==s2);
		 */
		SingletonEnum s1 = context.getBean("s1", SingletonEnum.class);
		SingletonEnum s2 = context.getBean("s2", SingletonEnum.class);
		System.out.println(s1 == s2);
		
		((AutoCloseable) context).close();
	}
}
