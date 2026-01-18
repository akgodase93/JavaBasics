package controlStatements;

import java.util.Scanner;

public class LargestOf2NumTerneryOperator {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1=scanner.nextInt();
		System.out.println("Enter second  number: ");
		num2=scanner.nextInt();
		
		int num3=(num1>num2)? num1:num2;
		System.out.println("Largest Number is: "+num3);
		scanner.close();

	}

}
