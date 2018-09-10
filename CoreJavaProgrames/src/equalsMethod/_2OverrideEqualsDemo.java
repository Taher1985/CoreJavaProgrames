package equalsMethod;

class Student1 {

	private int studentId;
	private String studentName;

	public Student1(int studentId, String studentName) {
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
		Student1 student = (Student1) obj;
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
		Student1 student1 = new Student1(123, "Taher");
		Student1 student2 = new Student1(456, "Nitin");
		Student1 student3 = new Student1(789, "Taher");
		Student1 student4 = student1;
		Student1 student5 = new Student1(123, "Taher");

		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student1.equals(student4));
		System.out.println(student1.equals(student5));
	}

}
