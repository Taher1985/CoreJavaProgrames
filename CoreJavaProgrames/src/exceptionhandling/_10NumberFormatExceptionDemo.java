package exceptionhandling;

public class _10NumberFormatExceptionDemo {

	/** NFE is the direct child class of IllegalArgumentException raised explicitly either by 
	 *  programmer or API programmer to indicate that we are trying to convert string to number
	 *  and string is not properly formatted. 
	 * 
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt("String");
	}

}
