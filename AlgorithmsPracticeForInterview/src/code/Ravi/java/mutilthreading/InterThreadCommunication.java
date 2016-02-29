package code.Ravi.java.mutilthreading;

/**
 * Inter-thread communication in Java
 * 
 * @author ravikson
 * 
 * @description Inter-thread communication or Co-operation is all about allowing
 *              synchronized threads to communicate with each other. Cooperation
 *              (Inter-thread communication) is a mechanism in which a thread is
 *              paused running in its critical section and another thread is
 *              allowed to enter (or lock) in the same critical section to be
 *              executed.<br/>
 *              It is implemented by following methods of <b>Object class</b>:
 *              <ol>
 *              <li>wait()</li>
 *              <li>notify()</li>
 *              <li>notifyAll()</li>
 *              </ol>
 * @wait_method Causes current thread to release the lock and wait until either
 *              another thread invokes the notify() method or the notifyAll()
 *              method for this object, or a specified amount of time has
 *              elapsed. The current thread must own this object's monitor, so
 *              it must be called from the synchronized method only otherwise it
 *              will throw exception.
 * @notify_method Wakes up a single thread that is waiting on this object's
 *                monitor. If any threads are waiting on this object, one of
 *                them is chosen to be awakened. The choice is arbitrary and
 *                occurs at the discretion of the implementation.
 * 
 * @Note The point to point explanation of the above diagram is as follows:
 *       <ol>
 *       <li>Threads enter to acquire lock.</li>
 *       <li>Lock is acquired by on thread.</li>
 *       <li>Now thread goes to waiting state if you call wait() method on the
 *       object. Otherwise it releases the lock and exits.</li>
 *       <li>If you call notify() or notifyAll() method, thread moves to the
 *       notified state (runnable state).</li>
 *       <li>Now thread is available to acquire lock.</li>
 *       <li>After completion of the task, thread releases the lock and exits
 *       the monitor state of the object.</li>
 *       </ol>
 */
public class InterThreadCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposite(3000);
			}
		}.start();
	}

}

class Customer {

	int amount = 1000;

	synchronized public void withdraw(int amount) {
		if (this.amount < amount) {
			System.out
					.println("insufficient balance..... waiting for deposite");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized public void deposite(int amount) {
		System.out.println("going to deposite... " + amount);
		this.amount += amount;
		System.out.println("deposite completed");
		notify();
	}
}
