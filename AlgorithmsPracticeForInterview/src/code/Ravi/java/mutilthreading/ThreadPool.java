package code.Ravi.java.mutilthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java Thread Pool
 * 
 * @author ravikson
 * 
 * @Description Java Thread pool represents a group of worker threads that are
 *              waiting for the job and reuse many times. In case of thread
 *              pool, a group of fixed size threads are created. A thread from
 *              the thread pool is pulled out and assigned a job by the service
 *              provider. After completion of the job, thread is contained in
 *              the thread pool again.
 * 
 * @Advantage Better performance It saves time because there is no need to
 *            create new thread.
 * 
 * @Real_Time_Use It is used in Servlet and JSP where container creates a thread
 *                pool to process the request.
 */
public class ThreadPool {

	public static void main(String[] args) {
		/*
		 * Creates a thread pool that reuses a fixed number of threads operating
		 * off a shared unbounded queue. At any point, at most nThreads threads
		 * will be active processing tasks. If additional tasks are submitted
		 * when all threads are active, they will wait in the queue until a
		 * thread is available. If any thread terminates due to a failure during
		 * execution prior to shutdown, a new one will take its place if needed
		 * to execute subsequent tasks. The threads in the pool will exist until
		 * it is explicitly shutdown.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new WorkerThread("" + i);
			executor.execute(runnable);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}

}

class WorkerThread implements Runnable {

	private String message;

	public WorkerThread(String s) {
		this.message = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " (Start) message = " + message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

}
