import java.util.*;

class UserMainCode {
    public int findSumOfPrimes(int[] input1, int input2) {
        int sum = 0;
        int minPrime = Integer.MAX_VALUE;
        boolean primeFound = false;

        for (int i = 0; i < input2; i++) {
            if (isPrime(input1[i])) {
                primeFound = true;
                sum += input1[i];
                if (input1[i] < minPrime) {
                    minPrime = input1[i];
                }
            }
        }

        if (!primeFound) {
            int minElement = Arrays.stream(input1).min().getAsInt();
            sum = Arrays.stream(input1).sum() - minElement;
        } else {
            sum -= minPrime;
        }

        return sum;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        int[] input1 = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int input2 = 11;
        int result = obj.findSumOfPrimes(input1, input2);
        System.out.println("Output: " + result); // Expected output: 241
}
}