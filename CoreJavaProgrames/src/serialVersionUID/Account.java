package serialVersionUID;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 3232232323L;
	private String accountName;
	private int accountNumber;

	public Account(String accountName, int accountNumber) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNumber="
				+ accountNumber + "]";
	}

}
