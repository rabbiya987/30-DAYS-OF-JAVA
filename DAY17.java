package java30;

public class DAY17 {
        public static void main(String[] args) {
            // Test cases
            System.out.println(generateHexCode(0, 0, 0));    // Black
            System.out.println(generateHexCode(255, 255, 255)); // White
            System.out.println(generateHexCode(255, 255, 0));   // Yellow
        }
    
        public static String generateHexCode(int red, int green, int blue) {
            String hexCode = String.format("#%02X%02X%02X", red, green, blue);

        return hexCode;
        }
    }
    
