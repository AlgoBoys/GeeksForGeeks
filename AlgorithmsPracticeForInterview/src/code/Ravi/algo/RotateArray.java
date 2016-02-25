package code.Ravi.algo;

import java.util.Arrays;

/**
 * Rotate Array in Java
 * 
 * @author ravikson
 * 
 * @problem Rotate an array of n elements to the right by k steps. For example,
 *          with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 *          [5,6,7,1,2,3,4]. How many different ways do you know to solve this
 *          problem?
 * 
 * @URL <i>http://www.programcreek.com/2015/03/rotate-array-in-java/</i>
 */
public class RotateArray {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5 };
		int k = 3;

		// int[] newN = solution1_TempArray(n, k);

		// int[] newN = solution2_BubbleRotate(n, k);

		int[] newN = solution3_Reversal(n, k);
		for (int x : newN) {
			System.out.print(x);
		}
	}

	public static int[] solution1_TempArray(int[] n, int k) {
		if (n == null || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}

		int[] temp = new int[n.length];
		int p = 0;

		if (k < n.length) {
			for (int j = k; j < n.length; j++) {
				temp[p++] = n[j];
			}
		}
		for (int i = k - 1; i >= 0; i--) {
			temp[p++] = n[i];
		}
		return temp;
	}

	/**
	 * Last element will be Bubbled at top, and then 2nd last element will be
	 * bubbled at 2nd position, and so on
	 * 
	 * i = 0 => [0 1 2 3 4 5 6 ] -> [0 1 2 3 4 6 5] -> [0 1 2 3 6 4 5] ->..->[6
	 * 0 1 2 3 4 5]
	 * 
	 * final: [4 5 6 0 1 2 3 ]
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public static int[] solution2_BubbleRotate(int[] n, int k) {
		if (n == null || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}

		int[] temp = n;

		for (int j = 0; j < k - 1; j++) {
			for (int i = temp.length - 1; i > 0; i--) {
				int t = temp[i];
				temp[i] = temp[i - 1];
				temp[i - 1] = t;
			}
		}
		return temp;
	}

	/**
	 * <ol>
	 * <li>Divide the array two parts: 1,2,3,4 and 5, 6</li>
	 * <li>Rotate first part: 4,3,2,1,5,6</li>
	 * <li>Rotate second part: 4,3,2,1,6,5</li>
	 * <li>Rotate the whole array: 5,6,1,2,3,4</li>
	 * </ol>
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public static int[] solution3_Reversal(int[] n, int k) {
		int[] left = Arrays.copyOfRange(n, 0, k);
		int[] right = Arrays.copyOfRange(n, k, n.length);

		Arrays.sort(left);
		int k1 = 0;
		int[] temp = new int[n.length];
		for (int i = left.length - 1; i >= 0; i--) {
			temp[k1++] = left[i];
		}
		Arrays.sort(right);
		for (int i = right.length - 1; i >= 0; i--) {
			temp[k1++] = right[i];
		}

		int[] finalArray = new int[temp.length];
		k1 = 0;
		for (int z = temp.length - 1; z >= 0; z--) {
			finalArray[k1++] = temp[z];
		}

		return finalArray;
	}
}
