package code.Ravi.mutilthreading;

/**
 * Create thread By implementing the Runnable interface.
 * 
 * @author ravikson
 * 
 * @description If you are not extending the Thread class,your class object
 *              would not be treated as a thread object.So you need to
 *              explicitly create Thread class object.We are passing the object
 *              of your class that implements Runnable so that your class run()
 *              method may execute.
 * 
 */
public class CreateThreadUsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		CreateThreadUsingRunnableInterface runnableInterface = new CreateThreadUsingRunnableInterface();

		Thread thread = new Thread(runnableInterface);
		thread.start();
	}

}
