package code.Ravi.mutilthreading;

/**
 * perform multiple tasks by multiple threads (multitasking in multithreading)
 * by annonymous class that extends Thread class
 * 
 * @author ravikson
 * 
 */
public class MultiTaskingUsingAnonymousThreadclass {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t2.start();
	}

}
