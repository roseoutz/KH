package Utill_Package.Calendar;

import java.util.*;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		CalendarEx5 date1 = CalendarEx5.getInstance();
		CalendarEx5 date2 = CalendarEx5.getInstance();
		
		date1.set(1992,0,8);
		
		System.out.println("date1 : " + toString(date1)+
		DAY_OF_WEEK[date2.get(CalendarEx5.DAY_OF_WEEK)]+"이고,"+
		"오늘(date2)은" + toString(date2) + DAY_OF_WEEK[date2.get(CalendarEx5.DAY_OF_WEEK)]+"요일입니다.");
		
	long diff = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
	System.out.println("그 날(date1)부터 지금(date2)까지 " + diff +"초가 지났습니다.");
	System.out.println("일(day)로 계산하면 " + diff/(24*60*60) +"일입니다.");
	}
	
	public static String toString(CalendarEx5 date) {
		return date.get(CalendarEx5.YEAR)+"yy"+(date.get(CalendarEx5.MONTH)+1)+"mm"+(date.get(CalendarEx5.DATE)+"dd");
	}

}
