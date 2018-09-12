package exceptionhandling;

import java.io.IOException;

public class _4ThrowsDemo {

	
	public _4ThrowsDemo() throws IOException {
		super();
	}

	public static void doMoreStuff() throws IOException {
		throw new IOException();
	}

	public static void doStuff() throws IOException {
		doMoreStuff();
	}

	public static void main(String[] args) throws IOException  {
		doStuff();
	}

}
