package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException //method level exception handling
, IOException
	{

		System.out.println("Program Started..");
		System.out.println("Program in Progress..");
		
		/*try //statement level exception handling
		{
		Thread.sleep(5000);
		
		}
		catch(Exception e)
		{
			
		}
		*/
		FileInputStream file=new FileInputStream("ab.txt");
		Thread.sleep(5000);
		
		file.close();
		
		System.out.println("Program executed...");
		System.out.println("Program terminated..");
	}

}
