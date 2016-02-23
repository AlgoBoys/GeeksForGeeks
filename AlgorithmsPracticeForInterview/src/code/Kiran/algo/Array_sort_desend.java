package code.Kiran.algo;

import java.util.*;
/**
 * 
 * @author Kiran
 *
 */
public class Array_sort_desend {
	public static void main(String[] args) {
		int []a= new int[5];
		a[0]=2;
		a[1]=5;
		a[2]=9;
		a[3]=7;
		a[4]=1;
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
