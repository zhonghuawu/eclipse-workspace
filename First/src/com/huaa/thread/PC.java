package com.huaa.thread;

class Q {
	int n;

	synchronized int get() {
		System.out.println("Got: " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}

class Producer implements Runnable {
	Q q;
	
	public Producer(Q q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
}

public class PC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press Ctrl-C to stop.");
	}

}
