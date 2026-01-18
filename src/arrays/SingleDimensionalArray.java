package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//1. Declaration of an array
		//2. Initialization of an array
		//3. Read length of an array
		//4. Read Single Value of an array
		//5. Read all elements of an array
		
		//int a[]=new int[5]; //1. Declaration of an array of fixed array size 5
		
		// 2. Initialization of an array approach 1
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=600;
//		a[4]=500;
//		
		//3. Initialization of an array: approach 2
		
		int a[]= {100,200,300,400,600,500}; //array Declaration + Initialization at same time and of dynamic in size
		
		
		//4. Read single value of an arry
		System.out.println("Reading element of index 2 in array: "+a[2]); //300
		
		//5. Read all elements of an array using  for loop
		System.out.println("reading array using for loop");
		for(int i=0; i<a.length; i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println();
		System.out.println("reading an array using enhanced or for each loop");
		
		for(int x: a)
		{
			System.out.print(x+" ");
		}
	}

}
