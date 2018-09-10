package howToCreateImmutable;

class Person {
	private int perId;
	private String perName;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int perId, String perName) {
		super();
		this.perId = perId;
		this.perName = perName;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public Person personUpdateExistingObject(Person person) {
		if ((this.perId == person.getPerId())) {
			return this;
		} else {
			return new Person(person.getPerId(), person.getPerName());
		}
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + "]";
	}

}

public class _2ImmutableClassDemo {

	public static void main(String[] args) {
		final Person person1 = new Person(123, "Taher");
		Person person2 = new Person(456, "Hashim");
		Person person3 = person1.personUpdateExistingObject(person1);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);

		System.out.println();
		
		System.out.println(person1 == person3);
		System.out.println(person2 == person3);
		
		System.out.println();
		Person person4 = person1.personUpdateExistingObject(person2);
		System.out.println(person4);
		System.out.println(person2 == person4);
		
		Boolean boolean1 = new Boolean("fgfgf");
		Boolean boolean2 = new Boolean("taher");
		System.out.println(boolean1);
		System.out.println(boolean2);
	}

}
