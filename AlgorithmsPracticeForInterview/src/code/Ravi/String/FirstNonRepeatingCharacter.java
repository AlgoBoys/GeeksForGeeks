package code.Ravi.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find its first non-repeating character
 * 
 * @author ravikson
 * 
 * @Description Given a string, find the first non-repeating character in it.
 *              For example, if the input string is “GeeksforGeeks”, then output
 *              should be ‘f’ and if input string is “GeeksQuiz”, then output
 *              should be ‘G’.
 * 
 * @Solution prepare an Map < Character, Integer> and str.toCharArray; for first
 *           time looping - put in map, for 2nd time looping - find the chanter
 *           with value 1.
 */
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "GeeksforGeeks";
		firstNonRepeating(str);

		String str2 = "GeeksQuiz";
		firstNonRepeating(str2);

		String str3 = "teeeeteeeer";
		firstNonRepeating(str3);
	}

	private static void firstNonRepeating(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();

		// first looping
		for (Character c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		// 2nd looping
		for (Character c : charArray) {
			if (map.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}

}
