package noOfyears;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NumberOfYears1 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		String date_s = "2008-01-15"; 
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 
		Date date = dt.parse(date_s); 
		
		Calendar birthDay = new GregorianCalendar();
		birthDay.setTime(date);
		
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		
		int yearsInBetween = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR); 
		
		int monthsDiff = today.get(Calendar.MONTH) - birthDay.get(Calendar.MONTH); 
		
		long ageInMonths = yearsInBetween*12 + monthsDiff; 
		long age = yearsInBetween;
		System.out.println("Number of months since James gosling born : " + ageInMonths); 
		System.out.println("Sir James Gosling's age : " + age);


	}

}
