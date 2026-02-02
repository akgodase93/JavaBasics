package exceptionHandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		try //I will look for exceptions if any and if found then send to catch block to handle
		{
			System.out.println("Division: "+100/num); //java.lang.ArithmeticException: / by zero may occur  if user enters num 0
		}
		catch(Exception e)  //I  will be used to handle exceptions thrown by try block
		{
			System.out.println(e);
		}
		
		finally //mainly used for clean up operations //resources closure like db drivers, opened file closure etc.
		{
			System.out.println("I am finally block and  will be executed always...");
			
		}
		scan.close();
	}
}
