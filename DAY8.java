package java30;

public class DAY8 {
        public static void main(String[] args) {
            // Test cases
            System.out.println(isPalindrome("racecar")); // true
            System.out.println(isPalindrome("A man, a plan, a canal ? Panama")); // true
            System.out.println(isPalindrome("codedamn")); // false
            System.out.println(isPalindrome("")); // true
            System.out.println(isPalindrome("a")); // true
        }
    
        public static boolean isPalindrome(String text) {
            // Step 1: Normalize the string
            StringBuilder cleanedText = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    cleanedText.append(Character.toLowerCase(c));
                }
            }
    
            // Step 2: Check if the cleaned string is a palindrome
            String normalizedText = cleanedText.toString();
            String reversedText = cleanedText.reverse().toString();
    
            return normalizedText.equals(reversedText);
        }
    }
    

