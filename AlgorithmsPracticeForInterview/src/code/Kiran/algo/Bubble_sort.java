
/**
 * @kiran
 * program to sort an array usinng bubble sort technique.
 */

package code.Kiran.algo;

public class Bubble_sort {
	public static void main(String[] args) {
		int[] intArray = { 1, 5, 7, 3, 9, 4 };
		bubblesort(intArray);
		print(intArray);
	}

	public static void bubblesort(int[] intArray) {
		for (int j = intArray.length; j >= 0; j--) {
			for (int i = 0; i < intArray.length - 1; i++) {
				int k = i + 1;
				if (intArray[i] > intArray[k]) {
					swap(i, k, intArray);
				}
			}
		}
	}

	public static void swap(int i, int k, int[] intArray) {
		int temp;
		temp = intArray[i];
		intArray[i] = intArray[k];
		intArray[k] = temp;
	}

	private static void print(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		System.out.println("\n");
	}

}
