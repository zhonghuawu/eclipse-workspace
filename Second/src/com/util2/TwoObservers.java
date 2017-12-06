// An object may be observed by two or more observers
package com.util2;

import java.util.Observable;
import java.util.Observer;

// this is the first observing class.
class Watcher1 implements Observer {
	public void update(Observable obj, Object arg) {
		System.out.println("Update() called, count is " + ((Integer) arg).intValue());
	}
}

// this the second observing class.
class Watcher2 implements Observer {
	public void update(Observable obj, Object arg) {
		// Ring bell when done
		if (((Integer) arg).intValue() == 0)
			System.out.println("Done" + "\7");
	}
}

class BeingWatched2 extends Observable {
	void counter(int period) {
		for (; period >= 0; period--) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Sleep interrupted");
			}
		}
	}
}

public class TwoObservers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeingWatched2 observed = new BeingWatched2();
		Watcher1 observing1 = new Watcher1();
		Watcher2 observing2 = new Watcher2();

		observed.addObserver(observing1);
		observed.addObserver(observing2);

		observed.counter(10);
	}

}
