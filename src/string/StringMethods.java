package string;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
	
		String s="Akshay";
		//Methods of String 
		//1. Length(): Returns the length of this string. Return Type: int
			System.out.println("Lenght of String S is: "+s.length());//6
		
		//2.toUpperCase(): Converts all of the characters in this String to upper case using the rules of the default locale.
		//Return Type: String
			System.out.println("Converting String S to uppercase: "+s.toUpperCase()); //AKSHAY
		
		//3.toLowerCase(): Converts all of the characters in this String to lower case using the rules of the default locale.
		//Return Type: String
			System.out.println("Converting String S to uppercase: "+s.toLowerCase()); //akshay
		
		//4. equals(): Compares this string to the specified object. The result is true if and only if the argument is not null
		//   Case sensitive
		//Return Type: Boolean
			System.out.println("equals: "+s.equals("Akshay")); //true
			
		//5. equalsIgnoreCase(); Compares this String to another String, ignoring case considerations.
		// 	 The result is true if and only if the argument is not null. Case insensitive
		//Return Type: Boolean
			System.out.println("equals ignore case: "+s.equalsIgnoreCase("akshay")); //true
			
		//6. contains(): Returns true if and only if this string contains the specified sequence of char value
		//Return Type: Boolean		
			System.out.println("contains : "+s.contains("a"));
			System.out.println("contains : "+s.contains("sh"));
			System.out.println("contains : "+s.contains("Aksa"));
			
		//7. isEmpty(); true if length() is 0, otherwise false
		//Return Type: Boolean		
			System.out.println("isEmpty: "+s.isEmpty()); //false
		
		//8. charAt(): Returns the char value at the specified index. An index ranges from 0 to length() - 1
		//Return Type: char
			System.out.println("charAt: "+s.charAt(2));  //s
			
		//9. endsWith(): Tests if this string ends with the specified suffix.
		//Return Type: Boolean
			System.out.println("endsWith: "+ s.endsWith("ay"));  //true
			System.out.println("endsWith: "+ s.endsWith("py"));  //false
			
		//10. startsWith(): Tests if this string starts with the specified prefix
		//Return Type: Boolean
				System.out.println("startsWith: "+ s.startsWith("Ak"));  //true
				System.out.println("startsWith: "+ s.startsWith("ak"));  //false		
			
		//11. substring(): Returns a string that is a substring of this string. 
		//The substring begins with the character at the specified index and extends to the end of this string.
		//Return Type:String
				System.out.println("Substring: "+s.substring(2)); //shay
				System.out.println("Substring: "+s.substring(2,4)); //sh
		
		//12. concat(): Concatenates the specified string to the end of this string.
		//Return Type: String: If the length of the argument string is 0, 
		//then this String object is returned. Otherwise, a String object is returned that represents a character sequence that is the concatenation of the character sequence represented by this String object and the character sequence represented by the argument string.
				System.out.println("Concated String: "+s.concat(" Godase"));
				System.out.println("Concated String: "+s.concat(" Godase").concat(" Java"));
				
		//13. indexOf(): Returns the index within this string of the first occurrence of the specified substring.
		//return type: int
				System.out.println("Index of: "+s.indexOf("y")); //5
				
		//14. lastIndexOf():Returns the index within this string of the last occurrence of the specified substring.
		//return type: int		
				System.out.println("Index of: "+s.concat("a").indexOf("a")); //4
				System.out.println("Last Index of: "+s.concat("a").lastIndexOf("a")); //6
		
		//15. replace(): Replaces each substring of this string that matches the literal 
		//				 target sequence with the specified literal replacement sequence
		//return type: String
				System.out.println("Replace: "+s.replace("k", "x"));  //Axshay
				
		//16. split(): Splits this string around matches of the given regular expression.
		//Return Type: String[] (array of strings)
				String ar[]=s.split("s");
				System.out.println("String split: ");
				System.out.println(Arrays.toString(ar)); //[Ak, hay]
				
		//17.trim(): Returns a string whose value is this string, with all leading and trailing space removed,
		//Return Type: String
				String s2=" akshay is good at java  ";
				System.out.println("length of string before trim: "+s2.length());
				s2=s2.trim();
				System.out.println("length of string after trim: "+s2.length());
	}

}
