package loopingControlStatments;

public class WhileVsDoWhile {

	public static void main(String[] args)
	{
		int i=10;
		
		while(i<=5)	//this will not print anything as condition is not satisfied
		{
			System.out.println(i);
			i++;
		}
		
		do// this will print 10 the first block of code then check for condition
		{
			System.out.println(i);
			i++;
		}while(i<=5);
		
		
	}

}
