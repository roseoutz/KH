package Utill_Package.Calendar;

public class CalendarEx8 {
	
	public static void main(String[] args) {
	

	String date1 = "201408";
	String date2 = "201305";
	
	int month1 = Integer.parseInt(date1.substring(0,4))*12 + Integer.parseInt(date1.substring(4));
	int month2 = Integer.parseInt(date2.substring(0,4))*12 + Integer.parseInt(date2.substring(4));
	System.out.println(Integer.parseInt(date1.substring(0,4)));
	System.out.println(Integer.parseInt(date2.substring(0,4)));
	System.out.println(Integer.parseInt(date1.substring(4)));
	System.out.println(Integer.parseInt(date2.substring(4)));
	System.out.println(month1);
	System.out.println(month2);
	System.out.println(date1 +"과 " + date2 + "의 차이는 " + Math.abs(month1-month2) + "개월 입니다.");

	}
}
