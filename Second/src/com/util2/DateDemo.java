// Show date and time using only Date methods
package com.util2;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println(date);
		
		long msec = date.getTime();
		System.out.println("Milliseconds size Jan. 1, 1970 GMT = "+msec);
	}

}
