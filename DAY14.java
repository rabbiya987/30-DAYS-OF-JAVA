package java30;

import java.util.Arrays;

public class DAY14 {
        public static void main(String[] args) {
            // Example test cases
            System.out.println(isAnagram("test", "test")); // true
            System.out.println(isAnagram("Listen", "Silent")); // true
            System.out.println(isAnagram("hello", "world")); // false
            System.out.println(isAnagram("Astronomer", "Moon starer")); // true
        }
    
    public static boolean isAnagram(String str1, String str2) {
        // Normalize the input
        String normalizedStr1 = str1.toLowerCase().replaceAll("\\W+", "");
        String normalizedStr2 = str2.toLowerCase().replaceAll("\\W+", "");

        // Sort the characters
        char[] chars1 = normalizedStr1.toCharArray();
        char[] chars2 = normalizedStr2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted strings
        return Arrays.equals(chars1, chars2);
    }
}
    
