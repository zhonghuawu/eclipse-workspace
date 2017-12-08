// Demonstrate Sockets.

package com.net;

import java.net.*;
import java.io.*;

public class Whois {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("baidu.com", 80);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		String str = (args.length == 0 ? "osborne.com" : args[0]) + "\n";
		byte[] buf = str.getBytes();
		out.write(buf);
		int c;
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		s.close();
	}

}
