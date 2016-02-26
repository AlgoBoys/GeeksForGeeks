package code.Ravi.java.Nested;

/**
 * 
 * @author ravikson
 * 
 */
public class Outer_Demo {
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		outer.display_Inner();
	}
}

class OuterClass {
	private int num = 175;

	class Nested_Demo {
		public void print() {
			System.out.println("This is an inner class");
		}

		public int getNum() {
			System.out.println("This is the getnum method of the inner class");
			return num;
		}
	}

	void display_Inner() {
		Nested_Demo inner = new Nested_Demo();
		inner.print();
		System.out.println(inner.getNum());
	}
}
