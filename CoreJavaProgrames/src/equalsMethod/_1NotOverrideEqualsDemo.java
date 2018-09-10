package equalsMethod;

class Account {

	private int accountNo;
	private String accountName;

	public Account(int accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + "]";
	}

}

public class _1NotOverrideEqualsDemo {

	public static void main(String[] args) {
		Account account1 = new Account(1234, "Saving");
		Account account2 = new Account(5678, "Current");
		Account account3 = new Account(1234, "Saving");
		Account account4 = account1;
		
		System.out.println(account1.equals(account2));
		System.out.println(account1.equals(account3));
		System.out.println(account1.equals(account4));
	}

}
