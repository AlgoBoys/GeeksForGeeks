package code.Kiran.algo;

/**
 * 
 * @author Kiran.
 * sorting a given array by using selection sort technique.
 */
public class Selection_sort {
	public static void main(String[] args) {
		int[] Array1 = { 3, 6, 0, 8, 4, 3, 7, 12, 34, 56, 78, 34, 21 };
		selectsort(Array1);
		for (int i : Array1) {
			System.out.println(i);
		}
	}

	public static int[] selectsort(int[] Array) {
		for (int i = 0; i < Array.length - 1; i++) {
			int least = i;
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[j] < Array[least]) {
					least = j;
				}
				int temp;
				temp = Array[least];
				Array[least] = Array[i];
				Array[i] = temp;
			}
		}
		return Array;
	}
}
