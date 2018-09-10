package classnotfoundexc;

import java.lang.reflect.Constructor;


class A{

	public A(String a) {
		System.out.println("Constructor A");
	}
	public String test() {
		return "Class A test method called ";
	}
}

public class ClassNotFoundExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException {
		try {
			String myClassName = A.class.getName();
			Class<?> myClassName1 = Class.forName(myClassName);
			Constructor<?> ctr = myClassName1.getConstructor(String.class);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Class A compiled");

	}

}
