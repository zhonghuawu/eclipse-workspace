// Demonstrate URL.

package com.net;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL hp = new URL("http://www.osborne.com/download");
		
		System.out.println("Rrotocol: "+hp.getProtocol());
		System.out.println("Port: "+hp.getPort());
		System.out.println("Host: "+hp.getHost());
		System.out.println("File: "+hp.getFile());
		System.out.println("Ext: "+hp.toExternalForm());
	}

}
