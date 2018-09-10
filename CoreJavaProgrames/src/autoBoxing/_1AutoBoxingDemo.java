package autoBoxing;

public class _1AutoBoxingDemo {

	public void test(Long i) {
		System.out.println("Autoboxing");
	}
	
	public void test(long i) {
		System.out.println("Widening");
	}
	
	public void test(int... i) {
		System.out.println("VarArgs");
	}
	public static void main(String[] args) {
		_1AutoBoxingDemo demo = new _1AutoBoxingDemo();
		demo.test(5);
	}

}
