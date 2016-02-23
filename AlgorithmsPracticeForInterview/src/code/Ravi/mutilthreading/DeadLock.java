package code.Ravi.mutilthreading;

/**
 * Deadlock in java
 * 
 * @since 23feb2016
 * @version 1.0
 * @author ravikson
 * 
 * @description Deadlock in java is a part of multithreading. Deadlock can occur
 *              in a situation when a thread is waiting for an object lock, that
 *              is acquired by another thread and second thread is waiting for
 *              an object lock that is acquired by first thread. Since, both
 *              threads are waiting for each other to release the lock, the
 *              condition is called deadlock.
 */
public class DeadLock {

	public static void main(String[] args) {

		final String str1 = "Ravi";
		final String str2 = "Soni";

		Thread threadOne = new Thread() {
			public void run() {
				synchronized (str1) {
					System.out.println("Thread 1: locked resource 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					synchronized (str2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		Thread threadTwo = new Thread() {
			public void run() {
				synchronized (str2) {
					System.out.println("Thread 2: locked resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					synchronized (str1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		threadOne.start();
		threadTwo.start();
	}
}
