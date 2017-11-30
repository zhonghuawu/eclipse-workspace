package com.lang;

// Convert an integer into binary, hexadecimal and octal.
public class StringConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 19648;

		System.out.println(num + " in binary: " + Integer.toBinaryString(num));
		System.out.println(num + " in octal: 0" + Integer.toOctalString(num));
		System.out.println(num + " in hexadecimal: 0x" + Integer.toHexString(num));
	}

}
