package code.Ravi.java.Nested;

/**
 * A static inner class is a nested class which is a static member of the outer
 * class. It can be accessed without instantiating the outer class, using other
 * static members.
 * 
 * @author ravikson
 * 
 */
public class StaticNestedClass {

	static class Nested_Demo {
		public void my_method() {
			System.out.println("This is my nested class");
		}
	}

	public static void main(String args[]) {
		StaticNestedClass.Nested_Demo nested = new StaticNestedClass.Nested_Demo();
		nested.my_method();
	}

}
