package datecompare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparision {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
	        Date paidToDate = sdf.parse("11/07/2006");
	        Date effectiveDate = sdf.parse("10/27/2007");

	        System.out.println("date1 : " + sdf.format(paidToDate));
	        System.out.println("date2 : " + sdf.format(effectiveDate));

	        if (paidToDate.compareTo(effectiveDate) > 0) {
	            System.out.println("paidToDate is after effectiveDate");
	        } 
	          else if (paidToDate.compareTo(effectiveDate) < 0) {
	            System.out.println("paidToDate is before effectiveDate");
	        } 
	          else if (paidToDate.compareTo(effectiveDate) == 0) {
	            System.out.println("paidToDate is equal to effectiveDate");
	        } 
	          else {
	            System.out.println("How to get here?");
	        }

	}

}
