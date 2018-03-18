package com.huaa.nio;

import java.io.IOException;

/**
 * Non-blocking time server
 * 
 * @author Huaa
 *
 */

public class TimeServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int port = 8080;

		MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
		new Thread(timeServer, "NIO-MultiplexerTimerServer-001").start();

	}

}
