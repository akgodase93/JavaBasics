package arrays;

import java.util.Scanner;

public class SpecficElementCountArray {

	public static void main(String[] args) {

		int arr[]= {10,20,40,30,50,30};
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the  element for which you are looking to find count in array: ");
		int search_element=scanner.nextInt();
		int count=0; 
		boolean flag=false;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==search_element)
//			{
//				flag=true;
//				count ++;
//			}
//		}
		
		for(int value:arr)
		{
			if(value ==search_element)
				{
					flag=true;
					count ++;
				}
		}
		if(flag==true)
		{
			System.out.println("Search Element "+search_element+" found in array and count is :"+count);
		}
		else
		{
			System.out.println("Element not found in array");
		}
		scanner.close();
	}
	

}
