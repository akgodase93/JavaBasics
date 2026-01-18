package jumpingStatements;

public class ContinueStatement {
	public static void main(String[] args) {
		
		//print 1 to 10 numbers only skip number 5
		for(int i=1; i<=10;i++)
		{
			
			if(i==5)
			{	
				continue; //it will only skip once if condition is satisfied
			}
			System.out.print(i+" "); //1 2 3 4 6 7 8 9 10 
		}
	}

}
