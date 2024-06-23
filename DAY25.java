package java30;

public class DAY25 {
        public static void main(String[] args) {
            // Test cases
            int[] testNumbers = {370, 371, 0, 1, 1634, 2, 123};
    
            for (int number : testNumbers) {
                System.out.println("Is " + number + " an Armstrong number? " + isArmstrongNumber(number));
            }
        }
    
        public static boolean isArmstrongNumber(int number) {
            // Write your code here
            if (number < 0) {
                return false;
            }
    
            // Convert the number to a string to easily access each digit
            String numStr = Integer.toString(number);
            int numDigits = numStr.length();
            int sum = 0;
            
            // Iterate through each digit in the number
            for (int i = 0; i < numDigits; i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += Math.pow(digit, numDigits);
            }
            
            // Check if the sum of the powered digits equals the original number
            return sum == number;
        }
    }

