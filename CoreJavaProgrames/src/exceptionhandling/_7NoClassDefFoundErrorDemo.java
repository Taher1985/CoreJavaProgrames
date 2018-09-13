package exceptionhandling;

class Demo {
	
}

public class _7NoClassDefFoundErrorDemo {

	/**
	 * If at runtime JVM dont find , Demo.class then JVM
	 * throws NoClassDefFoundError Exception
	 */
	public static void main(String[] args) {
		System.out.println("Test");
		Demo demo = new Demo();

	}

}
