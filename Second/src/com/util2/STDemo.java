package com.util2;

import java.util.StringTokenizer;

public class STDemo {
	
	static String in = "title=Java: The Complete Reference;"
			+"auther=Schildt;"
			+"publisher=Oshorne/McGraw-Hill;"
			+"copyright=2001";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(in, "=;");
		
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key+"\t"+val);
		}
	}

}
