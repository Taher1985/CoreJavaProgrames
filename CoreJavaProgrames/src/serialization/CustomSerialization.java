package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userName;
	private transient String password;
	private transient int pin;

	public Account(String userName, String password, int pin) {
		super();
		this.userName = userName;
		this.password = password;
		this.pin = pin;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		
		String encryptedPassword = "ABC" + this.password;
		int encryptedPin = 1 + this.pin;
		
		oos.writeObject(encryptedPassword);
		oos.writeInt(encryptedPin);
		
		this.password = encryptedPassword;
		this.pin = encryptedPin;
	}

	private void readObject(ObjectInputStream ois) throws IOException,
			ClassNotFoundException {
		ois.defaultReadObject();
		
		String decryptedPassword = (String) ois.readObject();
		int decryptedPin = ois.readInt();
		
		decryptedPassword = decryptedPassword.substring(3);
		decryptedPin = decryptedPin - 1;
		
		this.password = decryptedPassword;
		this.pin = decryptedPin;
	}

	public String toString() {
		return "userName : " + this.userName + " , password : " + this.password
				+ ", pin : " + this.pin;
	}

}

public class CustomSerialization {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Account accountSer = new Account("Taher", "1234", 5678);

		System.out.println("before Serialization  : " + accountSer);
		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountSer);
		oos.flush();
		oos.close();
		System.out.println("after Serialization   : " + accountSer);

		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account accountDeser = (Account) ois.readObject();
		ois.close();
		System.out.println("after DeSerialization : " + accountDeser);
	}

}
