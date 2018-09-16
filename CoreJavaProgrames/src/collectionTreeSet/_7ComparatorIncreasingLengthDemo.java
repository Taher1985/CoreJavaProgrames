package collectionTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class _7ComparatorIncreasingLengthDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 > l2) {
			return 1;
		} else if (l1 < l2) {
			return -1;
		} else {
			return s1.compareTo(s2);
		}
		
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(new _7ComparatorIncreasingLengthDemo());
		set.add("A");
		set.add(new StringBuffer("ABC"));
		set.add(new StringBuffer("AA"));
		set.add("XX");
		set.add("ABCD");
		set.add("A");
		System.out.println(set);

	}

}
