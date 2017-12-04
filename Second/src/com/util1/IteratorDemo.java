package com.util1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// use iterator to display contents of al
		System.out.print("Original contents of al: ");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// modify objects begin iteratored
		ListIterator<String> lit = al.listIterator();
		while(lit.hasNext()) {
			String element = lit.next();
			lit.set(element+"+");
		}
		
		System.out.print("Modified contents of al: ");
		it = al.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		// now, display the list backwards
		System.out.print("Modified list backwards: ");
		while(lit.hasPrevious()) {
			String element = lit.previous();
			System.out.print(element+" ");
		}
		System.out.println();
	}

}
