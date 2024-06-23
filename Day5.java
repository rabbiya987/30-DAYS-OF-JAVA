package java30;

public class Day5 {
        public static void main(String[] args) {
            // Test cases
            System.out.println(calculatedGCD(54, 24)); // Should print 6
            System.out.println(calculatedGCD(35, 49)); // Should print 7
            System.out.println(calculatedGCD(1, 15));  // Should print 1
            System.out.println(calculatedGCD(0, 15));  // Should print 15
        }
    
        public static int calculatedGCD(int a, int b) {
            if (b == 0) {
                return a;
            }
            return calculatedGCD(b, a % b);
        }
    }
    

