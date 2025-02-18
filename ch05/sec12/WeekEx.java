package ch05.sec12;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		// 오늘 요일 얻기 (1-7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.SUNDAY;	break;
		case 2: today = Week.MONDAY;	break;
		case 3: today = Week.TUESDAY;	break;
		case 4: today = Week.WEDNESDAY;	break;
		case 5: today = Week.THURSDAY;	break;
		case 6: today = Week.FRIDAY;	break;
		case 7: today = Week.SATURDAY;	break;
		}
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일은 쉬는 날");
		} else {
			System.out.println("오늘은 공부하는 날");
		}
	}

}
