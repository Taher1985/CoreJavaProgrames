package sortedmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {
	private int studId;
	private String stuName;

	public Student(int studId, String stuName) {
		super();
		this.studId = studId;
		this.stuName = stuName;
	}

	public int getStudId() {
		return studId;
	}

	public String getStuName() {
		return stuName;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getStudId() > o.getStudId()) {
			return 1;
		} else if (this.getStudId() < o.getStudId()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "key : " + studId + " Value : " + stuName;
	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getStuName().compareTo(o2.getStuName());
	}

}

public class _2TreeMapDefaultCompareDemo {

	public static void main(String[] args) {
		Map<Student, String> map = new TreeMap<>();
		map.put(new Student(158, "Ajay"), " Ajay34");
		map.put(new Student(212, "Vijay"), " Vijay34");
		map.put(new Student(212, "Sanjay"), " Sanjay34");
		map.put(new Student(532, "Dhananjay"), " Dhananjay34");
		map.put(new Student(213, "Abhay"), " Abhay34");
		
		System.out.println("Default sorting using comparable");
		System.out.println(map);
		
		System.out.println();
		
		Map<Student, String> mapCust = new TreeMap<>(new NameComparator());
		mapCust.put(new Student(158, "Ajay"), "Ajay34");
		mapCust.put(new Student(212, "Vijay"), "Vijay34");
		mapCust.put(new Student(212, "Sanjay"), "Sanjay34");
		mapCust.put(new Student(532, "Dhananjay"), "Dhananjay34");
		mapCust.put(new Student(213, "Abhay"), "Abhay34");
		
		System.out.println("Default sorting using comparable");
		System.out.println(mapCust);

	}

}
