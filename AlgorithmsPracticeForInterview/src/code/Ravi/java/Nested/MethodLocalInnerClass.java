package code.Ravi.java.Nested;

public class MethodLocalInnerClass {

	public static void main(String args[]) {
		MethodLocalInnerClass outer = new MethodLocalInnerClass();
		outer.my_Method();
	}

	void my_Method() {
		final int num = 23;

		// method-local inner class
		class MethodInner_Demo {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		}// end of inner class

		// Accessing the inner class
		MethodInner_Demo inner = new MethodInner_Demo();
		inner.print();
	}
}
