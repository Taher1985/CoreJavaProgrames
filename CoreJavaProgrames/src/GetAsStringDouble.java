import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class GetAsStringDouble {

	public static Object getAsObject(String newValue)
	{
		if (newValue == null)
			return newValue;

		newValue = newValue.trim();
		if (newValue.length() == 0)
			return null;

		newValue = newValue.trim();
		if (newValue.length() == 0)
			return new Double(0);

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
			numericValue =new BigDecimal(numericValue.toString()).multiply(new BigDecimal(100)).setScale(15,RoundingMode.DOWN); 
		} catch (ParseException pe) {
			try {
				numericValue = new Double(newValue);
			} catch(Exception e) {
			}
		}

		return numericValue;
	}

	public static String getAsString(Object value)	{

		if (value == null)
			return null;

		if (value.toString().length() == 0)
			return null;

		double inputVal = 0;
		try {
			inputVal = new Double(value.toString()).doubleValue();                          
		} catch (Exception ce) {
		}

		if (inputVal == 0)
			return "";

		NumberFormat numberFormat = NumberFormat.getPercentInstance(Locale.US);
		numberFormat.setMinimumFractionDigits(14); 
		numberFormat.setMaximumFractionDigits(14);
		if (numberFormat instanceof DecimalFormat) {
			DecimalFormat df = (DecimalFormat) numberFormat;
			df.setNegativePrefix("(");
			df.setNegativeSuffix("%)");
		}

		String num = null;
		try {
			num = numberFormat.format(new BigDecimal(inputVal).divide(new BigDecimal(100)));
		} catch(Exception pe) {
		}

		return num;
	}
	public static void main(String[] args) {
		System.out.println("String : " +getAsString(2.4));
		System.out.println("Object : " +getAsObject("2.40000000000000"));
	}

}
