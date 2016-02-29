package code.Ravi.java.mutilthreading;

/**
 * Understanding the problem without Synchronization
 * 
 * @author ravikson
 * 
 */
public class WithoutSynchronization {

	public static void main(String[] args) {

		UserInformation userInformation = new UserInformation();
		ThreadOne t1 = new ThreadOne(userInformation);
		ThreadTwo t2 = new ThreadTwo(userInformation);

		t1.start();
		t2.start();
	}

}

class ThreadOne extends Thread {
	UserInformation userInformation;

	ThreadOne(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public void run() {
		userInformation.printInformation(5);
	}
}

class ThreadTwo extends Thread {
	UserInformation userInformation;

	ThreadTwo(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public void run() {
		userInformation.printInformation(2);
	}
}

class UserInformation {
	void printInformation(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
