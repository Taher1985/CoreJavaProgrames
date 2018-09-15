package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceMethodsDemo {

	public static void main(String[] args) {
		
		List<String> listCity = new ArrayList<>();
		listCity.add("Indore");  // to add particular object
		listCity.add("Mumbai");
		listCity.add("Surat");
		listCity.add("Udaipur");
		
		List<String> listState = new ArrayList<>();
		listState.add("MP");
		listState.add("MH");
		listState.add("GJ");
		listState.add("RJ");
		
		List<String> listCounty = new ArrayList<>();
		listCounty.add("India");
		listCounty.add("Pak");
		listCounty.add("SL");
		listCounty.add("BNG");
		
		List<String> listCountryStateAndCity = new ArrayList<>();
		listCountryStateAndCity.addAll(listState);  // to add group of objects(collection)
		listCountryStateAndCity.addAll(listCity);  // to add group of objects(collection)
		listCountryStateAndCity.addAll(listCounty);  // to add group of objects(collection)
		System.out.println(listCountryStateAndCity);
		
		
		listCountryStateAndCity.remove("MH");  // to remove particular object
		System.out.println(listCountryStateAndCity);
		
		listCountryStateAndCity.removeAll(listState);  // to remove group of objects(collection)
		System.out.println(listCountryStateAndCity);
		
		listCountryStateAndCity.retainAll(listCounty);
		System.out.println(listCountryStateAndCity);  // to remove all except specified group of objects(collection)
		
		listCountryStateAndCity.clear();
		System.out.println(listCountryStateAndCity);  // to remove all group of objects(collection)
		
		listCountryStateAndCity.addAll(listState);  // to add group of objects(collection)
		listCountryStateAndCity.addAll(listCity);  // to add group of objects(collection)
		listCountryStateAndCity.addAll(listCounty);  // to add group of objects(collection)
		
		System.out.println();
		System.out.println(listCountryStateAndCity.contains("MP"));  // to check list whether contains the specified element
		
		System.out.println(listCountryStateAndCity.containsAll(listCity));  // to check list whether contains the element of specified collection
		
		System.out.println(listCountryStateAndCity.isEmpty());  // to check whether list contains no elements.
		
		System.out.println();
		System.out.println(listCountryStateAndCity.size());  // Returns the number of elements in the list.
		
		Object[] arrayCountryStateAndCity = listCountryStateAndCity.toArray(); //Returns an array containing all of the elements in this list in proper sequence
		for (Object object : arrayCountryStateAndCity) {
			System.out.println(object);
		}
		
		Iterator<String> iterator = listCountryStateAndCity.iterator(); //Returns an iterator over the elements in this list in proper sequence.
		 // while loop
        while (iterator.hasNext()) {
        System.out.println("value = " + iterator.next());
        }
	}

}
