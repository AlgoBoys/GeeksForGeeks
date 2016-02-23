package code.Kiran.algo;

import java.util.*;

/**
 * 
 * @author Kiran
 * 
 * @updated <b>ravikson {23 feb 2016}</b> Collection will work on Object and not
 *          on primitive data types. Integer is a Wrapper class, so when we
 *          declare new Integer, we will get Integer Object.
 * 
 * @Note make a proper note on variable name declaration, not like a or x etc
 * 
 */
public class Array_sort_desend {
	public static void main(String[] args) {
		// Integer[] a = new Integer[5];
		Integer[] intArray = new Integer[5];
		intArray[0] = 2;
		intArray[1] = 5;
		intArray[2] = 9;
		intArray[3] = 7;
		intArray[4] = 1;

		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		Arrays.sort(intArray, Collections.reverseOrder());
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
