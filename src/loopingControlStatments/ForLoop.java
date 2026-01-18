package loopingControlStatments;

public class ForLoop {

	public static void main(String[] args) {
		
		//print 1 to 10 numbers using for loop
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//print 10 to 1 using for loop
		for(int i=10;i>0;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//print odd even numbers using for loop
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				System.out.println(i+" is even number");
			else
				System.out.println(i+" is odd number");
		}
		
		
	}

}
