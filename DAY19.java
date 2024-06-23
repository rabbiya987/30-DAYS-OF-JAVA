package java30;

public class DAY19 {

        // Method to calculate the factorial of a given number using recursion
        public static int factorial(int n) {
            // Base case: factorial of 0 is 1
            if (n == 0) {
                return 1;
            }
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    
        public static void main(String[] args) {
            // Test the factorial method with various inputs
            System.out.println("Factorial of 5: " + factorial(5));   // Expected output: 120
            System.out.println("Factorial of 10: " + factorial(10)); // Expected output: 3628800
            System.out.println("Factorial of 12: " + factorial(12)); // Expected output: 479001600
        }
    }
    