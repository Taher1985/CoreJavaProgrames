package toStringAndHashCode;

class Account1 {
	private int accountNo;
	private String accountName;

	public Account1(int accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

}

public class DemoTest1 {

	public static void main(String[] args) {
		Account1 account = new Account1(123, "Saving");
		System.out.println(account);
	}

}
