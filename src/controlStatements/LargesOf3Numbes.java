package controlStatements;

public class LargesOf3Numbes {

	public static void main(String[] args) {
			
		int a=10,b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is Largest number is");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
	}

}
