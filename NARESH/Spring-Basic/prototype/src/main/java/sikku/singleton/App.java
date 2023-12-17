package sikku.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/sikku/singleton/cfgs/ApplicationContext.xml");
		SingletonDemo b1 = context.getBean("s1", SingletonDemo.class);
		SingletonDemo b2 = context.getBean("s1", SingletonDemo.class);

		System.out.println(b1 == b2);
		((AutoCloseable) context).close();
	}
}
