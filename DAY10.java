package java30;

public class DAY10 {
        public static void main(String[] args) {
            // Example function calls
            System.out.println(binaryToDecimal("1010")); // Should output 10
            System.out.println(binaryToDecimal("111")); // Should output 7
            System.out.println(binaryToDecimal("100")); // Should output 4
            System.out.println(binaryToDecimal("1010101")); // Should output 85
            // Uncomment the following line to test invalid input
            // System.out.println(binaryToDecimal("10a1")); // Should throw IllegalArgumentException
        }
    
        public static int binaryToDecimal(String binary) {
            // Check for invalid characters in the binary string
            for (char c : binary.toCharArray()) {
                if (c != '0' && c != '1') {
                    throw new IllegalArgumentException("Input string contains invalid characters. Only '0' and '1' are allowed.");
                }
            }
            
            // Convert binary string to decimal
            int decimal = 0;
            int length = binary.length();
            for (int i = 0; i < length; i++) {
                // Calculate the value of the current bit
                int bitValue = binary.charAt(length - 1 - i) - '0';
                // Update the decimal value
                decimal += bitValue * Math.pow(2, i);
            }
            
            return decimal;
        }
    }
    

