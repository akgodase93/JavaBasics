package variablesDatatypes;

public class CL3_Operators {

	public static void main(String[] args) {
		// 1. Arithmetic Operators (+,-,*,/,%)
		int a = 20, b = 10;
		System.out.println("addition of a & b is: " + (a + b));
		System.out.println("Substraction of a & b is: " + (a - b));
		System.out.println("Multiplication of a & b is: " + (a * b));
		System.out.println("Divison of a & b is: " + (a / b));
		System.out.println("Modulo Division of a & b is: " + (a % b));
		
		System.out.println("-------------------------------------------");

		// 2. Relational/Comparison Operator: (==, >, <, !=,<=, >=)
		// Always returns boolean values(true/false)
		// Used with any kind of data types
		System.out.println("(a == b):"+(a == b)); // false
		System.out.println("(a > b):"+(a > b)); // true
		System.out.println("(a < b):"+(a < b)); // false
		System.out.println("(a != b):"+(a != b)); // true
		b = 20;
		System.out.println("(a <= b):"+(a <= b)); // true
		System.out.println("(a >= b):"+(a >= b)); // true
		System.out.println("-------------------------------------------");
		
		// 3.Logical Operators: (&&, ||, !)
		// Always returns boolean values(true/false)
		// Used with only boolean data type
		
		//		| X    |	Y	 |	X&&Y  |	X||Y  |	!X	  |	!Y		|
		//		----------------------------------------------------|
		//		| TRUE |	TRUE |	TRUE  |	TRUE  |	FALSE |	TRUE	|
		//		| TRUE |	FALSE|	FALSE |	TRUE  |	FALSE |	TRUE	|
		//		| FALSE|	TRUE |	FALSE |	TRUE  |	TRUE  |	FALSE	|
		//		| FALSE|	FALSE|	TRUE  |	FALSE |	TRUE  |	FALSE	|
		//		-----------------------------------------------------
		boolean x=true, y=false;
		
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		System.out.println("X&&Y:"+(x&&y)); //false
		System.out.println("X||Y:"+(x||y));	//true
		System.out.println("!X:"+(!x));		//false
		System.out.println("!Y:"+(!y));		//true
		
		

	}

}
