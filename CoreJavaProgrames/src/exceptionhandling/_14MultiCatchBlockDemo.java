package exceptionhandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;

public class _14MultiCatchBlockDemo {

	public static void main(String[] args) throws Exception {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(""));
		} catch (ArithmeticException | NullPointerException | IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		System.out.println("hello");
	}

}
