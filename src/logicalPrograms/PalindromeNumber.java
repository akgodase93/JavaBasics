package logicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number to be checked palindrome: ");
		int num=scanner.nextInt();
		
		int reminder=0,revNum=0;
		//using for loop
		for(int i=num;i>0; i=i/10)
		{
			reminder=i%10;
			revNum=revNum*10 + reminder;
			
		}
		System.out.println("Revered number: "+revNum);
		
//		num=revNum;
//		revNum=0;
//		
//		while(num>0)
//		{
//			reminder=reminder % 10;
//			revNum=revNum* 10+ reminder;
//			num=num/10;
//		}
		
		if(revNum==num)
		{
			System.out.println(num+" Number is palindrome");
		}
		else
		{
			System.out.println(num+ " Number is not palindrome");
		}
		scanner.close();	
	}

}
