package string;

import java.util.Arrays;

public class MutableImmutable 
{
	public static void main(String[] args) {
		
		int ar[]= {40,30,10,20};
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar); //mutable -->we can change to order
		System.out.println(Arrays.toString(ar));
		
		//immutable--> we can't not change
		String s=new String("Welcome");
		
		System.out.println("String Before concatnitation: "+s); //welcome
		
		s.concat(" to Java"); 
		System.out.println("String after concatnation: "+s); //though we have performed concatenation  value is not saved //welcome
		
		
	}
}
