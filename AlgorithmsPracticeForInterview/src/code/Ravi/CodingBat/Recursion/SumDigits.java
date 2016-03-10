package code.Ravi.CodingBat.Recursion;

/**
 * Given a non-negative int n, return the sum of its digits recursively (no
 * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 * @author ravikson
 * 
 * @output: sumDigits(126) - 9 / sumDigits(49) - 13
 * 
 */
public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(49));
	}

	public static int sumDigits(int n) {
		if (n < 10)
			return n;
		return n % 10 + sumDigits(n / 10);
	}
}
