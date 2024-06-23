package java30;

public class DAY11 {
        public static void main(String[] args) {
            // Test cases
            System.out.println("isPowerOfTwo(1): " + isPowerOfTwo(1)); // Should return true
            System.out.println("isPowerOfTwo(5): " + isPowerOfTwo(5)); // Should return false
            System.out.println("isPowerOfTwo(16): " + isPowerOfTwo(16)); // Should return true
            System.out.println("isPowerOfTwo(-2): " + isPowerOfTwo(-2)); // Should return false
            System.out.println("isPowerOfTwo(0): " + isPowerOfTwo(0)); // Should return false
        }
    
        // create the "isPowerOfTwo" method here
        public static boolean isPowerOfTwo(int number) {
            if (number > 0 && ((number & (number - 1)) == 0)) {
                return true;
            }
            return false;
        }
        
    }

