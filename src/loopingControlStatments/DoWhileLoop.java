package loopingControlStatments;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//print 1 to 10 numbers using do while loop 
		int i=1;
		
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println();
		//print 10 to 1 numbers using do while loop
		
		i=10;
		do
		{
			System.out.print(i+" ");
			i--;
			
		}while(i>0);
		
	}

}
