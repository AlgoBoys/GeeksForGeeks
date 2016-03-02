package code.Ravi.String;

/**
 * Divide a string in N equal parts
 * 
 * @author ravikson
 * 
 * @Description Split string to equal length substrings in Java.
 * 
 */
public class DivideStringInNEqualParts {

	public static void main(String[] args) {
		String str = "a_simple_divide_string_queste";
		divideString(str);
	}

	/**
	 * 
	 * @param str
	 */
	private static void divideString(String str) {
		if (str.length() <= 4) {
			System.out.println(str);
		} else {
			for (int i = 0; i < str.length();) {
				int j = (str.length() - i) <= 4 ? str.length() : i + 4;
				System.out.println(str.substring(i, j));
				i = i + 4;
			}
		}

	}
}
