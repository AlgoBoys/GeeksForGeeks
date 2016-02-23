package code.Ravi.mutilthreading;

/**
 * Interrupting a Thread
 * 
 * @author ravikson
 * 
 * @description If any thread is in sleeping or waiting state (i.e. sleep() or
 *              wait() is invoked), calling the interrupt() method on the
 *              thread, breaks out the sleeping or waiting state throwing
 *              InterruptedException. If the thread is not in the sleeping or
 *              waiting state, calling the interrupt() method performs normal
 *              behavior and doesn't interrupt the thread but sets the interrupt
 *              flag to true. Let's first see the methods provided by the Thread
 *              class for thread interruption.
 */
public class InterruptingThread extends Thread {

	public static void main(String[] args) {

		InterruptingThread interruptingThread = new InterruptingThread();
		interruptingThread.start();
		try {
			interruptingThread.interrupt();
		} catch (Exception e) {
			System.out.println("Exception Handled: " + e);
		}

	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException ex) {
			System.out.println("Exception handled " + ex);
			throw new RuntimeException(
					"\n Thread interrupted... in Run Method due to interruption \n"
							+ ex);
		}
		System.out.println("thread is running...");
	}
}
