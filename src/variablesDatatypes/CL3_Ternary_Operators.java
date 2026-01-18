package variablesDatatypes;

public class CL3_Ternary_Operators {

	public static void main(String[] args) {
		
		//Ternary operators:
		//var =exp? result1: result 2;
		
		int a=20, b=10;
		int x= (a>b)? a:b;
		System.out.println(x);//20
		
		x=0;
		x= (a<b)? a:b;
		System.out.println(x);//10
		
		x=0;
		x=(1==1)? (a+20): b;
		System.out.println(x); //40
		
		int age=30;
		System.out.println(age<40? "eligble" :"Not eligible");
		
		System.out.println();
	}

}
