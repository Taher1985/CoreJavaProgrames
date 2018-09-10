package toStringAndHashCode;

class Account2 {
	private int accountNo;
	private String accountName;

	public Account2(int accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "Account2 [accountNo=" + accountNo + ", accountName="
				+ accountName + "]";
	}

}

public class DemoTest2 {

	public static void main(String[] args) {
		Account2 account = new Account2(123, "Saving");
		System.out.println(account);
	}

}
