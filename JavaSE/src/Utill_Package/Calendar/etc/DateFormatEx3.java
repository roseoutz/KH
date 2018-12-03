package Utill_Package.Calendar.etc;

import java.util.*;
import java.text.*;

public class DateFormatEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2013년 3월 10일");
			
			System.out.println(df2.format(d));
		} catch(Exception e) {}
	}

}
