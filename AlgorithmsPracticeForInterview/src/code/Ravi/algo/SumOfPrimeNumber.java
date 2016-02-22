package code.Ravi.algo;

/**
 * Write a program to find the sum of the first 1000 prime numbers
 * 
 * @author ravikson
 * 
 * @description Write a program to find the sum of the first 1000 prime numbers.
 *              What is a prime number? Prime Number is a number which is
 *              greater than 1 and doesn’t have divisors other than 1 and
 *              itself.
 * 
 */
public class SumOfPrimeNumber {

	public static void main(String[] args) {

		int sum = 0;
		int x = 2;

		int count = 0;
		while (count < 1000) {
			if (isPrime(x)) {
				sum += x;
				count++;
			}
			x++;
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
