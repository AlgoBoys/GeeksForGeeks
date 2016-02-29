package code.Ravi.java.mutilthreading;

/**
 * Thread class provide constructors and methods to create and perform
 * operations on a thread.Thread class extends Object class and implements
 * Runnable interface.
 * 
 * @author ravikson
 * 
 * @NOTE First super constructor will be invoked that is the constructor of
 *       Thread class and then constructor of CreateThreadUsingThreadClass.
 * 
 * @description Thread class constructor allocates a new thread object.When you
 *              create object of Multi class,your class constructor is
 *              invoked(provided by Compiler) fromwhere Thread class constructor
 *              is invoked(by super() as first statement).So your Multi class
 *              object is thread object now.
 * 
 */
public class CreateThreadUsingThreadClass extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		// Thread class constructor allocates a new thread object.When you
		// create object of CreateThreadUsingThreadClass class,your class
		// constructor is
		// invoked(provided by Compiler) from where Thread class constructor is
		// invoked(by super() as first statement).So your
		// CreateThreadUsingThreadClass class object is
		// thread object now.
		CreateThreadUsingThreadClass thread = new CreateThreadUsingThreadClass();

		// start() method of Thread class is used to start a newly created
		// thread
		thread.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
