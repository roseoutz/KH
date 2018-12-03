package Utill_Package.Calendar.etc;

import java.text.*;
import java.util.*;
import static java.lang.System.out;

public class DateFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Pattern = "yyyy/MM/dd";
	DateFormat df = new SimpleDateFormat(Pattern);
	
	Scanner s = new Scanner(System.in);
	
	Date inDate = null;
	
	out.println("Date pattern is "+Pattern+" . plz input(ex2007/05/11)");
	while(s.hasNextLine()) {
		try {
			inDate = df.parse(s.nextLine());
			break;
		} catch(Exception e) {
			out.println("plz input like pattern");
		}
	}
	
	Calendar cal = Calendar.getInstance();
	cal.setTime(inDate);
	Calendar today = Calendar.getInstance();
	long day = (cal.getTimeInMillis()-today.getTimeInMillis())/(60*60*1000);
	}

}
