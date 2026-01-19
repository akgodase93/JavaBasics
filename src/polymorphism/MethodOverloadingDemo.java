package polymorphism;

public class MethodOverloadingDemo {
	
	int x=10, y=20;
	
	public void sum()
	{
		System.out.println("X+Y:"+(x+y));
	}
	
	public void sum(int a, int b)
	{
		System.out.println("Sum of 2 integer no's: "+(a+b));
	}
	
	public void sum(int a , double b)
	{
		System.out.println("Sum of 1 integer & 1 double no's: "+(a+b));
	}
	
	public void sum(double a, float b)
	{
		System.out.println("Sum of 1 double & 1 float no's: "+(a+b));
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo md=new MethodOverloadingDemo();
		md.sum(); //1st sum method
		md.sum(10, 20); //2nd
		md.sum(10, 2222222.34);
		md.sum(14.7, 13.3f);
	}
}
