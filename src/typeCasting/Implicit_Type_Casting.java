package typeCasting;

public class Implicit_Type_Casting {

	public static void main(String[] args) {
		
		//smaller data type to larger data type
		//Widening Casting
		//automatically converted by compiler
		
		
		int intValue=100;
		long longValue=intValue; //automatically converted integer value to long value
		System.out.println("Intger to Long conversion: "+longValue);//100
		
		double doubleValue=intValue;
		System.out.println("Intger to Double conversion: "+doubleValue); //100.0
		
		float floatValue=10.5f;
		doubleValue=floatValue;
		System.out.println("Float to Double Conversion: "+doubleValue); //10.5
		
		floatValue=intValue;
		System.out.println("Intger to Float conversion: "+floatValue); //100.0
		
		//intValue=floatValue; //invalid 
		//System.out.println(intValue);
		
//		char c='C'; //invalid
//		String s=c;
	}

}
