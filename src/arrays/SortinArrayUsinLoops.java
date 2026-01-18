package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortinArrayUsinLoops {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int length = scanner.nextInt();
		System.out.println();

		int ar[] = new int[length];

		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print("Enter element value for the postion ar[" + i + "]:");
			ar[i] = scanner.nextInt();
		}
		System.out.println();

		System.out.println("Below is the array with values before sort: ");
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i<ar.length ; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("After SORT");
		System.out.println(Arrays.toString(ar));
		scanner.close();
	}
}
