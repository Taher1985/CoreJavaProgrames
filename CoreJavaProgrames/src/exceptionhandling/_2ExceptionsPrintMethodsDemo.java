package exceptionhandling;

public class _2ExceptionsPrintMethodsDemo {

	
	public static void doStuff() {
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try {
			String s = null;
			s.toString();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			
		}
		
		System.out.println("returning to to main()");
	}
	
	public static void main(String[] args) {
		System.out.println("calling doStuff()");
		doStuff();
		System.out.println("called doStuff()");
	}

}
