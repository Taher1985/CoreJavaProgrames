package equalsMethod;

class Person {

	private String name;
	private int id;

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void test() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		Person person = (Person)object;
		if(this.getName().equals(person.getName()) && this.getId()==person.getId()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}

public class EqualsDemo2 {

	public static void main(String[] args) {
		Person person1 = new Person("Taher", 123);
		Person person2 = new Person("Nitin", 456);
		Person person3 = new Person("Taher", 123);
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
	}

}
