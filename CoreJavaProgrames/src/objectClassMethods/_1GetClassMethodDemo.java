package objectClassMethods;

import java.lang.reflect.Method;

class Account {

	private int accountNo;
	private String accountName;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

}

class Student {

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}

public class _1GetClassMethodDemo {

	public static void main(String[] args) {
		Account account = new Account(123, "Saving");
		Student student = new Student(456, "Taher");

		Class accountObj = account.getClass();
		Class studentObj = student.getClass();
		
		System.out.println(accountObj.getName());
		System.out.println(studentObj.getName());
		System.out.println();
		Method methodA[] = accountObj.getDeclaredMethods();
		for (Method methodNames : methodA) {
			System.out.println("Account Class method " + methodNames.getName());
		}
		System.out.println();
		Method methodS[] = studentObj.getDeclaredMethods();
		for (Method methodNames : methodS) {
			System.out.println("Student Class method " + methodNames.getName());
		}

	}

}
