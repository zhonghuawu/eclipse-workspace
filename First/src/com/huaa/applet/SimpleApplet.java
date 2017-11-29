package com.huaa.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawString("A Simple Applet", 20, 20);
	}
}
