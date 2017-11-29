package com.huaa.other;

public class NativeDemo {

	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NativeDemo ob = new NativeDemo();

		ob.i = 10;
		System.out.println("This is ob.i before the native method:" + ob.i);

		ob.test();
		System.out.println("This is ob.i after the native method:" + ob.i);
	}

	// declare native method
	public native void test();

	// load DLL that contains static method
	static {
		System.loadLibrary("NativeDemo");
	}

}
