package logicalPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=scanner.nextInt();
		int sum=0;
		
		for(int i=num; i>0;i=i/10)
		{
			int reminder =i%10;
			
			sum=sum+reminder;
		}
		System.out.println("Sum of digits in number "+num+" is :"+sum);
		scanner.close();
	}

}
