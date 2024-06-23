package java30;

public class DAY29 {
        private static final String KEY = "codedamn";
    
        public static void main(String[] args) {
            // Test cases
            System.out.println(vigenereCipher("uddgh, ttr hwqeo fdbphliu", "decode")); // space, the final frontier
            System.out.println(vigenereCipher("May the Force be with you.", "encode")); // Oob xke Rbtqh fh wugj mry.
            System.out.println(vigenereCipher("Vvh qrsf rphhvwauakbj sxtobos lw whq zqgw plkqya", "decode")); // The most entertaining outcome is the most likely.
        }
    
        public static String vigenereCipher(String text, String action) {
            StringBuilder result = new StringBuilder();
            int keyLength = KEY.length();
            int keyIndex = 0;
    
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
    
                if (Character.isLetter(currentChar)) {
                    boolean isUpperCase = Character.isUpperCase(currentChar);
                    char keyChar = KEY.charAt(keyIndex % keyLength);
                    keyIndex++;
    
                    int shift = keyChar - 'a';
                    if (action.equals("decode")) {
                        shift = -shift;
                    }
    
                    char base = isUpperCase ? 'A' : 'a';
                    char newChar = (char) (((currentChar - base + shift + 26) % 26) + base);
                    result.append(newChar);
                } else {
                    // Non-alphabetic characters are not modified
                    result.append(currentChar);
                }
            }
    
            return result.toString();
        }
    }
