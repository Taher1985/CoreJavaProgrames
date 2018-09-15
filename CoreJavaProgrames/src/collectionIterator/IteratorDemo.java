package collectionIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <=10; i++) {
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i%2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
				list.add(11);
			}
		}
		System.out.println(list);
	}

}
