package equalsMethod;

class Student {
	
	private String studentName;
	private int studentId;

	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

}

public class EqualsDemo1 {

	public static void main(String[] args) {
		Student student1 = new Student("Taher1", 123);
		Student student2 = new Student("Taher1", 123);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1.equals(student2));
		
		System.out.println();
		
		String string11 = new String("Bhai");
		String string22 = new String("Bhai");
		System.out.println(string11.equals(string22));
		System.out.println(string11.hashCode());
		System.out.println(string22.hashCode());
	}

}
