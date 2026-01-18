package constructors;

public class ConstructDemo {

	int x, y;
	
	 ConstructDemo() //default constructor
	 {
		 System.out.println("Invoking default constructor");
		 x=100;
		 y=200;
	 }
	 
	 ConstructDemo(int a,int b) //User defined parameterized constructor
	 {
		 System.out.println("Invoking parameterized constructor");
		 x=a;
		 y=b;
	 }
	 void sum()
	 {
		 System.out.println("Sum: "+(x+y));
	 }
	 
	 
}
