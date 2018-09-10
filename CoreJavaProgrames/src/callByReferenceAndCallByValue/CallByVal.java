package callByReferenceAndCallByValue;

class Employee {
	private String name;
	private Integer id;

	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void callByValue(String name, Integer id) {
		name = "Nitin";
		id = 456;
	}
}

public class CallByVal {

	public static void main(String[] args) {
		Employee employee = new Employee("Taher", 123);
		System.out.println(employee.getName());
		System.out.println(employee.getId());
		System.out.println();
		employee.callByValue(employee.getName(), employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getId());
	}
}
