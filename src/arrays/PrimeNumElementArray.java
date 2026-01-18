package arrays;

public class PrimeNumElementArray {

	public static void main(String[] args) {

		int arr[]= {4,5,3,13,16};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			count=0;
			for(int j=2; j<=arr[i]; j++ )
			{
				if(arr[i] % j == 0)
				{
					count++;
					
				}
			}
			if(count >=2)
			{
				System.out.println("Not a prime number: "+arr[i]);
			}
			else
			{
				System.out.println("Prime number: "+arr[i]);
			}
			System.out.println();
		}
		
	}

}
