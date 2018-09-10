package stringimmutable;

public class StringPassbyRefDemo {

	public void testStrObj(String str) {
		str = new String("Taheri");
	}
	
	public void testStrLiteral(String str) {
		str ="Taheri";
	}
	
	public static void main(String[] args) {
		String strObj = new String("Taher");
		new StringPassbyRefDemo().testStrObj(strObj);
		System.out.println(strObj);
		
		String strLiteral = "Taher";
		new StringPassbyRefDemo().testStrLiteral(strLiteral);
		System.out.println(strLiteral);
	}

}
