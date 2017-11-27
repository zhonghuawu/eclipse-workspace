package com.huaa;

// create a second thread by extending Thread
class NewThread2 extends Thread {
	public NewThread2() {
		// TODO Auto-generated constructor stub
		super("Demo Thread");
		System.out.println("Child thread: "+this);
		start();
	}
	
	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i=5;i>0; --i) {
				System.out.println("Child thread: "+i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread2();
		
		try {
			for(int i=5; i>0; --i) {
				System.out.println("Main thread: "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}

}
