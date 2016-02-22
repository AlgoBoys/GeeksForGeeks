package code.Ravi.mutilthreading;

/**
 * ThreadGroup in Java
 * 
 * @author ravikson
 * 
 * @description Java provides a convenient way to group multiple threads in a
 *              single object. In such way, we can suspend, resume or interrupt
 *              group of threads by a single method call.
 * @class Java thread group is implemented by java.lang.ThreadGroup class.
 * 
 * @constructor <u><li>ThreadGroup(String name)</li><li>ThreadGroup(ThreadGroup
 *              parent, String name)</li></u>
 * @method <u><li><b>int activeCount()</b> {returns no. of threads running in
 *         current group}</li><li><b> int activeGroupCount()</b> {returns a no.
 *         of active group in this thread group}</li><li><b>void destroy()</b> {
 *         destroys this thread group and all its sub groups.}</li><li><b>String
 *         getName()</b> { returns the name of this group.}</li><li>
 *         <b>ThreadGroup getParent()</b> { returns the parent of this group.}</li>
 *         <li><b>void interrupt()</b>{ interrupts all threads of this group.}</li>
 *         <li><b>void list()</b>{ prints information of this group to standard
 *         console.}</li></u>
 */
public class ThreadGroupInJava implements Runnable {

	public static void main(String[] args) {
		ThreadGroup thGroup = new ThreadGroup("My Thread Group");
		ThreadGroupInJava myrunnable = new ThreadGroupInJava();

		Thread t1 = new Thread(thGroup, myrunnable, "One");
		t1.start();

		Thread t2 = new Thread(thGroup, myrunnable, "Two");
		t2.start();

		Thread t3 = new Thread(thGroup, myrunnable, "Three");
		t3.start();

		System.out.println(thGroup.getName());

		thGroup.list();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
