package code.Ravi.String;

/**
 * @Source: CrackCode Book
 * 
 * @author ravikSon
 * 
 * @Description: Implement an algorithm to determine if a string has all unique
 *               characters. What if you can not use additional data structures?
 * 
 */
public class DuplicateCharsInStringWithoutDS {

	public static void main(String[] args) {

		String str = "Zumbaru";
		boolean[] booleanArray = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if (booleanArray[index]) {
				System.out.println("contains duplicate");
				return;
			} else {
				booleanArray[index] = true;
			}
		}
		System.out.println("No Duplicate presents");
	}
}
