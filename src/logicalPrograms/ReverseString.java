package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String to be reversed: ");
		String s=scan.next();
		
		String rev = "";
		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+ s.charAt(i);
//		}
//		System.out.println("Reversed String: "+rev);
		
		System.out.println("By coverting to char array");
		char []ar=s.toCharArray();
		for(int i=ar.length-1; i>=0;i--)
		{
			rev=rev+ar[i];
		}
		
		System.out.println("Reversed String: "+rev);
		scan.close();
	}

}
