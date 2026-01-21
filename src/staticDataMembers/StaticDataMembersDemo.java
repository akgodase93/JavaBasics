package staticDataMembers;

public class StaticDataMembersDemo {

	static int a=20;
	int b=30;
	
	static void m1()  //static method
	{
		System.out.println("I am m1() static method");
	}
	
	void m() //non-static method
	{
		System.out.println("I am m() non static method");
	}
	
	void m2() //non-static method
	{	
		//3. Non-static methods can access any data members of a class directly 
		System.out.println("Accessing static data variable in non-static method: "+a);
		System.out.println("Accessing non-static data variable in non-static method:"+b);
	}
	
	
	public static void main(String[] args) {
		
		//1.static methods can access static data members directly
		System.out.println("accessing static data variable a from static method main():"+a); 
		m1(); //calling static method m1() in static method main () directly without using object of a class
		
		//2. static method can access non-static methods using object of a class
		StaticDataMembersDemo sdm=new StaticDataMembersDemo();
		System.out.println("access non-static data variable b using object of class in static method main(): "+sdm.b);
		sdm.m(); //calling non-static method m() in static method main () using object of a class

		sdm.m2(); //3. Non-static methods can access any data members of a class directly   
		
	}

}
