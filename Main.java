package date.format;

import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(findDay(12, 25, 2059));

	}

	public static String findDay(int month, int day, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		int dayNumber = c.get(Calendar.DAY_OF_WEEK);		
		switch (dayNumber) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";			
		case 3:
			return "TUESDAY";			
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";			
		case 6:
			return "FRIDAY";			
		case 7:
			return "WEDNESDAY";	
		
		}
		return "Is that right?";

	}

}
