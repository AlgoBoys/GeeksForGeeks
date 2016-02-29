package code.Ravi.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Return maximum occurring character in the input string
 * 
 * @author ravikson
 * 
 */
public class MaxOccuringCharacter {

	public static void main(String[] argss) {
		String args = "MyNameIsRavi";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < args.length(); i++) {
			Character ch = args.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> set = map.keySet();
		int count = 0;
		char result = '\n';

		for (Character c : set) {
			if (map.get(c) > count) {
				count = map.get(c);
				result = c;
			}
		}
		System.out.println(count + " - " + result);
	}
}
