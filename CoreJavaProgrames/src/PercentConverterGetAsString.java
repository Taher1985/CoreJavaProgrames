import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class PercentConverterGetAsString {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		NumberFormat numberFormat = NumberFormat.getPercentInstance(Locale.US);
		numberFormat.setMinimumFractionDigits(14); 
        numberFormat.setMaximumFractionDigits(14);
		if (numberFormat instanceof DecimalFormat) {
			DecimalFormat df = (DecimalFormat) numberFormat;
			df.setNegativePrefix("(");
			df.setNegativeSuffix("%)");
		}
		double inputVal = 0;
		try {
			inputVal = new Double("45.00000000000000".toString()).doubleValue();                          
		} catch (Exception ce) {
			ce.printStackTrace();
		}
		String num = null;
		try {
			num = numberFormat.format(inputVal / 100);
			/*String doubleToString = String.valueOf(inputVal);  
			num = numberFormat.format(new BigDecimal(doubleToString).divide(new BigDecimal(100)));*/
		} catch(Exception pe) {
			pe.printStackTrace();
		}
		System.out.println(num);
		
		if(0.5 - 1.2 > 100) {
			System.out.println("first");
		}
		if(0.5 - 1.2 < 0) {
			System.out.println("second");
		}
	}

}
