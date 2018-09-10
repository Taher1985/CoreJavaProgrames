package callByReferenceAndCallByValue;

public class StringPassByRefEx {

	public void setValue(String value) {
		value = "I am now set to a value";
	}

	public static void main(String args[]) {
		StringPassByRefEx test = new StringPassByRefEx();
		String str1 = "";
		String str2 = new String("NO");
		test.setValue(str1);
		System.out.println("str1=" + str1);
		test.setValue(str2);
		System.out.println("str2=" + str2);
	}

	public String setValue() {
		return "I am now set to a value";
	}

}
