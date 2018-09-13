package exceptionhandling;

public class _8ExceptionInInitializerErrorDemo {

	/**
	 * While executing static block or static variable assignment
	 * if any exception occur then we get this exception
	 */
	
	static int x = 10/0;
	
	static {
		String x = null;
		System.out.println(x.toString());
	}
	
	public static void main(String[] args) {
		System.out.println("test");

	}

}
