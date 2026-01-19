package constructors;

public class BoxMain {

	public static void main(String[] args) {

		//Box b=new Box(); //invoke default consturctor
		Box b=new Box(10.5,10.5,10.5);
		//Box b=new Box(10.5);
		System.out.println("Volume: "+b.volume());
	}

}
