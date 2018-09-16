package collectionTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class City implements Comparator<City> {
	private String cityName;

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public int compare(City city1, City city2) {
		return -city1.getCityName().compareTo(city2.getCityName());
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	}

}

public class _5ComparatorStringObjectsDemo {

	public static void main(String[] args) {
		City city1 = new City("Indore");
		City city2 = new City("Mumbai");
		City city3 = new City("Ahemdabad");
		City city4 = new City("Cochin");
		City city5 = new City("Delhi");

		TreeSet<City> treeSet = new TreeSet<>(new City(""));
		treeSet.add(city1);
		treeSet.add(city2);
		treeSet.add(city3);
		treeSet.add(city4);
		treeSet.add(city5);

		System.out.println(treeSet);
	}

}
