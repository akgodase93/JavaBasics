package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArrayElementFrmUser {

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

		System.out.println("Below is the array with values: ");
		System.out.println(Arrays.toString(ar));

		scanner.close();
	}
}
