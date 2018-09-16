package collectionTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/* Customized sorting on person object for descending order, so comparator is best choice
 */
class Person implements Comparator<Person> {

	private int personId;

	public Person(int personId) {
		super();
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}

	@Override
	
	public int compare(Person o1, Person o2) {
		if (o1.getPersonId() > o2.getPersonId()) {
			return -1;
		}else if (o1.getPersonId() < o2.getPersonId()) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + "]";
	}

}

public class _4ComparatorDemo {

	public static void main(String[] args) {
		Person person1 = new Person(57);
		Person person2 = new Person(21);
		Person person3 = new Person(33);
		Person person4 = new Person(21);
		Person person5 = new Person(42);
		
		TreeSet<Person> treeSet = new TreeSet<>(person1);
		treeSet.add(person1);
		treeSet.add(person2);
		treeSet.add(person3);
		treeSet.add(person4);
		treeSet.add(person5);
		
		System.out.println(treeSet);
	}

}
