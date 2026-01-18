package arrays;

public class ObjectArray {

	public static void main(String[] args) {
	
		//Object type of an array can store any kind of heterogeneous data unlike other primitive data types
		
		Object arr[]= {1, "Akshay", 60.1, 'A'};
		
		System.out.println("Reading all values of an Object Type of array: ");
		for(Object o:arr)
		{
			System.out.println(o);
		}

	}

}
