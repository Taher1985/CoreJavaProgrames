package garbageCollector;

import java.util.Date;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory                                 " + runtime.totalMemory());
		System.out.println("Free Memory                                  " + runtime.freeMemory());

		for (int i = 0; i <= 200000; i++) {
			Date date = new Date();
			date = null;
		}

		System.out.println("Free Memory after creating null objects      " + runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory after calling Garbage Collector  " + runtime.freeMemory());
	}

}
