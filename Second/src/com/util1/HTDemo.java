// Demonstrate a Hash table
package com.util1;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Double> balance = new Hashtable<>();
		Enumeration<String> names;
		String str;
		double bal;

		// Put elements to the Hash table
		balance.put("John Doe", new Double(3434.34));
		balance.put("Tom Smith", new Double(123.22));
		balance.put("Jane Baker", new Double(1378.23));
		balance.put("Todd Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-129.12));

		// Show all balance in hash table
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

		bal = ((Double) balance.get("John Doe")).doubleValue();
		balance.put("John Doe", new Double(bal + 1000));
		System.out.println("John Doe's new balance: " + balance.get("John Doe"));

	}

}
