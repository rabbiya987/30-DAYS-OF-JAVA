package java30;

public class Day9 {
        public static void main(String[] args) {
            // Example test cases
            System.out.println("Is 0 prime? " + isPrimeNumber(0)); // Expected: false
            System.out.println("Is 3 prime? " + isPrimeNumber(3)); // Expected: true
            System.out.println("Is 2 prime? " + isPrimeNumber(2)); // Expected: true
            System.out.println("Is 99 prime? " + isPrimeNumber(99)); // Expected: false
            System.out.println("Is -5 prime? " + isPrimeNumber(-5)); // Expected: false
        }
    
        public static boolean isPrimeNumber(int n) {
            // Edge cases: numbers less than 2 are not prime
            if (n <= 1) {
                return false;
            }
            // Check for factors from 2 to the square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // If a factor is found, n is not prime
                }
            }
            return true; // If no factors are found, n is prime
        }
    }
    

