package com.huaa.aio;

public class TimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 8080;
		new Thread(new AsyncTimeClientHandler("localhost", port), "AIO-AsyncTimeClientHandler-001").start();;

	}

}
