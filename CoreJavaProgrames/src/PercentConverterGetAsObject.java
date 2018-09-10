import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class PercentConverterGetAsObject {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		NumberFormat numberFormat = NumberFormat.getPercentInstance(Locale.US);
		 if (numberFormat instanceof DecimalFormat) {
	            DecimalFormat df = (DecimalFormat) numberFormat;
	            df.setNegativePrefix("(");
	            df.setNegativeSuffix("%)");
	        }
		String newValue = "57.00000000000000%";
		Number numericValue = numberFormat.parse(newValue);
		numericValue = new Double(numericValue.doubleValue() * 100);
		System.out.println(numericValue);
	}

}
