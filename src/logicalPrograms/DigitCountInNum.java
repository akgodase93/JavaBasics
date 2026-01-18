package logicalPrograms;

import java.util.Scanner;

public class DigitCountInNum {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=scanner.nextInt();
		int count=0;
		
		for(int i=number;i>0;i=i/10)
		{
			count ++;
		}
		System.out.println(count);
		scanner.close();
	}

}
