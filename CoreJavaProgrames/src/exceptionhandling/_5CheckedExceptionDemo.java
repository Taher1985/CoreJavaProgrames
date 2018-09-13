package exceptionhandling;

class YoungAgeException extends RuntimeException {

	public YoungAgeException(String message) {
		super(message);
	}

}

class OldAgeException extends Exception {

	public OldAgeException(String message) {
		super(message);
	}

}

public class _5CheckedExceptionDemo {

	public static void main(String[] args) throws OldAgeException {
		int age = Integer.parseInt("60");
		if(age > 50) {
				throw new OldAgeException("Too Old to apply");
		}
		System.out.println("thorw com");
		if(age < 30) {
			throw new YoungAgeException("Too Young to apply");
		}
	}

}
