package com.util1;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree map
		TreeMap<String, Double> tm = new TreeMap<>();
		
		// Put elements to the map
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.23));
		tm.put("Todd Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-129.12));

		// Get a set of the entries
		Set<Entry<String, Double>> set = tm.entrySet();
		
		// Get an iterator
		Iterator<Entry<String, Double>> it = set.iterator();
		
		// Display elements
		while(it.hasNext()) {
			Entry<String, Double> me = it.next();
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		// Deposit 1000 into John Doe's account
		double balance = ((Double)tm.get("John Doe")).doubleValue();
		tm.put("John Doe", new Double(balance +1000));
		System.out.println("John Doe's new balance: "+tm.get("John Doe"));

	}

}
