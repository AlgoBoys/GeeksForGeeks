package code.Ravi.mutilthreading;

/**
 * performing single task by multiple threads using runnable.
 * 
 * @author ravikson
 * 
 * @Note Each thread run in a separate callstack. each thread will will have
 *       same copy of run method in their stack
 */
public class SingleTaskByMultipleThreadUsingRunnable implements Runnable {

	public static void main(String[] args) {
		SingleTaskByMultipleThreadUsingRunnable runnable = new SingleTaskByMultipleThreadUsingRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("I am runnable");
	}

}
