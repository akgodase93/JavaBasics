package variablesDatatypes;

//int y; //Global variable not allowed in java

public class TypesOfVariables {

	static int b=20; //static/class variable
	String d="Akshay"; //Instance Variable
	
	void show()
	{
		int c=40;
		System.out.println("Local Variable from show() method: "+c); //Local variable
	}
	
	void show1(String d) //Local Variable
	{
		this.d=d; //this keyword is used to point the variable is from current class
		System.out.println("Hello! "+d+" This variable is from show1() method as arguments") ;
	}
	
	public static void main(String[] args) {
		
		TypesOfVariables tv= new TypesOfVariables();
		
		int a=10; //Instance Variable
		System.out.println("Instance variable from main method:"+a);
		tv.show(); //Local variable from show method
		tv.show1("Arjun"); //Local method as a parameter
		System.out.println("Static Variable: "+TypesOfVariables.b);
		
		
		
	}

}
