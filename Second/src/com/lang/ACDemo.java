package com.lang;

import java.io.PrintStream;

public class ACDemo {

	static byte a[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
	static byte b[] = { 77, 77, 77, 77, 77, 77, 77, 77, 77, 77 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream ps = new PrintStream(System.out);
		
		ps.println("a = "+new String(a));
		ps.println("b = "+new String(b));
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("a = "+new String(a));
		System.out.println("b = "+new String(b));
		
		System.arraycopy(a, 0, a, 1, a.length-1);
		System.out.println("a = "+new String(a));
		System.out.println("b = "+new String(b));
		
		System.arraycopy(b, 1, b, 0, b.length-1);
		System.out.println("a = "+new String(a));
		System.out.println("b = "+new String(b));
	}

}
