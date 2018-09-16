package sortedmap;

import java.util.TreeMap;
import java.util.TreeSet;

public class _1TreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put(null, ""); // after 1.7 if we add null as key in map it throws NPE
		
		TreeSet<String> set = new TreeSet<>();
		set.add(null); // after 1.7 if we add null as key in set it throws NPE
		
	}

}
