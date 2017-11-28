package com.huaa;

class QF extends Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Got: " + n);
		valueSet = false;

		notify();
		return n;
	}

	synchronized void put(int n) {
		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("InterruptedException caught.");
			}
		}

		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}

public class PCFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new QF();
		
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press Ctrl-C to stop.");
	}

}
