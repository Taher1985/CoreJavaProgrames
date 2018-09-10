package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class College {

	private String collegeName;
	private int collegeId;
	private static String collegeDomain;
	
	public College() { //The no-arg contructor of every non-serializable superclass will run when an object is deserialized. 
		super();	   // If this is violated, readObject() will produce a java.io.InvalidClassException in runtime.
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public static String getCollegeDomain() {
		return collegeDomain;
	}

	public static void setCollegeDomain(String collegeDomain) {
		College.collegeDomain = collegeDomain;
	}

}

class Student extends College implements Serializable {

	private static final long serialVersionUID = 1L;
	private String studentName;
	private int studentId;
	private static String studentDomain;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public static String getStudentDomain() {
		return studentDomain;
	}

	public static void setStudentDomain(String studentDomain) {
		Student.studentDomain = studentDomain;
	}

}

public class ChildClassSerializationTest {

	public static void main(String[] args) {
		Student serializedStudent = new Student("Taher", 123);
		serializedStudent.setCollegeId(456);
		serializedStudent.setCollegeName("JIT");
		serializedStudent.setCollegeDomain("Technology");
		serializedStudent.setStudentDomain("CS");
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		FileInputStream fis;
		ObjectInputStream ois;
		Student deserializedStudent; 

		try {
			fos = new FileOutputStream("myclass.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serializedStudent);
			oos.close();
			fos.close();
			System.out.println("Serialized");
			System.out.println("College Name   : "+ serializedStudent.getCollegeName());
			System.out.println("College Id     : "+ serializedStudent.getCollegeId());
			System.out.println("Student Name   : "+ serializedStudent.getStudentName());
			System.out.println("Student Id     : "+ serializedStudent.getStudentId());
			System.out.println("College Domian : "+ serializedStudent.getCollegeDomain());
			System.out.println("Student Domian : "+ serializedStudent.getStudentDomain());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("If static variable is serialized then, it has to show old value for Company and Employ Domain");
		serializedStudent.setCollegeName("MIT");
		serializedStudent.setCollegeId(791);
		serializedStudent.setStudentName("Nitin");
		serializedStudent.setStudentId(010);
		serializedStudent.setCollegeDomain("Pharma");
		serializedStudent.setStudentDomain("Biotech");
		
		System.out.println();
		
		try{ 
			fis = new FileInputStream("myclass.ser");
			ois = new ObjectInputStream(fis);
			deserializedStudent = (Student) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Deserialized");
			System.out.println("College Name   : "+ deserializedStudent.getCollegeName());
			System.out.println("College Id     : "+ deserializedStudent.getCollegeId());
			System.out.println("Student Name   : "+ deserializedStudent.getStudentName());
			System.out.println("Student Id     : "+ deserializedStudent.getStudentId());
			System.out.println("College Domian : "+ deserializedStudent.getCollegeDomain());
			System.out.println("Student Domian : "+ deserializedStudent.getStudentDomain());
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();                   
		}

	}

}
