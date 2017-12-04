package com.util1;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();

		// add elements to the array list
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));

		System.out.println("Contents of al: " + al);
		Object ia[] = al.toArray();

		int sum = 0;

		// sum the array

		for (int i = 0; i < ia.length; ++i) {
			sum += ((Integer) ia[i]).intValue();
		}
		System.out.println("Sum is: " + sum);
	}

}
