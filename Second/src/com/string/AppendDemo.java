package com.string;

// Demonstrate append().
public class AppendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		int a = 42;
		StringBuffer sb = new StringBuffer(40);
		
		s = sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
	}

}
