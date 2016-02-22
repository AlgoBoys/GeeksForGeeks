package code.Ravi.garbagecollection;

/**
 * Java Run Time Class.
 * 
 * @author ravikson
 * 
 * @Description Java Runtime class is used to interact with java runtime
 *              environment. Java Runtime class provides methods to execute a
 *              process, invoke GC, get total and free memory etc. There is only
 *              one instance of java.lang.Runtime class is available for one
 *              java application.
 * @Singleton_Instance The <b>Runtime.getRuntime()</b> method returns the
 *                     singleton instance of Runtime class.
 * 
 * @method <ol>
 *         <li><b>public static Runtime getRuntime()</b></br/>returns the
 *         instance of Runtime class.</li>
 *         <li><b>public Process exec(String command)throws
 *         IOException</b></br/>executes given command in a separate process.</li>
 *         <li><b>public long freeMemory()</b></br/>returns amount of free
 *         memory in JVM.</li>
 *         <li><b>public long totalMemory()</b></br/>returns amount of total
 *         memory in JVM.</li>
 *         </ol>
 */
public class MemoryTestUsingRuntimeClass {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		System.out.println("Total Free memory: " + r.freeMemory());
		System.out.println("Total Available memory: " + r.totalMemory());

		for (int i = 0; i < 1000000; i++) {
			new MemoryTestUsingRuntimeClass();
		}

		System.out
				.println("After creating 1000000 objects, Free memory available: "
						+ r.freeMemory());

		System.gc();

		System.out
				.println("After calling garbage collector, Free memory available: "
						+ r.freeMemory());
	}

}
