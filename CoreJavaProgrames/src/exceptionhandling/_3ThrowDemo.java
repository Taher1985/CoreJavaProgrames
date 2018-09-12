package exceptionhandling;

class AccountException extends Exception {
	private String message;

	public AccountException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}

public class _3ThrowDemo {

	public static void accountTest(double amount, double balance)
			throws AccountException {
		if (amount > balance) {
			AccountException e = new AccountException("InsufficientBalance");
			throw e;
		}

	}

	public static void main(String[] args) throws AccountException {
		accountTest(1000,900);
		System.out.println();
	}

}
