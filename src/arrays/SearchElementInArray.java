package arrays;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,40,30,50,25};
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the search element you are looking in array: ");
		int search_element=scanner.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_element)
			{
				System.out.println("Search Element "+search_element+" found in array");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Search Element "+search_element+" not found in array");
		}
		scanner.close();
	}

}
