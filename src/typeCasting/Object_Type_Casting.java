package typeCasting;

class Parent {
	String name = "MAX";

	void m1() {
		System.out.println("i am running m1 from parent..");

	}
}

class Child extends Parent {
	int id = 100;

	void m2() {

		System.out.println("i am running m2 from child class..");
	}
}

public class Object_Type_Casting {
	public static void main(String[] args) {

		// normal way of accessing properties by creating child class object
		Child c = new Child();
		System.out.println("Parent Name: " + c.name);
		c.m1();
		System.out.println("Child Id:" + c.id);
		c.m2();

		// Upcasting --> larger to smaller
		// Creating object of larger class and assigning with smaller class
		// Can access only parent properties which are inherited by child class
		System.out.println("Upcasting: ");
		Parent p = new Child();
		System.out.println(p.name);
		p.m1();

		System.out.println("Downcasting After Upcasting: ");
		// downcasting-->Larger to smaller
		// Creating Object of child class and initializing it with parent class
		// Fordowncasting we must need to implement upcasting
		Child c1 = (Child) p;
		System.out.println(c1.id);
		System.out.println(c1.name);
		c1.m1();
		c1.m2();

		System.out.println("Downcasting without using upcasting: ");
		//example2
		Parent p2 = new Parent();
		Child c2 = (Child) p2; //java.lang.ClassCastException
		System.out.println(c2.id);
		System.out.println(c2.name);
		c2.m1();
		c2.m2();

		//Exception in thread "main" java.lang.ClassCastException: class typeCasting.Parent 
		//cannot be cast to class typeCasting.Child (typeCasting.Parent and typeCasting.Child are in unnamed module of loader 'app')
		//at typeCasting.Object_Type_Casting.main(Object_Type_Casting.java:51)
	}

}
