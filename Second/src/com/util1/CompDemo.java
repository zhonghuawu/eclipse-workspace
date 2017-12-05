package com.util1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// Use a custom comparator.

// A reverse comparator for strings.
class MyComp implements Comparator<String> {
	// override compare
	public int compare(String a, String b) {
		return b.compareTo(a);
	}

	// no need to override equals
}

public class CompDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>(new MyComp());

		// add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		// get an iterator
		Iterator<String> it = ts.iterator();

		// display elements
		while (it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
