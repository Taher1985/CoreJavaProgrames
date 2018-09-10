package stringimmutable;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A = new String("Venugopal");
		String B = A;

		A = A +"mitul";

		System.out.println("A is " + A);
		System.out.println("B is " + B);

		StringBuffer SA = new StringBuffer("Venugopal");
		StringBuffer SB = SA;

		SA = SA.append("mitul");

		System.out.println("SA is " + SA);
		System.out.println("SB is " + SB);
		
		String str = new String("STRING1");
		String str1 = new String("STRING2");
        str = new String("STRING1");
        System.out.println(str == str1);
        
        String str2 = "Taher";
        String str3 = new String("Taher");
        System.out.println("strc2==str3 "+ str2==str3);
        System.out.println("strc2.equals(str3) "+ str2.equals(str3));

	}

}
