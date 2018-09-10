package passbyrefusingCloneable;

class Company implements Cloneable {
	private String companyName;
	private String city;
	private final String domain = "Insurance";
	private Employee employee;

	public Company(String companyName, String city, Employee employee) {
		super();
		this.companyName = companyName;
		this.city = city;
		this.employee = employee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDomain() {
		return domain;
	}

	public String toString() {
		return "Company Name : " + companyName + ", Company City :  " + city
				+ " , " + employee+ " , " + domain;
	}

	public Object clone() throws CloneNotSupportedException {
		Company company = (Company) super.clone();
		company.setEmployee(new Employee(employee.getName(), employee.getId()));
		return company;
	}

}

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

	public String toString() {
		return "Employee Name : " + name + ", Employee Id : " + id;
	}

}

public class PassByRefExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee("Taher", 123);
		Company company = new Company("CSC", "Indore", employee);
		Company company2 = (Company) company.clone();
		System.out.println(company);
		System.out.println();
		System.out.println(company2);
		System.out.println();

		System.out.println("Prmitive");
		company2.setCompanyName("TCS");
		company2.setCity("Mumbai");
		System.out.println(company);
		System.out.println(company2);
		System.out.println();

		System.out.println("Object");
		company2.getEmployee().setName("Amit");
		System.out.println(company);
		System.out.println(company2);
	}

}
