package cloneexample;

class Employee1 implements Cloneable {
	private int id;
	private String empName;

	public Employee1(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}

}

class Company implements Cloneable {
	private int id;
	private String companyName;
	private Employee1 employee;

	public Company(int id, String companyName, Employee1 employee) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee1 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee1 employee) {
		this.employee = employee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", employee=" + employee + "]";
	}

}

public class _1ShallowClonningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 employee = new Employee1(456, "Taher");
		Company companyOriginal = new Company(123, "CSC", employee);

		System.out.println("Original Object");
		System.out.println(employee);
		System.out.println(companyOriginal);

		System.out.println();
		
		Company companyClone = (Company) companyOriginal.clone();
		System.out.println("Cloned Object");
		System.out.println(companyOriginal);
		System.out.println(companyClone);
		
		System.out.println();
		
		System.out.println("Changes doing in cloned object only in Company i.e String obj");
		companyClone.setCompanyName("DXC");
		System.out.println(companyOriginal);
		System.out.println(companyClone);
		
		System.out.println();
		
		System.out.println("Changes doing in cloned object's reference object i.e Employee obj");
		companyClone.getEmployee().setEmpName("Nitin");
		System.out.println(companyOriginal);
		System.out.println(companyClone);
	}

}
