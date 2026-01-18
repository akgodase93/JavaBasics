package variablesDatatypes;

public class CL3_Operators_Increment_Decrement {

	public static void main(String[] args) {
		
		int a=10;int b;
		
		//traditional way of increment
			a=a+1;
			System.out.println("Traditional way of increment: "+a);
		
		//using increment operator
		//1.Post-increment operator
			b=a++;					// it will assign value first of a to b then will increment value of a
			System.out.println("1.Using Post-increment operator: "+b);	//10
			a=10;
			
		//2.Pre-Increment operator
			b=++a;					// it will increment value first of a then it will assign value of a to b
			System.out.println("2.Pre-Increment operator:"+b);	//11
			
			a=10;
			
		//traditional way of decrement
			a=a-1;
			System.out.println("traditional way of decrement: "+a); //9
		
			a=10;
		//using Decrement operator
		//1.Post-Decrement operator
			b=a--;					// it will assign value first of a to b then will decrement value of a
			System.out.println("1.Post-Decrement operator: "+b);	//10
			a=10;
		//2.Pre-decrement operator
			b=--a;					// it will decrement value first of a then it will assign value of a to b
			System.out.println("2.Pre-Decrement operator: "+b);	//9

	}

}
