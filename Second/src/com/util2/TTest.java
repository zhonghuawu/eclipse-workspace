// Demonstrate Timer and TimerTask
package com.util2;

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {
	public void run() {
		System.out.println("Timer task executed.");
	}
}

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTimerTask myTask = new MyTimerTask();
		
		Timer myTimer = new Timer();
		
		// set an initial delay of 1 second, then repeat every half second.
		myTimer.schedule(myTask, 1000, 500);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			myTimer.cancel();
		}
	}

}
