package objectClassMethods;

public class _2FinalizeMethodDemo {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1 = null;
		System.gc();
	}

}
