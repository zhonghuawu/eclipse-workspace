package com.util1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a hash map
		HashMap<String, Double> hm = new HashMap<>();
		
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.23));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-129.12));
		
		// Get a set of the entries
		Set<Entry<String, Double>> set = hm.entrySet();
		
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
		double balance = ((Double)hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance +1000));
		System.out.println("John Doe's new balance: "+hm.get("John Doe"));
	}

}
