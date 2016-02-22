package code.Ravi.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * DuplicateCharsInString: Write a program to find out duplicate characters in a string.
 * 
 * @author ravikson
 * 
 * @description Write a program to find out duplicate or repeated characters in
 *              a string, and calculate the count of repetition
 * 
 */
public class DuplicateCharsInString {

	public static void main(String[] args) {
		duplicateCharacter("RaviKantSoniiii");
	}

	private static void duplicateCharacter(String str) {

		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			Character ch = charArray[i];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character s : map.keySet()) {
			if (map.get(s) > 1) {
				System.out.println(s + " ------- " + map.get(s));
			}
		}
	}

}
