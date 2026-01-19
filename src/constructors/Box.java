package constructors;

public class Box {

	double height, width,depth;
	
	Box()
	{
		height=width=depth=0;
	}
	
	Box(double a, double b, double c)
	{
		height=a;
		width=b;
		depth=c;
	}
	
	Box(double len)
	{
		height=width=depth=len;
	}
	
	double volume()
	{
		return height*width*depth;
	}
}
