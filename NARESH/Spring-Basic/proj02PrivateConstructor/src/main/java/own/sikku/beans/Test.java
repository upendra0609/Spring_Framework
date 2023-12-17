package own.sikku.beans;

public class Test {
	private int a;
	private int b;
	
	private Test() {
		System.out.println("0 arg const");
	}
	
	private Test(int a, int b) {	
		System.out.println("arg const");
		this.a = a;
		this.b = b;
	}

}
