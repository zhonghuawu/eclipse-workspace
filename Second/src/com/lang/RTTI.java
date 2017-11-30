package com.lang;
// Demonstrate Run-Time Type Information

class X {
	int a;
	float b;
}

class Y extends X {
	double c;
}

public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		
		Class<?> clObj = x.getClass();
		
		System.out.println("x is object of type: "+clObj.getName());
		
		clObj = y.getClass();
		System.out.println("y is object of type: "+clObj.getName());
		
		clObj = clObj.getSuperclass();
		System.out.println("y's superclass is "+clObj.getName());
	}

}
