package arrays;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		
		//1. Declaration of an array
		//2. Initialize the array
		//3. Read single value from an array
		//4. Read and length of an array
		//5. Read all element values of an array
		
		//Aproch 1:
		int a[][]=new int[3][2];		//1. Declaration of an array
		//int [][]a=new int[3][2];//valid
		//int []a[]=new int[3][2]; //valid
		//new int[] {1, 2, 3, 4} //anonymous array
		
		a[0][1]= 100;a[0][1]=200; //2. Initialize the array
		a[1][0]=300;a[1][1]=400;
		a[2][0]=600;a[2][1]=500;
		System.out.println("Using approach 1: a["+2+"]["+0+"]: "+(a[2][0])); //3. Read single value from an array
		
		//Approach 2:
		int b[][]= {{100,200},
				{300,400},
				{600,500}
				};
		
		System.out.println("Using approach 2: b["+2+"]["+1+"]: "+(b[2][1])); //3. Read single value from an array
		
		//4. Read and length of an array
		//Length of an row
		System.out.println("Length of row of an array: "+b.length);
		System.out.println("Length of b["+1+"]coloumn of an array: "+b[1].length);
		
		
		//5. Read all values of an array
		
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(" b["+i+"]["+j+"] :"+(b[i][j]));
			}
			System.out.println();
		}
		
		System.out.println("Reading 2 dimensional array using for each loop");
		
		for(int arr[]:b)
		{
			for(int ar: arr)
			{
				System.out.print(ar+" ");
			}
			System.out.println();
		}
		
	}

}
