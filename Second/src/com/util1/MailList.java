package com.util1;

// A simple mailing list example.

import java.util.*;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String n, String s, String c, String st, String cd) {
		this.name = n;
		this.street = s;
		this.city = c;
		this.state = st;
		this.code = cd;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

public class MailList {

	public static void main(String[] args) {
		//
		LinkedList<Address> ml = new LinkedList<>();
		
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));
		
		Iterator<Address> it = ml.iterator();
		while(it.hasNext()) {
			Address element = it.next();
			System.out.println(element+"\n");
		}
		System.out.println();
	}
}
