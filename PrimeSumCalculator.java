public class PrimeSumCalculator {

    // Function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to find the sum of all primes except the smallest prime
    public int findSumOfPrimes(int[] input1, int input2) {
        if (input2 == 0) return 0;

        int smallestPrime = Integer.MAX_VALUE;
        int sumOfPrimes = 0;
        boolean hasPrime = false;

        for (int num : input1) {
            if (isPrime(num)) {
                hasPrime = true;
                if (num < smallestPrime) {
                    smallestPrime = num;
                }
                sumOfPrimes += num;
            }
        }

        if (hasPrime) {
            return sumOfPrimes - smallestPrime;
        } else {
            // If no prime numbers, sum all numbers except the smallest one
            int smallest = Integer.MAX_VALUE;
            int sumOfAll = 0;

            for (int num : input1) {
                if (num < smallest) {
                    smallest = num;
                }
                sumOfAll += num;
            }

            return sumOfAll - smallest;
        }
    }

    public static void main(String[] args) {
        PrimeSumCalculator calculator = new PrimeSumCalculator();

        // Test case 1: Array with multiple prime numbers
        int[] array1 = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int result1 = calculator.findSumOfPrimes(array1, array1.length);
        System.out.println("Test Case 1 Result: " + result1); // Expected output: 241

        // Test case 2: Array with no prime numbers
        int[] array2 = {10, 20, 30, 40};
        int result2 = calculator.findSumOfPrimes(array2, array2.length);
        System.out.println("Test Case 2 Result: " + result2); // Expected output: 90

        // Test case 3: Array with only one prime number
        int[] array3 = {7};
        int result3 = calculator.findSumOfPrimes(array3, array3.length);
        System.out.println("Test Case 3 Result: " + result3); // Expected output: 0

        // Test case 4: Array with all prime numbers
        int[] array4 = {2, 3, 5, 7, 11};
        int result4 = calculator.findSumOfPrimes(array4, array4.length);
        System.out.println("Test Case 4 Result: " + result4); // Expected output: 26 (sum is 28, smallest prime is 2)

        // Test case 5: Array with mixed numbers
        int[] array5 = {1, 2, 4, 6, 8, 11, 13};
        int result5 = calculator.findSumOfPrimes(array5, array5.length);
        System.out.println("Test Case 5 Result: " + result5); // Expected output: 24 (sum is 26, smallest prime is 2)
}

}