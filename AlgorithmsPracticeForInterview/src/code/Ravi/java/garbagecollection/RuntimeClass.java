package code.Ravi.java.garbagecollection;

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
public class RuntimeClass {

	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("notepad");// will open a new notepad
	}

}
