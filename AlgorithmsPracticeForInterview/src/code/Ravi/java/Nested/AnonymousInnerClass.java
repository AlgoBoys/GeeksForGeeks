package code.Ravi.java.Nested;

/**
 * An inner class declared without a class name is known as an anonymous inner
 * class. In case of anonymous inner classes, we declare and instantiate them at
 * the same time. Generally they are used whenever you need to override the
 * method of a class or an interface.
 * 
 * @author ravikson
 * 
 */
public class AnonymousInnerClass {

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("Hallo anonymous class");
			}
		}.start();
	}

}
