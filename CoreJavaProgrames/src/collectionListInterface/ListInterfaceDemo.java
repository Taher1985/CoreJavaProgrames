package collectionListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceDemo {

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
		
		List<String> listCountry = new ArrayList<>(listState);
		System.out.println(listCountry);

		
		listCity.add(1, "Hyderabad");
		System.out.println(listCity);
		
		listCity.addAll(1, listState);
		System.out.println(listCity);
		
		System.out.println(listCity.set(1, "Ujjain"));
		System.out.println(listCity);
		
		System.out.println();
		
		ListIterator<String> listIterator = listCity.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);
		}
		
		listCity.remove(0);
		System.out.println(listCity);
	}

}
