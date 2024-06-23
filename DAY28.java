package java30;

public class DAY28 {
        public static void main(String[] args) {
            // Example test cases
            System.out.println(validateISBN("978-1-982181-28-4")); // true
            System.out.println(validateISBN("778-1-921181-28-4")); // false
            System.out.println(validateISBN("9780593078754"));     // true
        }
    
        public static boolean validateISBN(String isbn) {
            // Write your code here
                    // Remove hyphens from the input string
            isbn = isbn.replace("-", "");
    
            // Check if the length is either 10 or 13
            if (isbn.length() == 10) {
                return isValidISBN10(isbn);
            } else if (isbn.length() == 13) {
                return isValidISBN13(isbn);
            } else {
                return false; // Invalid length
            }
        }
    
        private static boolean isValidISBN10(String isbn) {
            // ISBN-10 validation logic
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                char c = isbn.charAt(i);
                int digit;
                if (i == 9 && c == 'X') {
                    digit = 10; // 'X' represents 10 in ISBN-10
                } else if (Character.isDigit(c)) {
                    digit = Character.getNumericValue(c);
                } else {
                    return false; // Invalid character
                }
                sum += digit * (10 - i);
            }
            return sum % 11 == 0;
        }
    
        private static boolean isValidISBN13(String isbn) {
            // ISBN-13 validation logic
            int sum = 0;
            for (int i = 0; i < 13; i++) {
                int digit = Character.getNumericValue(isbn.charAt(i));
                if (i % 2 == 0) {
                    sum += digit;
                } else {
                    sum += digit * 3;
                }
            }
            return sum % 10 == 0;
        }
        }
    

