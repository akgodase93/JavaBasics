package loopingControlStatments;

public class WhileLoop {

	public static void main(String[] args) 
	{
		//print 1 to 10 numbers
		int num=1;
		
		//example 1
		while(num<=10)
		{
			System.out.println(num);
			//num=num+1;
			num++;
		}
		
		System.out.println();
		num=1;
		//print "Hello" 10 times
		while(num<=10)
		{
			System.out.println("Hello");
			num++;
		}
	System.out.println();	
		
		//print even numbers from 1 to 10
		num=2;
		while(num<=10)
		{
			System.out.print(num+" ");
			num=num+2;
		}
		
		//print even numbers from 1 to 10
				num=1;
				while(num<=10)
				{
					if(num%2 ==0)
					{
						System.out.print(num+" ");
					}
					num++;
				}
				
		//print which is odd number and which even number from 1 to 10
		System.out.println();
		num=1;
		while(num<=10)
		{
			if(num%2 ==0)
			{
				System.out.println(num+" is even number");
			}
			else
			{
				System.out.println(num+" is a odd number");
			}
			num++;
		}
		System.out.println();
		
		//print 1 to 10 from reverse order
		
		num=10;
		while(num>0)
		{
			System.out.print(num+" ");
			num--;
		}
	}

}
