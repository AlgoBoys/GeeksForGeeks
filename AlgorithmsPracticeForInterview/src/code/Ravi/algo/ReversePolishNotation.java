package code.Ravi.algo;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * @example ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * @example ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * @author ravikson
 * 
 * @solution This problem can be solved by using a stack. We can loop through
 *           each element in the given array. When it is a number, push it to
 *           the stack. When it is an operator, pop two numbers from the stack,
 *           do the calculation, and push back the result.
 */
public class ReversePolishNotation {

	public static void main(String[] args) {

		String[] token = { "2", "1", "+", "3", "*" };
		// String[] token = { "4", "13", "5", "/", "+" };

		String operators = "+-/*";
		String[] temp = new String[token.length];
		int k = 0;

		for (int i = 0; i < token.length; i++) {

			String str = token[i];

			if (!operators.contains(str)) {
				temp[k++] = str;
			} else {
				if (k > 1) {
					int a = Integer.parseInt(temp[k - 2]);
					int b = Integer.parseInt(temp[k - 1]);
					int c = 0;
					switch (str) {
					case "+":
						c = a + b;
						break;
					case "-":
						c = a - b;
						break;
					case "/":
						c = a / b;
						break;
					case "*":
						c = a * b;
						break;
					default:
						break;
					}
					k--;
					k--;
					temp[k++] = String.valueOf(c);
				}
			}
		}
		System.out.println(temp[0]);
	}
}
