package constructors;

public class ConstructDemoMain 
{
	public static void main(String[] args) {
		
		ConstructDemo cd=new ConstructDemo();//Invoking default constructor
		cd.sum();
		
		ConstructDemo cd1=new ConstructDemo(10,20);//Invoking parameterized constructor
		cd1.sum();	
	}
}
