package code.Ravi.java.InterviewOnJavaProgram;

/**
 * The finally block always executes when the try block exits. <br/>
 * <br/>
 * 
 * This ensures that the finally block is executed even if an unexpected
 * exception occurs. But finally is useful for more than just exception handling
 * — it allows having cleanup code accidentally bypassed by a return, continue,
 * or break.
 * 
 * 
 * @author ravikson
 * 
 * @Note Putting cleanup code in a finally block is always a good practice, even
 *       when no exceptions are anticipated.
 * 
 * @Exit If the JVM exits while the try or catch code is being executed, then
 *       the finally block may not execute. Likewise, if the thread executing
 *       the try or catch code is interrupted or killed, the finally block may
 *       not execute even though the application as a whole continues.
 */

public class FinallyInJava {

	public static void main(String[] args) {
		try {
			int i = 1 / 0;
			System.out.println(i);
		} catch (Exception ex) {
			System.out.println("Exception Occurs");
		} finally {
			System.out.println("I will always execute unless JVM exits");
		}
	}

}
