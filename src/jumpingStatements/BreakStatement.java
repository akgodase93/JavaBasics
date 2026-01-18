package jumpingStatements;

/*
 
1
2
3
4
5
 
 * 
 */
public class BreakStatement {

	public static void main(String[] args) {

		//print numbers 1 to 5 between values 1 to 10 using break statement
		for(int i=1;i<=10; i++)
		{
			
			if(i ==5)
			{	
				break; //loop will break or stop executing all its iteration once if condition is satisfied 
			}
			System.out.println(i);
		}
	}

}
