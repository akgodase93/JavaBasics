package inheritance;

class AA //Super class
{
	int a=200;
	
	void show()
	{
		System.out.println("I am show method from Super class A");
	}
}

class BB extends AA //child BB class acquiring properties of super parent class AA using 'extend' keyword
{
	int b=300;
	
	void display()
	{
		System.out.println("I am method display() from child class B");
	}
}

class C extends BB //child CC class acquiring properties of parent class BB using 'extend' keyword
{
	int x=400;
	void print()
	{
		System.out.println("I am method print() from super child class C");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {

		C c=new C();
		
		//super parent class AA properties
		System.out.println("super parent class AA's properties");
		System.out.println("Accessing data variable 'a' of class A using object of class C"+c.a);
		c.show(); //Accessing data method 'show()' of class A using object of class B
		
		System.out.println();
		//parent class BB properties
		System.out.println("parent class BB's properties");
		System.out.println("Accessing data variable 'b' of class B using object of class C"+c.b); 
		c.display(); //Accessing data method 'display()' of class B using object of class C
		
		System.out.println();
		//own class C properties
		System.out.println("Own class C's properties");
		System.out.println("Accessing data variable 'x' of class C using object of class C"+c.x); 
		c.print(); //Accessing data method 'print()' of class C using object of class C
		
	}

}
