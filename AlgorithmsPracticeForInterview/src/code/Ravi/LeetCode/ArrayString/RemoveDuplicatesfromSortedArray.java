package code.Ravi.LeetCode.ArrayString;

/**
 * Remove Duplicates from Sorted Array
 * 
 * @author ravikson
 * @since 26Feb2016
 * 
 * @description Given a sorted array, remove the duplicates in place such that
 *              each element appear only once and return the new length.Do not
 *              allocate extra space for another array, you must do this in
 *              place with constant memory.
 * 
 * @example Given input array nums = [1,1,2] Your function should return length
 *          = 2, with the first two elements of nums being 1 and 2 respectively.
 *          It doesn't matter what you leave beyond the new length.
 * 
 * @input [1,1,2]
 * @output 2, [1,2]
 */
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		System.out.println("=== " + removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] A) {
		int length = A.length;
		if (length == 0 || length == 1)
			return length;
		int i = 1;
		for (int j = 1; j < length; j++) {
			if (A[j] != A[j - 1]) {
				A[i] = A[j];
				i++;
			}
		}
		if (i < length)
			A[i] = '\0';
		return i;
	}
}
