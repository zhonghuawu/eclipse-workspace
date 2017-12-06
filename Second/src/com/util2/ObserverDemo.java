// Demonstrate the Observable class and the Observer interface.
package com.util2;

import java.util.*;

// This is the observing class.
class Watcher implements Observer {
	public void update(Observable obj, Object arg) {
		System.out.println("Update() called, count is " + ((Integer) arg).intValue());
	}
}

// this the class being observed.
class BeingWatched1 extends Observable {
	void counter(int period) {
		for(; period>=0; period--) {
			this.setChanged();
			this.notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Sleep interrupted");
			}
		}
	}
}

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeingWatched1 observed = new BeingWatched1();
		Watcher observing = new Watcher();
		
		observed.addObserver(observing);
		observed.counter(10);
		
	}

}
