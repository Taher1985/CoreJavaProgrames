import java.math.*;
import java.util.*;

public class DoubleValueof {

	/**
	 * @param args
	 */

	private static String buildDoubleSetExpression(String value)
	{
		StringBuffer buf = new StringBuffer("BigDecimal.valueOf(");
		if (value == null || value.trim().length() == 0)
			buf.append("0d");
		else
			buf.append(value);
		buf.append(")");
		return buf.toString();
	}
	
	public static void main(String[] args) {
		String value = "15";
		System.out.println(buildDoubleSetExpression(value));
		//BigDecimal.valueOf(15);
	}

}
