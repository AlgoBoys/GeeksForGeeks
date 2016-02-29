package code.Ravi.java.mutilthreading;

/**
 * Synchronized block in java
 * 
 * @author ravikson
 * 
 * @description <i>Synchronized block can be used to perform synchronization on
 *              any specific resource of the method. Suppose you have 50 lines
 *              of code in your method, but you want to synchronize only 5
 *              lines, you can use synchronized block.If you put all the codes
 *              of the method in the synchronized block, it will work same as
 *              the synchronized method.</i>
 *              <ul>
 *              <li>Synchronized block is used to lock an object for any shared
 *              resource.</li>
 *              <li>Scope of synchronized block is smaller than the method.</li>
 *              </ul>
 */
public class SynchronizedBlock {

	public static void main(String[] args) {

		final UserInformationUsingBlock userInformation = new UserInformationUsingBlock();

		// create anonymous class
		Thread threadOne = new Thread() {
			public void run() {
				userInformation.printInformation(4);
			}
		};

		Thread threadTwo = new Thread() {
			public void run() {
				userInformation.printInformation(3);
			}
		};

		threadOne.start();
		threadTwo.start();
	}

}

class UserInformationUsingBlock {
	public void printInformation(int n) {
		synchronized (this) {
			for (int i = 1; i < 6; i++) {
				System.out.println(Thread.currentThread().getName() + " - " + n
						* i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
