package string;

public class StringVsStringBufferVsStringBuilder
{
	public static void main(String[] args) {
		
		//Immutable-cant change
		String str=new String("Welcome");
		str.concat(" to Java");
		System.out.println("Using String: "+str); //no change
		
		//mutable
		//StringBuilder
		StringBuilder sb=new StringBuilder("Welcome");
		sb.append(" to Java");  //mutable -->we can change
		System.out.println("Using StringBuilder: "+sb);// Welcome to Java
		
		//mutable
		//StringBuffer 
		StringBuffer sb1= new StringBuffer("Welcome");
		sb1.append(" to Java");
		System.out.println("Using StringBuffer: "+sb1);
		
	}
}
