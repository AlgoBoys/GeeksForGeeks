package code.Ravi.mutilthreading;

/**
 * Daemon Thread in Java
 * 
 * @author ravikson
 * 
 * @Description Daemon thread in java is a service provider thread that provides
 *              services to the user thread. Its life depend on the mercy of
 *              user threads i.e. when all the user threads dies, JVM terminates
 *              this thread automatically.
 * @Note There are many java daemon threads running automatically e.g.
 *       Garbage-Collector (gc), finalizer etc
 * 
 * @Remember It provides services to user threads for background supporting
 *           tasks. It has no role in life than to serve user threads.Its life
 *           depends on user threads.It is a low priority thread.
 * 
 * @Question Why JVM terminates the daemon thread if there is no user thread?
 * @Answer The sole purpose of the daemon thread is that it provides services to
 *         user thread for background supporting task. If there is no user
 *         thread, why should JVM keep running this thread. That is why JVM
 *         terminates the daemon thread if there is no user thread.
 * 
 * @Method1 public void setDaemon(boolean status) - is used to mark the current
 *          thread as daemon thread or user thread.
 * @Method2 public boolean isDaemon() - is used to check that current is daemon.
 */
public class DaemonThread extends Thread {
	public static void main(String[] args) {
		DaemonThread thread1 = new DaemonThread();
		DaemonThread thread2 = new DaemonThread();
		DaemonThread thread3 = new DaemonThread();

		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.start();
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()
					+ " - is a Demon Thread");
		} else {
			System.out.println(Thread.currentThread().getName()
					+ " - is NOT a Demon Thread");
		}
	}

}
