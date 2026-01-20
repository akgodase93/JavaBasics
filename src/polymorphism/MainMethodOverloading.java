package polymorphism;

public class MainMethodOverloading 
{
	void main()
	{
		System.out.println("Hello!");
	}
	
	void main(int a, int b)
	{
		System.out.println("SUM: "+(a+b));
		
	}
	
	void main(String name)
	{
		System.out.println("Hello!! "+name);
	}
	
	public static void main(String[] args) //This main method is static and by default called/invoked once class is executed 
	{
		MainMethodOverloading mmo=new MainMethodOverloading();
		mmo.main(); //user defined overloaded main method with no arguments
		mmo.main("Radha"); //user defined overloaded main method with String arguments
		mmo.main(12, 20); //user defined overloaded main method with 2 integer arguments
	
	}
}
