package logicalPrograms;

import java.util.Scanner;

public class OddEvenDigitCountInNum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int oddCount = 0, evenCount = 0, reminder = 0;

		for (int i = number; i > 0; i = i / 10) {
			reminder = i % 2;
			if (reminder == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Digit Count in Number: " + evenCount);
		System.out.println("Odd Digit Count in Number: " + oddCount);
		scanner.close();
	}

}
