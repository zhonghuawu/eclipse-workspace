package com.huaa.thread;

// create multiple threads
class NewThread implements Runnable {
	String name;
	Thread t;
	
	public NewThread(String threadName) {
		// TODO Auto-generated constructor stub
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: "+t);
		t.start();
	}
	
	//This is the entry point for thread.
	public void run() {
		try {
			for(int i=5; i>0; --i) {
				System.out.println(name+": "+i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println(name+ " Interrupted.");
		}
		System.out.println(name+" exiting.");
	}
}


public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		
		try {
			//wait for other threads to end
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread Interrupted.");
		}
		System.out.println("Main thread exiting.");
	}

}
