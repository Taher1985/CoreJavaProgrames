package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _13TryWithResourceDemo {

	/** Until 1.6 version it is highly recommended to write finally block
	 *  to close resources
	 * 
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("new.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("news.ser"); ObjectInputStream ois = new ObjectInputStream(fis)) {
			ois.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
