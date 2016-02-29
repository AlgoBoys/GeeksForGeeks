package code.Ravi.java.mutilthreading;

/**
 * Java synchronized method
 * 
 * @author ravikson
 * 
 */
public class SynchronizedMethod {

	public static void main(String[] args) {
		UserInformationSynchronized userInformation1 = new UserInformationSynchronized();
		ThreadOne1 threadOne1 = new ThreadOne1(userInformation1);
		ThreadTwo1 threadTwo1 = new ThreadTwo1(userInformation1);

		threadOne1.start();
		threadTwo1.start();
	}

}

class ThreadOne1 extends Thread {

	UserInformationSynchronized userInformation;

	ThreadOne1(UserInformationSynchronized userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public void run() {
		this.userInformation.printInformation(5);
	}

}

class ThreadTwo1 extends Thread {
	UserInformationSynchronized userInformation;

	ThreadTwo1(UserInformationSynchronized userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public void run() {
		this.userInformation.printInformation(2);
	}
}

class UserInformationSynchronized {
	synchronized public void printInformation(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out
					.println(Thread.currentThread().getName() + " - " + n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}