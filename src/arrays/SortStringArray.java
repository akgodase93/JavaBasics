package arrays;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		
		String[] str= {"Akshay","GOdase","PUNE" ,"IT"};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(str));
	}
}
