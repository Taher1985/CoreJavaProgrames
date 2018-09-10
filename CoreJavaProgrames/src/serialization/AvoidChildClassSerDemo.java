package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	private String type;
	private String color;

	public Animal() {
		super();
	}

	public Animal(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*@Override
	public String toString() {
		return "Animal [type=" + type + ", color=" + color + "]";
	}*/

}

class Cat extends Animal {

	private String cost;

	public Cat(String cost) {
		super("Herbi", "Black");
		this.cost = cost;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	private void writeObject(ObjectOutputStream oos)
			throws NotSerializableException {
		throw new NotSerializableException("Cant serialize this class");
	}

	private void readObject(ObjectInputStream ois)
			throws NotSerializableException {
		throw new NotSerializableException("Cant serialize this class");
	}

	@Override
	public String toString() {
		return "Cat [cost=" + cost + "]";
	}

}

public class AvoidChildClassSerDemo {

	public static void main(String[] args) throws IOException {
		Animal animalSer = new Animal("Herb", "Black");

		System.out.println("Before Serialization  : " + animalSer);

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("animal.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(animalSer);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("after Serialization   : " + animalSer);

		FileInputStream fis;
		ObjectInputStream ois = null;
		Animal animalDeser = null;
		try {
			fis = new FileInputStream("animal.ser");
			ois = new ObjectInputStream(fis);
			animalDeser = (Animal) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("after DeSerialization : " + animalDeser);
	}

}
