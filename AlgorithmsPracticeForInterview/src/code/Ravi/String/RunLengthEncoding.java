package code.Ravi.String;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Run Length Encoding
 * 
 * @author ravikson
 * 
 * @Description Given an input string, write a function that returns the Run
 *              Length Encoded string for the input string. For example, if the
 *              input string is “wwwwaaadexxxxxx”, then the function should
 *              return w4a3d1e1x6.
 * 
 */
public class RunLengthEncoding {

	public static void main(String[] args) {
		String str = "wwwwaaadexxxxxx";
		lengthEncoding(str);

		String str1 = "wwwwaaadexxxxxxW";
		lengthEncoding(str1);
	}

	private static void lengthEncoding(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : str.toLowerCase().toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println("");
		for (char c : map.keySet()) {
			System.out.print(c + "" + map.get(c));
		}
	}

}
