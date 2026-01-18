package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		System.out.println("Before Reversal: ");
		System.out.println(Arrays.toString(a));
		
		System.out.println("After reversal: ");
		System.out.print("[");
		for(int i=a.length-1; i>=0; i--)
		{
			if(i!=0)
				System.out.print(a[i]+", ");
			else
				System.out.print(a[i]);
		}
		System.out.println("]");
	}
}
