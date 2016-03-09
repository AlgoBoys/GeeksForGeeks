package code.Ravi.String;

/**
 * Reverse words in a given string
 * 
 * @author ravikson
 * 
 * @Description Example: Let the input string be “i like this program very
 *              much”. The function should change the string to “much very
 *              program this like i”
 */
public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		String str = "i like this program very much";

		String[] strArray = str.split(" ");
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = strArray.length - 1; i >= 0; i--) {
			stringBuilder.append(strArray[i]);
			stringBuilder.append(" ");
		}

		System.out.println(stringBuilder.toString());
	}

}
