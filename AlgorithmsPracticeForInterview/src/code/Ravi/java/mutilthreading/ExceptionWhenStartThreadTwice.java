package code.Ravi.java.mutilthreading;

/**
 * IllegalThreadStateException : Can we start a thread twice
 * 
 * @author ravikson
 * 
 * @Exception IllegalThreadStateException
 * 
 * @description No. After starting a thread, it can never be started again. If
 *              you does so, an IllegalThreadStateException is thrown. In such
 *              case, thread will run once but for second time, it will throw
 *              exception..
 * 
 * @NOTE one thread doesnot effect the execution of another thread
 * 
 */
public class ExceptionWhenStartThreadTwice extends Thread {

	public static void main(String[] args) {
		ExceptionWhenStartThreadTwice threadTwice = new ExceptionWhenStartThreadTwice();
		threadTwice.start();
		threadTwice.start();
	}

	@Override
	public void run() {
		System.out.println("code for exception is thrown");
		System.out.println("=========");
	}

}
