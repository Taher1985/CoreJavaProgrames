package exceptionhandling;

public class _6ClassCastExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String();
		Object o = (Object)s;      //Child object can be cast to Parent
		
		Object o2 = new String();
		String s3 = (String)o2;    //Child object can be cast to Child
		
		Object o1 = new Object();
		String s1 = (String)o1;    //Parent object can be cast to Child
	}

}
