package code.Ravi.java.mutilthreading;

/**
 * How to perform single task by multiple threads?
 * 
 * @author ravikson
 * 
 * @description If you have to perform single task by many threads, have only
 *              one run() method
 */
public class SingleTaskByMultipleThread extends Thread {

	public static void main(String[] args) {
		SingleTaskByMultipleThread thread1 = new SingleTaskByMultipleThread();
		SingleTaskByMultipleThread thread2 = new SingleTaskByMultipleThread();

		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		System.out.println("I am running");
	}

}
