package logicalPrograms;

public class NumSwap {

	public static void main(String[] args) {

		//Number swap using third variable
		int a=30,b=20;
		int c;
		
		System.out.println("Before swap:");
		System.out.println("a="+a); //30
		System.out.println("b="+b);//20
		
		c=30;
		a=b; //a=20 
		b=c; //b=30
		System.out.println("After swap:");
		System.out.println("a="+a); //20
		System.out.println("b="+b);//30
		
		System.out.println("Without Using 3rd variable");
		System.out.println("Before swap:");
		System.out.println("a="+a); //30
		System.out.println("b="+b);//20
		
	
		a=a+b; //a=30+20=50
		b=a-b; //b=50-30=20
		a=a-b; //a=50-20=30
		
		
		System.out.println("After swap:");
		System.out.println("a="+a); //20
		System.out.println("b="+b);//30
		
		
		
		
	}

}
