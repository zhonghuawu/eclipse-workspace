package com.string;

import java.io.PrintStream;

public class SubStringCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte ascii[] = {65,66,67,68,69,70};
		
		String s1 = new String(ascii);
		PrintStream ps = new PrintStream(System.out);
		
		ps.println(s1);
		
		String s2 = new String(ascii, 2, 3);
		ps.println(s2);
	}

}
