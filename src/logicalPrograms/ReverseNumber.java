package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to be reversed: ");
		int num = scanner.nextInt();

		System.out.println("OrignalNumber: " + num);
		int revNum = 0;
		// int reminder=0;
		for (int i = num; i > 0; i = i / 10) {
			int reminder = i % 10;
			// System.out.print(reminder);
			revNum = revNum * 10 + reminder;
		}
		System.out.println("Reversed Number:" + revNum);

		//Using while loop to reverse number
		num = revNum;
		revNum = 0;
		while (num > 0) {
			int reminder = num % 10;
			revNum = revNum * 10 + reminder;
			num = num / 10;

		}
		System.out.println("Revered Number to Orignal Number Post While loop: " + revNum);
		scanner.close();
	}

}
