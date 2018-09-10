package externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Account implements Externalizable {

	private String userName;
	private String password;
	private String bankName;
	private String accountNumber;

	public Account() {
		super();
	}

	public Account(String userName, String password, String bankName,
			String accountNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password
				+ ", bankName=" + bankName + ", accountNumber=" + accountNumber
				+ "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.userName);
		out.writeObject(this.accountNumber);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.userName = (String)in.readObject();
		this.accountNumber = (String)in.readObject();
	}

}

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account accountSer = new Account("Taher", "12345", "HDFC", "ABC123");
		System.out.println("Before Seriailization  : " + accountSer);
		
		FileOutputStream fos = new FileOutputStream("acc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountSer);
		oos.flush();
		oos.close();
		System.out.println("After Seriailization   : " + accountSer);
		
		FileInputStream fis = new FileInputStream("acc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account accountDeSer = (Account)ois.readObject();
		ois.close();
		System.out.println("After DeSeriailization : " + accountDeSer);
	}

}
