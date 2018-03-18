package com.huaa.aio;

public class TimeServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int port = 8080;
		AsyncTimeServerHandler timeHandler = new AsyncTimeServerHandler(port);
		new Thread(timeHandler, "AIO-AsyncTimeServerHandler-001").start();
	}

}
