package own.test;

import java.lang.reflect.Constructor;

public class Main {
	public static void main(String[] args) {
		try {
			Class c= Class.forName(args[0]);
			
			Constructor cons[] = c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			Object obj1 = cons[0].newInstance();
			System.out.println("first  "+obj1);
			
			cons[1].setAccessible(true);
			Object obj2 = cons[0].newInstance(10,20);
			System.out.println("second  "+obj2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
