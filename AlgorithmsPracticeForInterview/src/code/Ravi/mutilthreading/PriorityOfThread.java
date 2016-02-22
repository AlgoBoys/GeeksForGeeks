package code.Ravi.mutilthreading;

/**
 * Priority of a Thread (Thread Priority)
 * 
 * @author ravikson
 * 
 * @description Each thread have a priority. Priorities are represented by a
 *              number between 1 and 10. In most cases, thread scheduler
 *              schedules the threads according to their priority (known as
 *              preemptive scheduling). But it is not guaranteed because it
 *              depends on JVM specification that which scheduling it chooses.
 * 
 * @constant1 public static int MIN_PRIORITY
 * @constant2 public static int NORM_PRIORITY
 * @constant3 public static int MAX_PRIORITY
 * 
 * @Note Default priority of a thread is 5 (NORM_PRIORITY). The value of
 *       MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
 */
public class PriorityOfThread extends Thread {

	public static void main(String[] args) {
		PriorityOfThread thread1 = new PriorityOfThread();
		PriorityOfThread thread2 = new PriorityOfThread();
		PriorityOfThread thread3 = new PriorityOfThread();
		thread1.start();
		thread2.setPriority(MIN_PRIORITY);
		thread2.start();
		thread3.setPriority(MAX_PRIORITY);
		thread3.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " having priority " + Thread.currentThread().getPriority());
	}

}
