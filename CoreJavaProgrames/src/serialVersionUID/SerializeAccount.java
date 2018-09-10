package serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeAccount {

	public static void main(String[] args) throws IOException {
		Account accountSer = new Account("Savings", 123456);
		
		System.out.println("Before Serialization : " + accountSer);
		
		FileOutputStream fos = new FileOutputStream("uid.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountSer);
		
		System.out.println("After  Serialization : " + accountSer);
	}

}
