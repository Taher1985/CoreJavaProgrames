package toStringAndHashCode;

class Account4 {
	private int accountNo;
	private String accountName;

	public Account4(int accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	@Override
	public int hashCode() {
		return accountNo;
	}

	@Override
	public String toString() {
		return "Account4 [accountNo=" + accountNo + ", accountName="
				+ accountName + "]";
	}

}

public class DemoTest4 {

	public static void main(String[] args) {
		Account4 account = new Account4(123, "Saving");
		System.out.println(account);
	}

}
