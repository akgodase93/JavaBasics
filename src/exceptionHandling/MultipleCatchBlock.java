package exceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		try
		{
			System.out.println("Division: "+100/num); //java.lang.ArithmeticException: / by zero may occur  if user enters num 0
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
