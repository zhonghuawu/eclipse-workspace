package com.huaa.io;

import java.io.*;

public class BRRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throws IOException
		try	{
			char c;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter characters, 'q' to quit.");
			
			// read characters
			do {
				c = (char)br.read();
				System.out.println(c);
			} while(c!='q');
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException caught");
		}
	}

}
