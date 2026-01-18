package arrays;

public class OddEvenNumbersArray {

	public static void main(String[] args) {
		
		int arr[]= {10,21,30,31};
		int evenCount=0, oddCount=0;
		
		for(int i=0;i<arr.length; i++)
		{
			if (arr[i] %2 ==0)
			{
				System.out.println("Even number: "+arr[i]);
				evenCount++;
			}
			else
			{
				System.out.println("Odd number: "+arr[i]);
				oddCount++;
			}
				
		}
		System.out.println("Count of Even no of elements of in an array is: "+evenCount);
		System.out.println("Count of odd no of elements of in an array is: "+oddCount);
	}

}
