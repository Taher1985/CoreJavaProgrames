package stringimmutable;

public class StringIntern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "Taher";
		String b = a;
		System.out.println(a==b);
		
		String c = new String("Taher");
		System.out.println(b==c);
		
		String d = new String("Taher").intern();
		System.out.println(b==d);
		
		a = a.concat(" Ali");
		System.out.println(a==b);
		System.out.println(b==d);
	}

}
