package collectionTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

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
		return "Student [studId=" + studId + ", stuName=" + stuName + "]";
	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getStuName().compareTo(o2.getStuName());
	}

}

public class _3ComparableDemo {

	public static void main(String[] args) {
		Student student1 = new Student(432, "Samir");
		Student student2 = new Student(124, "Bhuvan");
		Student student3 = new Student(342, "Amit");
		Student student4 = new Student(111, "Yash");
		Student student5 = new Student(256, "Jignesh");

		TreeSet<Student> treeSetId = new TreeSet<>();
		treeSetId.add(student1);
		treeSetId.add(student2);
		treeSetId.add(student3);
		treeSetId.add(student4);
		treeSetId.add(student5);
		System.out.println("Sorting by Id");
		System.out.println(treeSetId.toString());

		System.out.println();

		TreeSet<Student> treeSetName = new TreeSet<>(new NameComparator());
		treeSetName.add(student1);
		treeSetName.add(student2);
		treeSetName.add(student3);
		treeSetName.add(student4);
		treeSetName.add(student5);
		System.out.println("Sorting by Name");
		System.out.println(treeSetName.toString());
	}

}
