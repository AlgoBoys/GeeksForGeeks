package code.Ravi.mutilthreading;

/**
 * perform multiple tasks by multiple threads (multitasking in multithreading)
 * by annonymous class that implements runnable interface
 * 
 * @author ravikson
 * 
 */
public class MultiTaskingUsingAnonymousRunnableClass {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
