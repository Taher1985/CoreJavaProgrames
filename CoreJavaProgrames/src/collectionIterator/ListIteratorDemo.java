package collectionIterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Suraj");
		list.add("Amit");
		list.add("Nitin");
		list.add("Suresh");
		list.add("Yash");
		
		ListIterator<String> listIteratorFwd = list.listIterator();
		while(listIteratorFwd.hasNext()) {
			String s = listIteratorFwd.next();
			if (s.equals("Amit")) {
				listIteratorFwd.remove();
			} else if (s.equals("Suresh")) {
				listIteratorFwd.add("Suyog");
			} else if (s.equals("Nitin")) {
				listIteratorFwd.set("Naresh");
			}
		}
		System.out.println(list);
		
		ListIterator<String> listIteratorBwd = list.listIterator(4);
		while(listIteratorBwd.hasPrevious()) {
			String s = listIteratorBwd.previous();
			if (s.equals("Amit")) {
				listIteratorBwd.remove();
			} else if (s.equals("Suresh")) {
				listIteratorBwd.add("Suyog");
			} else if (s.equals("Nitin")) {
				listIteratorBwd.set("Naresh");
			}
		}
		
		System.out.println(list);

	}

}
