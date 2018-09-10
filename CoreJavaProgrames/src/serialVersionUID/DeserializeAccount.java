package serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeAccount {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account accountDeser;

		FileInputStream fis = new FileInputStream("uid.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		accountDeser = (Account) ois.readObject();

		System.out.println("After DeSerialization : " + accountDeser);
	}

}
