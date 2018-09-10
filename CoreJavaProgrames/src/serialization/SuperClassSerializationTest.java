package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String companyName;
	private int companyId;
	private static String companyDomain;
	
	public Company() {
		super();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public static String getCompanyDomain() {
		return companyDomain;
	}

	public static void setCompanyDomain(String companyDomain) {
		Company.companyDomain = companyDomain;
	}

}

class Employee extends Company {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empName;
	private int empId;
	private static String empDomain;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public static String getEmpDomain() {
		return empDomain;
	}

	public static void setEmpDomain(String empDomain) {
		Employee.empDomain = empDomain;
	}

}

public class SuperClassSerializationTest {

	public static void main(String[] args) {
		Employee serializedEmp = new Employee("Taher", 123);
		serializedEmp.setCompanyId(456);
		serializedEmp.setCompanyName("CSC");
		serializedEmp.setCompanyDomain("Insurance");
		serializedEmp.setEmpDomain("Java");
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		FileInputStream fis;
		ObjectInputStream ois;
		Employee deserializedEmp; 

		try {
			fos = new FileOutputStream("myclass.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serializedEmp);
			oos.close();
			fos.close();
			System.out.println("Serialized");
			System.out.println("Company Name    : "+ serializedEmp.getCompanyName());
			System.out.println("Company Id      : "+ serializedEmp.getCompanyId());
			System.out.println("Employee Name   : "+ serializedEmp.getEmpName());
			System.out.println("Employee Id     : "+ serializedEmp.getEmpId());
			System.out.println("Company Domian  : "+ serializedEmp.getCompanyDomain());
			System.out.println("Employee Domian : "+ serializedEmp.getEmpDomain());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("If static variable is serialized then, it has to show old value for Company and Employ Domain");
		serializedEmp.setCompanyName("TCS");
		serializedEmp.setCompanyId(79);
		serializedEmp.setEmpName("Nitin");
		serializedEmp.setEmpId(010);
		serializedEmp.setCompanyDomain("Banking");
		serializedEmp.setEmpDomain(".Net");
		
		System.out.println();
		
		try{ 
			fis = new FileInputStream("myclass.ser");
			ois = new ObjectInputStream(fis);
			deserializedEmp = (Employee) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Deserialized");
			System.out.println("Company Name    : " + deserializedEmp.getCompanyName());
			System.out.println("Company Id      : " + deserializedEmp.getCompanyId());
			System.out.println("Employee Name   : " + deserializedEmp.getEmpName());
			System.out.println("Employee Id     : " + deserializedEmp.getEmpId());
			System.out.println("Company Domian  : " + deserializedEmp.getCompanyDomain()); 
			System.out.println("Employee Domian : " + deserializedEmp.getEmpDomain());
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();                   
		}

	}

}
