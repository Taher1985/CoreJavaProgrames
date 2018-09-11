package exceptionhandling;

public class _1ExceptionHandledByJVMDemo {

	public static void doMoreStuff() {
		System.out.println(10/0);
		System.out.println("returningto to doMoreStuff()");
	}
	
	public static void doStuff() {
		System.out.println("calling doMoreStuff()");
		doMoreStuff();
		System.out.println("called doMoreStuff()");
	}
	
	public static void main(String[] args) {
		System.out.println("calling doStuff()");
		doStuff();
		System.out.println("called doStuff()");
	}

}
