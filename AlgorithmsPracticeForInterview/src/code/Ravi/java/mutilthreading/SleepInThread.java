package code.Ravi.java.mutilthreading;

/**
 * Sleep method in java
 * 
 * @author ravikson
 * 
 * @description The sleep() method of Thread class is used to sleep a thread for
 *              the specified amount of time. As you know well that at a time
 *              only one thread is executed. If you sleep a thread for the
 *              specified time,the thread shedular picks up another thread and
 *              so on.
 */
public class SleepInThread extends Thread {

	public static void main(String[] args) {
		SleepInThread thread1 = new SleepInThread();
		SleepInThread thread2 = new SleepInThread();
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
