package code.Ravi.interviewbit.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove characters from the first string which are present in the second
 * string
 * 
 * @author ravikson
 * 
 */
public class RemoveMatchedChacaterFromFirstString {

	public static void main1(String[] args) {

		String str1 = "RaviKantSoniisagoodboy";
		String str2 = "isittrue";

		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();

		for (int i = 0; i < str1.length(); i++) {
			list1.add(str1.charAt(i));
		}

		for (int i = 0; i < str2.length(); i++) {
			list2.add(str2.charAt(i));
		}

		list1.removeAll(list2);

		StringBuilder strbBuilder = new StringBuilder();
		for (Character c : list1) {
			strbBuilder.append(c);
		}

		System.out.println(strbBuilder.toString());
	}

	/**
	 * Another solution in java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "RaviKantSoniisagoodboy";
		String str2 = "isittrue";

		for (char c : str2.toCharArray()) {
			// String is immutable
			str1 = str1.replaceAll(String.valueOf(c), "");
		}

		System.out.println(str1);
	}

}
