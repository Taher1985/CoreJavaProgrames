package classDotForName;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class Account {
	private String accountName;
	private int accountNumber;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
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

}

public class ClassDotForNameDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class class1 = Class.forName("classDotForName.Account");
		Method method[] =class1.getDeclaredMethods();
		for (Method method2 : method) {
			System.out.println(method2.getName());
		}
		
		List l = new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l.toString());
	}

}
