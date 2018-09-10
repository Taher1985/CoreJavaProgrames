package stringMethods;

public class StringMethodsDemo {

	
	public static void main(String[] args) {
		String s = new String("Taher");
		String s1 = "Taher";
		System.out.println(s==s1);
		
		String s2 = "taher";
		String s3 = s2.toLowerCase();
		System.out.println(s2 == s3);
		
		String s4 = s.toUpperCase();
		System.out.println(s == s4);
		
		String s5 =  new String(s);
		System.out.println(s == s5);
	}

}
