package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _13TryWithResourceDemo implements AutoCloseable {

	/** Until 1.6 version it is highly recommended to write finally block
	 *  to close resources
	 *  We are not required to write finally block so that lenght of code 
	 *  is block and readable will be improved
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try {
			FileOutputStream fos = new FileOutputStream("new.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("news.ser"); ObjectInputStream ois = new ObjectInputStream(fis)) {
			ois.read();
		} 
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("Auto Closeable");
		
	}

}
