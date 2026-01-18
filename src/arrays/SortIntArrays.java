package arrays;

import java.util.Arrays;

public class SortIntArrays {
	public static void main(String[] args) {
		
		int ar[]= {10,30,20,15,12};
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println("After sorting array: ");
		System.out.println(Arrays.toString(ar));
		
		
	}

}
