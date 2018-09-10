package cloneexample;

public class ClientTest {

	public static void main(String[] args) {

		Address address = new Address(1111, "SaifeeNagar", "Mumbai", 590999);
		Employee employee1 = new Employee(1001, "Taher", 30, "taher.ali@gmail.com", "pass@123",address);
		
		try {
			Object object = employee1.clone();
			Employee employee2 =(Employee)object;
			employee2.setName("Kishan");
			
			employee2.getAddress().setCity("Delhi");
			
			System.out.println("Original Employee object:::");
			System.out.println(employee1);
		
			System.out.println();
			
			System.out.println("Cloned Employee object:::");
			System.out.println(employee2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
