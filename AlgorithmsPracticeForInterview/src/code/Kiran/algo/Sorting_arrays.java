package code.Kiran.algo;

import java.util.Arrays;
/**
 * sorting an array.
 * @author Kiran.
 * an unsorted array is to be sorted here using sort() method of Arrays class.
 */
public class Sorting_arrays 
{
	public static void main(String[] args) 
    {
		int[] array= new int[5];
		array [0]=19;
		array [1]=14;
		array [2]=30;
		array [3]=1;
		array [4]=13;
		Arrays.sort(array);
	
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
    }
}
