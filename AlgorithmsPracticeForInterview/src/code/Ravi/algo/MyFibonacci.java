package code.Ravi.algo;

/**
 * MyFibonacci : Write a program to print fibonacci series.
 * 
 * @author ravikson
 * 
 * @description n mathematics, the Fibonacci numbers or Fibonacci series or
 *              Fibonacci sequence are the numbers in the following integer
 *              sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... By
 *              definition, the first two num.
 */
public class MyFibonacci {

	public static void main(String[] args) {

		int fibCount = 15;
		int[] fib = new int[fibCount];

		for (int i = 0; i < fibCount; i++) {
			if (i == 0) {
				fib[0] = 0;
			}
			if (i == 1) {
				fib[1] = 1;
			}
			if (i > 1) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}
		for (int i = 0; i < fibCount; i++) {
			System.out.print(fib[i] + " ");
		}
	}

}
