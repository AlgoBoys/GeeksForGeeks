package code.Kiran.algo;

import java.util.Arrays;

/**
 * sorting an array.
 * 
 * @author Kiran
 * 
 * @description an unsorted array is to be sorted here using sort() method of
 *              Arrays class.
 */
public class Sorting_arrays {
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 19;
		intArray[1] = 14;
		intArray[2] = 30;
		intArray[3] = 1;
		intArray[4] = 13;

		Arrays.sort(intArray);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
