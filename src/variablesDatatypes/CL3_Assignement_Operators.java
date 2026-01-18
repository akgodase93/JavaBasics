package variablesDatatypes;

public class CL3_Assignement_Operators {
	public static void main(String[] args) 
	{
		//Assignment Operators: (=, +=,-=, *=, /=, %=)
		
		int a=10;
		a=a+5;
		System.out.println("Tradtional way of incrementing value of a by 5(a=a+5): "+a);//15
		
		//Using shorthand operators
		//1. Increment
		a=10;
		a+=5;
		System.out.println("Incrementing value of a by 5(a+=5): "+a);//15
		
		
		//2. Decrement
		a=10;
		a-=5;
		System.out.println("Decrementing value of a by 5(a-=5): "+a);//5
		
		//3. Multiply and assign
				a=10;
				a*=5;
				System.out.println("Multiple value of a by 5(a*=5) then assign: "+a);//50
				
		//4. Divide and assign
				a=10;
				a/=5;
				System.out.println("Divide value of a by 5(a/=5) then assign: "+a);//2
				
		//4. Find reminder and  then assign
				a=10;
				a%=5;
				System.out.println("Divide value of a by 5(a%=5) then assign: "+a);//0				
		
	}

}
