package code.Ravi.CodingBat.Recursion;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. We want
 * to compute the total number of ears across all the bunnies recursively
 * (without loops or multiplication).
 * 
 * @author ravikson
 * 
 */
public class BunnyEars {

	public static void main(String[] args) {
		System.out.println(bunnyEars(5));
	}

	public static int bunnyEars(int bunnies) {

		// Base case: if bunnies==0, just return 0.
		if (bunnies == 0)
			return 0;

		// Recursive case: otherwise, make a recursive call with bunnies-1
		// (towards the base case), and fix up what it returns.
		return 2 + bunnyEars(bunnies - 1);
	}
}
