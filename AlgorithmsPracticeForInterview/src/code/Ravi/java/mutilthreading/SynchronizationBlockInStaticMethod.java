package code.Ravi.java.mutilthreading;

/**
 * Synchronized block on a class lock
 * 
 * @author ravikson
 * 
 * @description The block synchronizes on the lock of the object denoted by the
 *              reference .class name .class.
 * 
 */
public class SynchronizationBlockInStaticMethod {
	public static void main(String[] args) {

		Thread threadOne = new Thread() {
			@Override
			public void run() {
				userInformationUsingStaticBlock.printInformation(2);
			}
		};

		Thread threadTwo = new Thread() {
			@Override
			public void run() {
				userInformationUsingStaticBlock.printInformation(3);
			}
		};

		threadOne.start();
		threadTwo.start();
	}
}

class userInformationUsingStaticBlock {
	static void printInformation(int n) {
		synchronized (userInformationUsingStaticBlock.class) {
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
