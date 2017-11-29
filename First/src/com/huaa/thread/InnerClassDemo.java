package com.huaa.thread;

class Outer {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; ++i) {
			@SuppressWarnings("hiding")
			class Inner {
				void display() {
					System.out.println("display outer_x: " + outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
	
	//this is an inner class
	class Inner {
		int inner_y = 200;
		
		class Inner_inner {
			void display() {
				System.out.println("display inner_y: " + inner_y);
			}
		}
		void display() {
			System.out.println("display outer_x: " + outer_x);
			new Inner_inner().display();
		}
	}
	
	void test_inner_inner() {
		new Inner().display();
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.test();
		outer.test_inner_inner();
	}

}
