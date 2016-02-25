package code.Ravi.mutilthreading;

public class RunnableExample {

	public static void main(String[] args) {
		Count c = new Count();
		try {
			while (c.myThread.isAlive()) {
				System.out
						.println("main thread will be alive till the child thread will alive");
				Thread.sleep(100);
			}
		} catch (InterruptedException ex) {
			System.out.println("Main Thread intruppted");
		}
		System.out.println("Main Thread is over");
	}

}

class Count implements Runnable {

	Thread myThread;

	public Count() {
		myThread = new Thread(this, "My Runnable Thread");
		System.out.println("My Runnable Thread has been created: " + myThread);
		myThread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing the count  " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				System.out.println("My Runnable Thread has been Intrupted");
			}
		}
		System.out.println("My Thread run is over");
	}
}