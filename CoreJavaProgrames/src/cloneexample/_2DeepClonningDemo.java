package cloneexample;

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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}

class College implements Cloneable {
	private int collegeId;
	private String collegeName;
	private Student student;

	public College(int collegeId, String collegeName, Student student) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.student = student;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = new Student(this.getStudent().getStudentId(), this.getStudent().getStudentName());
		College college = new College(this.getCollegeId(), this.getCollegeName(), student);
		return college;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", student=" + student + "]";
	}

}

public class _2DeepClonningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student(123, "Taher");
		College collegeOriginal = new College(456, "JIT", student);

		System.out.println("Original Object");
		System.out.println(student);
		System.out.println(collegeOriginal);

		System.out.println();
		
		College collegeClone = (College) collegeOriginal.clone();
		System.out.println("Cloned Object");
		System.out.println(collegeOriginal);
		System.out.println(collegeClone);
		
		System.out.println();

		System.out.println("Changes doing in cloned object only in College i.e String obj");
		collegeClone.setCollegeName("MIT");
		System.out.println(collegeOriginal);
		System.out.println(collegeClone);
		
		System.out.println();
		
		System.out.println("Changes doing in cloned object's reference object i.e Student obj");
		collegeClone.getStudent().setStudentName("Nitin");
		System.out.println(collegeOriginal);
		System.out.println(collegeClone);
	}

}
