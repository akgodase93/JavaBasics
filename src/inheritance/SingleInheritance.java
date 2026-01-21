package inheritance;

class A //Super class
{
	int a=200;
	
	void show()
	{
		System.out.println("I am show method from Super class A");
	}
}

class B extends A //child class acquiring properties of A using 'extend' keyword
{
	int b=300;
	
	void display()
	{
		System.out.println("I am method display() from child class B");
	}
}

public class SingleInheritance 
{
	
	public static void main(String[] args) {
		
		B obj=new B();
		
		//parent class properties
		System.out.println("parent class properties");
		System.out.println("Accessing data variable 'a' of class A using object of class B"+obj.a);
		obj.show(); //Accessing data method 'show()' of class A using object of class B
		
		System.out.println();
		//own class properties
		System.out.println("own properties");
		System.out.println("Accessing data variable 'b' of class B using object of class B"+obj.b); 
		obj.display(); //Accessing data method 'display()' of class B using object of class B
		
	}
	
	
}
