package code.Ravi.interviewbit.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ravikson
 * 
 */
public class PrintAllDuplicates {

	public static void main(String[] args) {
		String str = "iamduplicateelementinanstring";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character s : map.keySet()) {
			if (map.get(s) > 1) {
				System.out.println(s + " - " + map.get(s));
			}
		}
	}

}
