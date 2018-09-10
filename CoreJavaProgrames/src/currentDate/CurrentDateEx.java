package currentDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentDateEx {


	public static void main(String[] args) throws ParseException  {  
		String input = "2012/01/20 12:05:10.321";
		DateFormat inputFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = inputFormatter.parse(input);

		DateFormat outputFormatter = new SimpleDateFormat("HH:mm:ss.SSS");
		String output = outputFormatter.format(date); // Output : 01/20/2012
		System.out.println(output);
	}    

}
