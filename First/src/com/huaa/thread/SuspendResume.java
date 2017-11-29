package com.huaa.thread;

class NewThread3 implements Runnable {

	String name;
	Thread t;
	boolean suspendFlag;

	public NewThread3(String threadName) {
		// TODO Auto-generated constructor stub
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		suspendFlag = false;
		t.start();
	}

	public void run() {
		try {
			for (int i = 15; i > 0; --i) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
	
	void mysuspend() {
		suspendFlag = true;
	}
	
	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}

public class SuspendResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewThread3 ob1 = new NewThread3("One");
		NewThread3 ob2 = new NewThread3("Two");
		
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread One");
			
			ob2.mysuspend();
			System.out.println("Suspend thread Two");
			ob2.myresume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread Interrupted");
		}
		
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}

}
