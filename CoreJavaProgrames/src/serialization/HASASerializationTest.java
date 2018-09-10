package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address {
	
	private static final long serialVersionUID = 1L;
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}

public class HASASerializationTest {

	public static void main(String[] args) {
		Address address = new Address("Indore");
		Person person = new Person("Taher", address);
		
		try {
			FileOutputStream fos = new FileOutputStream("hasSer.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
