package code.Ravi.interviewbit.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ravikson
 * 
 * @Example: geeksforgeeks => efgkos
 * 
 */
public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String arg = "vvvvRaviKantSonirrrrr";
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < arg.length(); i++) {
			set.add(arg.charAt(i));
		}
		System.out.println(set);

		// another solution
		/**
		 * Sort array and remove duplicate elements
		 */
		char[] charArray = arg.toCharArray();
		Arrays.sort(charArray);

		StringBuilder st = new StringBuilder();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] != charArray[i + 1]) {
				st.append(charArray[i]);
			} else {
				continue;
			}
		}
		st.append(charArray[charArray.length - 1]);
		System.out.println(st.toString());
	}

}
