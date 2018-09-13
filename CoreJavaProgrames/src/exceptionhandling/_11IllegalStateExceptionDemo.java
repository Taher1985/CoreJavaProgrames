package exceptionhandling;

public class _11IllegalStateExceptionDemo {

	/** ISE is the child of RunTimeException and raised explicitly either by programmer 
	 *  or API developer to indicate that method has been invoked at wrong time.
	 *  After starting of thread we are not allowed to restart same thread once again
	 *  other wise we will get runtime exception starting ITSE.
	 * 
	 */
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		t.start();

	}

}
