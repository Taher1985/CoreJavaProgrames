package _1equalsMethod;

class Student {

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		if ((this.getStudentId() == student.getStudentId())
				&& (this.getStudentName().equals(student.getStudentName()))) {
			return true;
		} else {
			return false;
		}
	}
}

public class _2OverrideEqualsDemo {

	public static void main(String[] args) {
		Student student1 = new Student(123, "Taher");
		Student student2 = new Student(456, "Nitin");
		Student student3 = new Student(789, "Taher");
		Student student4 = student1;
		Student student5 = new Student(123, "Taher");

		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student1.equals(student4));
		System.out.println(student1.equals(student5));
	}

}
