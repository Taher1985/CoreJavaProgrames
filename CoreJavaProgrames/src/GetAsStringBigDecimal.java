import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class GetAsStringBigDecimal {

	public static Object getAsObject(String newValue)
	{
		if (newValue == null)
			return newValue;

		newValue = newValue.trim();
		if (newValue.length() == 0)
			return null;

		newValue = newValue.trim();
		if (newValue.length() == 0)
			return new BigDecimal(0);

		NumberFormat numberFormat = NumberFormat.getPercentInstance(Locale.US);
		numberFormat.setMinimumFractionDigits(14); 
		numberFormat.setMaximumFractionDigits(14);
		if (numberFormat instanceof DecimalFormat) {
			DecimalFormat df = (DecimalFormat) numberFormat;
			df.setNegativePrefix("(");
			df.setNegativeSuffix("%)");
			df.setParseBigDecimal(true);
		}
		Number numericValue = null;
		try {
			numericValue = numberFormat.parse(newValue);
			numericValue =new BigDecimal(numericValue.toString()).multiply(new BigDecimal(100)).setScale(14,RoundingMode.DOWN); 
		} catch (ParseException pe) {
			try {
				numericValue = new BigDecimal(newValue);
			} catch(Exception e) {
				pe.printStackTrace();
			}
		}

		return numericValue;
	}

	public static String getAsString(Object value) 
	{
		if (value == null)
			return null;

		if (value.toString().length() == 0)
			return null;

		BigDecimal inputVal = new BigDecimal(value.toString());

		if (inputVal == new BigDecimal(0))
			return "";

		NumberFormat numberFormat = NumberFormat.getPercentInstance(Locale.US);
		numberFormat.setMinimumFractionDigits(15); 
		numberFormat.setMaximumFractionDigits(15);
		if (numberFormat instanceof DecimalFormat) {
			DecimalFormat df = (DecimalFormat) numberFormat;
			df.setNegativePrefix("(");
			df.setNegativeSuffix("%)");
		}

		String num = null;
		//String str = inputVal.toString();
		
		num = numberFormat.format(new BigDecimal(95.1).divide(new BigDecimal(100)));//.add(new BigDecimal(0.00000000000000001)));
		
		return num;
	}

	public static void main(String[] args) {
		System.out.println("String : " +getAsString(0.0));
		//System.out.println("Object : " +getAsObject("2.40000000000000"));
	}

}
