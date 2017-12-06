// Demonstrate Calendar

package com.util2;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] months = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"
		};
		
		Calendar calendar = Calendar.getInstance();
		
		// Display current time and date information.
		System.out.print("Date: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" "+calendar.get(Calendar.DATE)+" ");
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.print("Time: ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
		
		// set the time and date information and display it.
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);
		
		System.out.print("Updateed Time: ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
	}

}
