package variablesDatatypes;

public class CL2_DataTypes {

	public static void main(String[] args) {

		// Primitive Data Types:
		// A. Numeric Non-Decimal/Whole Numbers
		// 1. Byte: byte -128 to +127
		byte b = 100;
		System.out.println("Byte: " + b);

		// 2. short: -32768 to +32767
		short s = 1234;
		System.out.println("Short: " + s);

		// 3. int: -2147483 to +2147782
		int i = 123456;
		System.out.println("Int: " + i);

		// 4. long: -9223372036854775808 to +9223372036854775807
		long l = 9223372036854775807l; // literal l or L is needed at the end
		System.out.println("Long: " + l);

		// B. Numeric Decimal Data types/Fraction Numbers
		// 1. Float : unto 7 decimal numbers
		float f = 1.1234567f; // literal F is need at the end of initialization
		System.out.println("Float: " + f);

		// 2. Double: unto 15 decimal numbers
		double d = 1.12345678909876;
		System.out.println("Double: " + d);

		// C. Character: 2 byte & single quote used
		char c = 'A'; // single quote ('') is used while initialize value
		System.out.println("Character :" + c);

		// char c="c"; //invalid
		// char c="ABC"; //invalid
		// char c='ABC' //invalid

		// String st='A';//invalid
		// String st="A";//valid
		// String st='ABC'; //invalid

		// D. Conditional: Boolean: 1 bit
		boolean bl = true; // only true false values
		System.out.println("Boolean: " + bl);

		// boolean bl="true" //invalid
		// boolean bl="false"

		// B.Non-primitive Data Type
		String bl1 = "false"; // valid
		System.out.println(bl1);

	}

}
