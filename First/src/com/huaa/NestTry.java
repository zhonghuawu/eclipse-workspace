package com.huaa;

public class NestTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = args.length;
			int b = 42 / a;

			System.out.println("a = " + a);
			try { // nested try block
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out-of-bounds: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}
	}

}
