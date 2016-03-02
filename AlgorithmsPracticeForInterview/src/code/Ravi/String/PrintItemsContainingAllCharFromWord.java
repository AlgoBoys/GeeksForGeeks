package code.Ravi.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Print list items containing all characters of a given word
 * 
 * @author ravikson
 * 
 * @description There is a list of items. Given a specific word, e.g., “sun”,
 *              print out all the items in list which contain all the characters
 *              of “sun”.
 * 
 *              For example if the given word is “sun” and the items are
 *              “sunday”, “geeksforgeeks”, “utensils”, “”just” and “sss”, then
 *              the program should print “sunday” and “utensils”.
 */
public class PrintItemsContainingAllCharFromWord {

	public static void main(String[] args) {
		String word = "sun";

		List<String> list = new ArrayList<String>();
		list.add("sunday");
		list.add("geeksforgeeks");
		list.add("utensils");
		list.add("just");
		list.add("sss");
		list.add("sssuunn");

		printItems(list, word);
	}

	private static void printItems(List<String> list, String word) {
		for (String s : list) {
			boolean flag = false;
			for (int i = 0; i < word.length(); i++) {
				flag = false;
				for (int j = 0; j < s.length(); j++) {
					if (word.charAt(i) == s.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			if (flag) {
				System.out.println(s);
			}
		}
	}

}
