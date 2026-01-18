package string;

public class ReverseStringStrBuffStrBuilder {

	public static void main(String[] args) 
	{
		
		StringBuffer sb=new StringBuffer("Akshay");
		System.out.println("Orignal Sting: "+sb);
		System.out.println("Using String Buffer: "+sb.reverse());
		
		StringBuilder sb1=new StringBuilder("Akshay");
		System.out.println("Using String Builder: "+sb1.reverse());
		
		
	}

}
