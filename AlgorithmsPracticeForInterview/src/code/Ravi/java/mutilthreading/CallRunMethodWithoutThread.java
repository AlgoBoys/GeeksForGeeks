package code.Ravi.java.mutilthreading;

/**
 * What if we call run() method directly instead start() method?
 * 
 * @author ravikson
 * 
 * @Description Each thread starts in a separate call stack.Invoking the run()
 *              method from main thread, the run() method goes onto the current
 *              call stack rather than at the beginning of a new call stack.
 * 
 * @Note there is no context-switching because here t1 and t2 will be treated as
 *       normal object not thread object.
 */
public class CallRunMethodWithoutThread extends Thread {

	public static void main(String[] args) {
		CallRunMethodWithoutThread thread = new CallRunMethodWithoutThread();
		CallRunMethodWithoutThread thread1 = new CallRunMethodWithoutThread();
		// thread.start();
		thread.run();
		thread1.run();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
