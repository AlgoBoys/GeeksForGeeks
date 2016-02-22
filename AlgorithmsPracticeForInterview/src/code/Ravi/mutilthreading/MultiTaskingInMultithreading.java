package code.Ravi.mutilthreading;

/**
 * How to perform multiple tasks by multiple threads (multitasking in
 * multithreading)?
 * 
 * @author ravikson
 * 
 * @Description If you have to perform multiple tasks by multiple threads,have
 *              multiple run() methods.
 * 
 */
public class MultiTaskingInMultithreading {

	public static void main(String[] args) {
		MythreadOne t1 = new MythreadOne();
		t1.start();
		MythreadOne t2 = new MythreadOne();
		t2.start();
		MythreadOne t3 = new MythreadOne();
		t3.start();
	}

}

class MythreadOne extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class MythreadTwo extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class MythreadThree extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
