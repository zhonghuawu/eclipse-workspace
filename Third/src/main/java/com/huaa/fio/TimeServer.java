package com.huaa.fio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.huaa.bio.TimeServerHandler;

/**
 * fake asynchronous i/o
 * 
 * @author Huaa
 *
 */
public class TimeServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int port = 8080;

		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			System.out.println("The time server is start in port: "+port);
			TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50, 100000);
			while(true) {
				Socket socket = server.accept();
				singleExecutor.execute(new TimeServerHandler(socket));
			}
		} finally {
			if (server != null) {
				System.out.println("The time server close");
				server.close();
				server = null;
			}
		}

	}

}
