package code.Ravi.java.InterviewOnJavaProgram;

/**
 * Java Pass-by-Value <br/>
 * <br/>
 * 
 * Java is pass by value and not pass by reference. When you pass an instance to
 * a method, its memory address are copied bit by bit to new reference variable,
 * thus both pointing to same instance. But if you change the reference inside
 * method, original reference will not get change. If it was pass by reference,
 * then it would have got changed also.
 * 
 * @author ravikson
 * 
 */
public class JavaPassByValue {

	public static void main(String[] args) {

		Foo f = new Foo("f");
		changeRefrence(f);
		System.out.println(f.getAttribute());
		modifyRefrence(f);
		System.out.println(f.getAttribute());

	}

	private static void modifyRefrence(Foo c) {
		c.setAttribute("Ra");

	}

	private static void changeRefrence(Foo f) {
		Foo a = new Foo("p");
		f = a;

	}

}

class Foo {

	private String attribute;

	Foo(String str) {
		this.attribute = str;
	}

	/**
	 * @return the attribute
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute
	 *            the attribute to set
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
