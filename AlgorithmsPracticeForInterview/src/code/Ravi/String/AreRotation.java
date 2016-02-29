package code.Ravi.String;

/**
 * A Program to check if strings are rotations of each other or not
 * 
 * @author ravikson
 * 
 *         Given a string s1 and a string s2, write a snippet to say whether s2
 *         is a rotation of s1 using only one call to strstr routine?
 * 
 * @example given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2
 *          = ACBD , return false
 * 
 */
public class AreRotation {

	public static void main(String[] args) {

		String str1 = "ApapeeeA";
		String str2 = "peeeAApa";

		if (str1.length() == str2.length()) {

			// rotate 2nd String
			char c1 = str1.charAt(0);

			int index = 0;
			boolean flag = false;

			while (index < str2.length()) {
				StringBuilder str = new StringBuilder();
				index = str2.indexOf(c1, index);
				for (int i = index; i < str2.length(); i++) {
					str.append(str2.charAt(i));
				}
				if (index > 0) {
					for (int j = 0; j < index; j++) {
						str.append(str2.charAt(j));
					}
				}
				if (str1.equals(str.toString())) {
					flag = true;
					break;
				} else {
					index++;
				}
			}
			System.out.println(flag);
		} else {
			System.out.println("False");
		}
	}

}
