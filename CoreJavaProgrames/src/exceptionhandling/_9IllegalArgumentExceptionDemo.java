package exceptionhandling;

public class _9IllegalArgumentExceptionDemo {

	/** 
	 * Raised explicitly either by programmer or by API developer to
	 * indicate method has been invoked with illegal argument
	 * The valid priority is 1 to 10 if we are trying to set priority with any other value
	 * then we will get run time exception saying illegal argument exception.
	 */
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(11);
	}

}
