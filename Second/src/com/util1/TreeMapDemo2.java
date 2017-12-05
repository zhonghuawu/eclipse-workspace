package com.util1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

// use a comparator to sort accounts by last name.

// compare last whole word in two strings
class TComp implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub

		int i, j, k;
		i = a.lastIndexOf(' ');
		j = b.lastIndexOf(' ');

		k = a.substring(i).compareTo(b.substring(j));

		if (k == 0) // last names match, check entire name
			return a.compareTo(b);
		return k;
	}

}

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree map
		TreeMap<String, Double> tm = new TreeMap<>(new TComp());

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
		while (it.hasNext()) {
			Entry<String, Double> me = it.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into John Doe's account
		double balance = ((Double) tm.get("John Doe")).doubleValue();
		tm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " + tm.get("John Doe"));

	}

}
