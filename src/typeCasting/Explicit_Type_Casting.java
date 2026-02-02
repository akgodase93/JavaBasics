package typeCasting;

public class Explicit_Type_Casting {

	public static void main(String[] args) {
		
		//larger to smaller data type conversion
		//Data loss  takes place
		//called as Narrowing Casting
		//Conversion is done manually by programmer
		
		double doubleValue=10999.5343666666666666; 
		float floatValue=(float)doubleValue;  //convert till 8 decimal points
		System.out.println("Double to FLoat Casting: "+floatValue); //10999.534
		
		int intgerValue=(int)doubleValue;
		System.out.println("Double to Intger Casting: "+intgerValue); //10999
		
		long longValue=(long)doubleValue;
		System.out.println("Double to Long Casting: "+longValue); //10999
		
		char charValue=(char)doubleValue;
		System.out.println("Double to Char Value: "+charValue); //⫷
		
//		String s="Welcome";
//		charValue=(char)s; //Not valid error
//		System.out.println("String to Char Value: "+charValue); //
		
		floatValue=(float)intgerValue;
		System.out.println("Intger to Float: "+floatValue);
		

		
	}

}
