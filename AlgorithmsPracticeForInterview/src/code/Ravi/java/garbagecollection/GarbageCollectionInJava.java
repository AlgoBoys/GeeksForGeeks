package code.Ravi.java.garbagecollection;

/**
 * Java Garbage Collection
 * 
 * @author ravikson
 * 
 * @method <b>finalize()</b><br/>
 *         The finalize() method is invoked each time <b>before the object is
 *         garbage collected</b>. This method can be used to perform cleanup
 *         processing. </br>This method is defined in Object class as:
 *         <b>protected void finalize(){}</b>
 * 
 * @method <b>public static void gc(){}</b> <br/>
 *         The gc() method is used to invoke the garbage collector to perform
 *         cleanup processing. The gc() is found in <b>System</b> and <b>Runtime
 *         classes</b>.
 * 
 * @description In java, garbage means unreferenced objects. Garbage Collection
 *              is process of reclaiming the runtime unused memory
 *              automatically. In other words, it is a way to destroy the unused
 *              objects. To do so, we were using free() function in C language
 *              and delete() in C++. But, in java it is performed automatically.
 *              So, java provides better memory management.
 * @Advantage <ul>
 *            <li>
 *            It makes java memory efficient because garbage collector removes
 *            the unreferenced objects from heap memory.</li>
 *            <li>
 *            It is automatically done by the garbage collector(a part of JVM)
 *            so we don't need to make extra efforts.</li>
 *            </ul>
 * @question How can an object be unreferenced?
 * @Answer There are many ways:
 *         <ol>
 *         <li><b>By nulling the reference</b></br> Employee e=new
 *         Employee();</br> e=null;</li>
 *         <li><b>By assigning a reference to another</b></br/>Employee e1=new
 *         Employee(); </br>Employee e2=new Employee(); </br>e1=e2;</li>
 *         <li><b>By annonymous object etc.</b></br>new Employee();</li>
 *         </ol>
 * @note The Garbage collector of JVM collects only those objects that are
 *       created by new keyword.
 */
public class GarbageCollectionInJava {

	public static void main(String[] args) {
		GarbageCollectionInJava g1 = new GarbageCollectionInJava();
		GarbageCollectionInJava g2 = new GarbageCollectionInJava();

		g1 = null;
		g2 = null;

		System.gc();
	}

	public void finalize() {
		System.out.println("Object is garbage collected");
	}
}
