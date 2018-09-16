package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _1BasicMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.put(1, "Amit"));
		System.out.println(map.put(2, "Yash"));
		System.out.println(map.put(3, "Nitu"));
		System.out.println(map.put(1, "Amy"));
		
		Map<Integer, String> mapCity = new HashMap<>();
		System.out.println(mapCity.put(4, "Indore"));
		System.out.println(mapCity.put(2, "Bombay"));
		
		map.putAll(mapCity); //Copies all of the mappings from the specified map to this map. 
		
		System.out.println();
		System.out.println(map);
		System.out.println();
		

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			if (entry.getValue().equals("Bombay")) {
				entry.setValue("Mumbai");
			}
			System.out.println("Key are : " + entry.getKey() + " " + "Values are : " + entry.getValue());
		}

		System.out.println();
		
		System.out.println("Size : " + map.size()); //Returns the number of key-value mappings in this map.
		System.out.println("Value of Key : " + map.get(1)); //Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		System.out.println("Rmoved the key : "+ map.remove(1)); //Removes the mapping for a key from this map if it is present (optional operation).
		System.out.println("Size now : " + map.size());
		System.out.println("Map contains key : " + map.containsKey(1)); //Returns true if this map contains a mapping for the specified key.
		System.out.println("Map contains value : " + map.containsValue("Bombay")); //Returns true if this map maps one or more keys to the specified value.
		System.out.println("Map contain key value object : " + map.isEmpty()); //Returns true if this map contains no key-value mappings.
		
		System.out.println();
		
		System.out.println(map.entrySet()); //Returns a Set view of the mappings contained in this map.
		System.out.println(map.values()); //Returns a Collection view of the values contained in this map. 
		System.out.println(map.keySet()); //Returns a Set view of the keys contained in this map. 
	}

}
