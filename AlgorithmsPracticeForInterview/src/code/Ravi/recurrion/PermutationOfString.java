package code.Ravi.recurrion;

/**
 * 
 * @resource 
 *           http://javarevisited.blogspot.in/2015/08/how-to-find-all-permutations
 *           -of-string-java-example.html
 * 
 * @question Java program to find all permutations of a given String using
 *           recursion.
 * 
 * @author ravikson
 * 
 * @description A permutation, also called an “arrangement number” or “order,”
 *              is a rearrangement of the elements of an ordered list S into a
 *              one-to-one correspondence with S itself. A string of length n
 *              has n! permutation.
 * 
 * @example Below are the permutations of string ABC.
 */
public class PermutationOfString {
	public static void main(String[] args) {
		permutation("123");
	}

	static int count = 0;

	/**
	 * A method exposed to client to calculate permutation of String in Java.
	 */
	private static void permutation(String input) {
		permutation("", input);
	}

	/**
	 * Recursive method which actually prints all permutations * of given
	 * String, but since we are passing an empty String * as current permutation
	 * to start with, * I have made this method private and didn't exposed it to
	 * client.
	 */
	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(
						perm + word.charAt(i),
						word.substring(0, i)
								+ word.substring(i + 1, word.length()));
			}
		}

	}
}
