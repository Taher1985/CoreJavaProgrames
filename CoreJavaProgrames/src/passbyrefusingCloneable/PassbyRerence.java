package passbyrefusingCloneable;

class Address {
	private String address1;

	public Address(String address1) {
		super();
		this.address1 = address1;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return address1;
	}

}

class Student implements Cloneable {
	private String name;
	private Integer id;
	private Address address;

	public Student(String name, Integer id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", address=" + address;
	}

	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.setAddress(new Address(address.getAddress1()));
		return student;
	}

}

public class PassbyRerence {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("SaifeeNagar");

		Student student1 = new Student("Taher", 123, address);
		System.out.println("Student1 " + student1);
		Student student2 = (Student) student1.clone();
		System.out.println("Student2 " + student2);

		System.out.println();

		student2.setName("Nitin");
		System.out.println("Student1 " + student1);
		System.out.println("Student2 " + student2);
		
		System.out.println();
		
		student2.getAddress().setAddress1("VijayNagar");
		System.out.println("Student1 " + student1);
		System.out.println("Student2 " + student2);
	}

}
