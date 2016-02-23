package code.Ravi.mutilthreading;

/**
 * Example of synchronized method by using annonymous class
 * 
 * @author ravikson
 * 
 */
public class SynchronizedMethodUsingAnonymousClass {

	public static void main(String[] args) {
		final UserInformationSynchronized userInformation = new UserInformationSynchronized();

		// we have created the two threads by anonymous class, so less coding
		// is required.

		Thread threadOne = new Thread() {
			public void run() {
				userInformation.printInformation(5);

			}
		};

		Thread threadTwo = new Thread() {
			public void run() {
				userInformation.printInformation(2);

			}
		};

		threadOne.start();
		threadTwo.start();
	}
}
