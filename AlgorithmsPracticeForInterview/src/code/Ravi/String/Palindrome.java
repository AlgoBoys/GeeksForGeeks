package code.Ravi.String;

/**
 * 
 * @author ravik_000
 * 
 */
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("1a2"));
	}

	public static int isPalindrome(String a) {

		StringBuilder original = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLetter(a.charAt(i))
					|| Character.isDigit(a.charAt(i)))
				original.append(a.charAt(i));
		}

		String org = new String(original);

		int x = 0;
		StringBuilder str = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			if (Character.isLetter(a.charAt(i))
					|| Character.isDigit(a.charAt(i)))
				str.append(a.charAt(i));
		}

		if (org.equalsIgnoreCase(new String(str))) {
			x = 1;
		}
		return x;
	}

}
