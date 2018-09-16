package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _3IdentityHashMapDemo {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		Map<Integer, String> map1 = new IdentityHashMap<>();
		map1.put(i1, "AB");
		map1.put(i2, "CD");
		System.out.println(map1);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(i1, "AB");
		map2.put(i2, "CD");
		System.out.println(map2);
		
		Map<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(i1, "AB");
		map3.put(i2, "CD");
		System.out.println(map3);
	}

}
