package controlStatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week day name: ");
		String weekname = sc.next();

		switch (weekname.toUpperCase()) {
		case "SUNDAY":
			System.out.println(1);
			break;

		case "MONDAY":
			System.out.println(2);
			break;

		case "TUESDAY":
			System.out.println(3);
			break;

		case "WEDNESDAY":
			System.out.println(4);
			break;

		case "THURSDAY":
			System.out.println(5);
			break;

		case "FRIDAY":
			System.out.println(6);
			break;

		case "SATURDAY":
			System.out.println(7);
			break;

		default:
			System.err.println("Invalid week name!!");
		}
		sc.close();
	}

}
