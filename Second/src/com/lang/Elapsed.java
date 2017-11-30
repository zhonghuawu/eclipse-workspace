package com.lang;

public class Elapsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start, end;
		
		System.out.println("TIming a for loop from 0 to 1,000,000");
		
		// time a for loop from 0 to 1,000,000
		
		start = System.currentTimeMillis();
		for(int i=0; i<1000000; ++i);
		end = System.currentTimeMillis();
		
		System.out.println("Elapsed time: "+(end-start));
	}

}
