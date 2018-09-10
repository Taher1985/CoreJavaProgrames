package toStringAndHashCode;

class Account3 {
	private int accountNo;
	private String accountName;

	public Account3(int accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	@Override
	public int hashCode() {
		return accountNo;
	}

}

public class DemoTest3 {

	public static void main(String[] args) {
		Account3 account = new Account3(123, "Saving");
		System.out.println(account);
	}

}
