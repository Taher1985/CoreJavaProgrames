package collectionTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class _6ComparatorStringBufferObjectsDemo implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

	public static void main(String[] args) {
		TreeSet<StringBuffer> treeSet = new TreeSet<>(new _6ComparatorStringBufferObjectsDemo());
		treeSet.add(new StringBuffer("H"));
		treeSet.add(new StringBuffer("E"));
		treeSet.add(new StringBuffer("Z"));
		treeSet.add(new StringBuffer("Q"));
		treeSet.add(new StringBuffer("W"));
		
		System.out.println(treeSet);
	}

}
