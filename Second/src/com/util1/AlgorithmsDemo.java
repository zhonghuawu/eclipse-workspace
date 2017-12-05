// Demonstrate various algorithms.
package com.util1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create and initialize linked list
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));

		// create a reverse order comparator
		Comparator<Integer> r = Collections.reverseOrder();

		// sort list by using the comparator
		Collections.sort(ll, r);

		// get iterator
		Iterator<Integer> it = ll.iterator();

		System.out.print("List sorted in reverse: ");
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

		Collections.shuffle(ll);
		System.out.print("List shuffled: ");
		it = ll.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

		System.out.println("Minimum: "+Collections.min(ll));
		System.out.println("Maximum: "+Collections.max(ll));
	}

}
