package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Started....");
		
		//Ex1
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		System.out.println("Division: "+100/num); //java.lang.ArithmeticException: / by zero may occur  if user enters num 0
		
		//Ex2
		int ar[]=new int[5];
		System.out.println("Enter the postion(0-4): ");
		int pos=scan.nextInt();
		System.out.println("Enter the Value: ");
		int value=scan.nextInt();
		ar[pos]=value; //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length if user enters value at 5th position 
		System.out.println(ar[pos]);
		
		
		//ex3
		String s1="Welcome";
		System.out.println(Integer.parseInt(s1)); //java.lang.NumberFormatException cannot parse sting to int
		
		
		//ex4
		String s=null;
		System.out.println(s.length()); //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		
		System.out.println("Program Ended");
		scan.close();
	}

}
