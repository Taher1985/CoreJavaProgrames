package finalize;

class Person {

	private static int i;

	public void finalize() {
		System.out.println("finalize called " + ++i);
	}

}

public class _4JVMCallsToGCDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			Person person = new Person();
			person = null;
		}
	}

}
