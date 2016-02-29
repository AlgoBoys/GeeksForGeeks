package code.Ravi.java.mutilthreading;

/**
 * The join() method
 * 
 * @author ravikson
 * 
 * @exception InterruptedException
 * 
 * @description The join() method waits for a thread to die. In other words, it
 *              causes the currently running threads to stop executing until the
 *              thread it joins with completes its task.
 * 
 */
public class JoinInThreads extends Thread {

	public static void main(String[] args) {

		JoinInThreads thread1 = new JoinInThreads();
		JoinInThreads thread2 = new JoinInThreads();
		JoinInThreads thread3 = new JoinInThreads();

		System.out.println("1st time: " + Thread.currentThread().getName());
		thread1.start();
		try {
			thread1.join();
			// thread1.join(10); //long milliseconds
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		thread2.start();
		thread3.start();
		System.out.println("2nd time: " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}

}
