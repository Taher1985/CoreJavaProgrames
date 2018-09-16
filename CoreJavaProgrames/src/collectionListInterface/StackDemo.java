package collectionListInterface;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println("Push returns added element : " + s.push("D"));
		System.out.println(s);

		System.out.println();

		System.out.println("Pop deleted and returns deleted element from top of stack : " + s.pop());
		System.out.println(s);

		System.out.println();

		System.out.println("Peek returns only element from top of stack : " + s.peek());
		System.out.println(s);

		System.out.println();
		System.out.println("Empty checks whether stack is empty if yes return true : " + s.isEmpty());

		System.out.println();
		System.out.println("Search returns offset of element i.e no from top of stack : " + s.search("A"));
	}

}
