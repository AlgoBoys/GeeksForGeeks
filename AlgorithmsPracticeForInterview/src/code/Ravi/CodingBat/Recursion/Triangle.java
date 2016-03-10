package code.Ravi.CodingBat.Recursion;

/**
 * We have triangle made of blocks. The topmost row has 1 block, the next row
 * down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively
 * (no loops or multiplication) the total number of blocks in such a triangle
 * with the given number of rows.
 * 
 * @author ravikson
 * 
 * @output triangle(0) - 0 ; triangle(1) - 1; triangle(2) - 3;
 */
public class Triangle {

	public static void main(String[] args) {
		System.out.println(triangle(5));
	}

	public static int triangle(int rows) {
		if (rows == 0)
			return 1;
		return rows + triangle(rows - 1);
	}

}