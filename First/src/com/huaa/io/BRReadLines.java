package com.huaa.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			
			System.out.println("Enter lines of text.");
			System.out.println("Enter 'stop' to quit.");
			
			// read string
			do {
				str = br.readLine();
				System.out.println(str);
			} while (!str.equals("stop"));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException caught");
		}
	}

}
