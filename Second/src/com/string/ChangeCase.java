package com.string;

// Demonstrate toUpperCase() and toLowerCase().
public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is a test.";
		System.out.println("Original£º" + s);

		String upper = s.toUpperCase();
		String lower = s.toLowerCase();

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}

}
