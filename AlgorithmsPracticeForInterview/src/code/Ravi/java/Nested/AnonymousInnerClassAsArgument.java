package code.Ravi.java.Nested;

/**
 * 
 * @author ravikson
 *
 */
public class AnonymousInnerClassAsArgument {

	public void displayMessage(Message m) {
		System.out
				.println(m.greet()
						+ ", This is an example of anonymous inner calss as an argument");
	}

	public static void main(String[] args) {
		AnonymousInnerClassAsArgument anonymousInnerClass = new AnonymousInnerClassAsArgument();
		anonymousInnerClass.displayMessage(new Message() {
			@Override
			public String greet() {
				return "Hello";
			}
		});
	}

}

interface Message {
	String greet();
}
