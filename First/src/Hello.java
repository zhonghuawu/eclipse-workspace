// package Hello;
import hello.Test;

public class Hello {
	public static void main(String []agrs) {
		System.out.println("Hello word");
		Test t = new Test();
		t.run();
		new Test().run();
	}
}
