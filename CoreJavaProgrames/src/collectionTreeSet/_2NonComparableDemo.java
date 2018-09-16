package collectionTreeSet;

import java.util.TreeSet;

class Employee {
	private int empId;

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

}
public class _2NonComparableDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(123);
		Employee employee2 = new Employee(456);
		Employee employee3 = new Employee(789);
		
		TreeSet<Employee> treeSet = new TreeSet<>();
		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		
		System.out.println(treeSet.toString());
	}

}
