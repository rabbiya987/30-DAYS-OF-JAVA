package java30;

public class DAY21 {
         public static boolean validateCreditCard(String creditCardNumber) {
                    int sum = 0;
                    boolean alternate = false;
            
                    // Iterate over the credit card number from right to left
                    for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
                        int n = Integer.parseInt(creditCardNumber.substring(i, i + 1));
                        
                        if (alternate) {
                            n *= 2;
                            if (n > 9) {
                                n = (n % 10) + 1; // Sum the digits if n is a two-digit number
                            }
                        }
                        sum += n;
                        alternate = !alternate; // Toggle the alternate flag
                    }
            
                    // Valid if the total sum is a multiple of 10
                    return (sum % 10 == 0);
                }
            
                public static void main(String[] args) {
                    // Test cases
                    System.out.println(validateCreditCard("4532015112830366")); // Expected: true (valid)
                    System.out.println(validateCreditCard("1234567812345670")); // Expected: false (invalid)
                    System.out.println(validateCreditCard("4916119711304545")); // Expected: true (valid)
                    System.out.println(validateCreditCard("1234567812345678")); // Expected: false (invalid)
                }
            }