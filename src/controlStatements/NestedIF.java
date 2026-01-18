package controlStatements;

public class NestedIF {

	public static void main(String[] args) {
		
		if(true)// this will print XYZ
		//if(false) //this is print 123
		{
			if(true)
			{
				System.out.println("XYZ");
			}
			else
			{
				System.out.println("xyz");
			}
		}
		
		else
		{
			System.out.println("123");
		}
	}

}
