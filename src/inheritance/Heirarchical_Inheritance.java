package inheritance;

class Father
{
	double money=500000.56;
	String home="4 BHK Row House";
	
	void runninCar()
	{
		System.out.println("runningCar () method from father class");
	}
	
}

class Son extends Father
{
	String mobile="879999999";
	void runningBike()
	{
		System.out.println("I am son I like riding bike");
	}
}

class Daughter extends Father
{
	String degree="Engg.";
	
	void playingTT()
	{
		System.out.println("I am daughter and I like playing TT");
	}
}

public class Heirarchical_Inheritance {

	public static void main(String[] args) {
		
		Son s=new Son();
		System.out.println("I am son I can use my fathers "+s.home);
		System.out.println("I am son I can use my fathers money of worth: "+s.money);
		System.out.println("I am son and I have my own mobile number: "+s.mobile);
		
		s.runninCar();//calling fathers method using son object
		s.runningBike(); //calling own method using son object
		System.out.println();
		
		
		Daughter d=new Daughter();
		System.out.println("I am daughter I can use my fathers "+d.home);
		System.out.println("I am daughter I can use my fathers money of worth: "+d.money);
		System.out.println("I am daughter and I have my own mobile number: "+d.degree);		
		
		d.runninCar();//calling father method using daughter object
		d.playingTT();//calling own method using daughter object
		System.out.println();
		
	}

}
