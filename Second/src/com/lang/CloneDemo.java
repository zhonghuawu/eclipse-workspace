// Demonstrate the clone() method

package com.lang;

class TestClone implements Cloneable {
	int a;
	double b;

	// This method calls Object's clone()
	TestClone cloneTest() {
		try {
			// call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.out.println("Clone not allowed.");
			return this;
		}
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClone x1 = new TestClone();
		TestClone x2;
		x1.a = 10;
		x1.b = 20.98;

		x2 = x1.cloneTest();

		System.out.println("x1: " + x1.a + ", " + x1.b);
		System.out.println("x2: " + x2.a + ", " + x2.b);
	}

}
