// Demonstrate InetAddress.

package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		address = InetAddress.getByName("osborne.com");
		System.out.println(address);
		InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
		for(int i=0; i<sw.length; ++i)
			System.out.println(sw[i]);

	}

}
