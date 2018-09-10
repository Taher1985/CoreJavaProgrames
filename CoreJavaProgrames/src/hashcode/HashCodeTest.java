package hashcode;

public class HashCodeTest {

	public static void main(String[] args) {
		String s = "Taher";
		int hash = s.hashCode();
		System.out.println(hash);
		
		String t = new String("Taher");
		int hash1 = t.hashCode();
		System.out.println(hash1);
	}

}
