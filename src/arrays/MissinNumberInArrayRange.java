package arrays;

public class MissinNumberInArrayRange {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int n = 5;  // range is 1 to 5
        int actualSum = 0;

        int expectedSum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
