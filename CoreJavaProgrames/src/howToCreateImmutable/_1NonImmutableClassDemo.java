package howToCreateImmutable;

class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee employeeUpdateExistingObject(Employee employee) {
		employee.empId = 456;
		return employee;
	}

	public void employeeUpdateNewObject(Employee employee) {
		employee = new Employee(012, "Vivek");
		employee.empId = 456;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}

public class _1NonImmutableClassDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(123, "Taher");
		Employee employee2 = new Employee(789, "Nitin");
		
		System.out.println(employee1);
		System.out.println();
		
		employee1.employeeUpdateExistingObject(employee2);
		System.out.println(employee1);

		System.out.println();
		System.out.println(employee2);
		System.out.println();
		
		employee2.employeeUpdateNewObject(employee2);
		System.out.println(employee2);
	}

}
