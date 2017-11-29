package com.huaa.io;

import java.io.PrintWriter;

public class PrinteWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("This is a string");
		
		int i=-7;
		
		pw.println(i);
		double d=4.5e-5;
		pw.println(d);
	}

}
