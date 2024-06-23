package java30;


public class DAY26 {
        public static void main(String[] args) {
            // Test cases
            System.out.println(compressString("aaabbc")); // Expected Output: a3b2c1
            System.out.println(compressString("abcd"));   // Expected Output: a1b1c1d1
            System.out.println(compressString("zzzzz"));  // Expected Output: z5
            System.out.println(compressString("!@##$%")); // Expected Output: !1@1#2$1%1
        }
    
        public static String compressString(String input) {
            // Write your code here
          StringBuilder comp=new StringBuilder();
          char current=input.charAt(0);
          int cout=1;

          for(int i=1;i<input.length();i++){
            if(input.charAt(i)==current){
                cout++;
            }
            else{
                comp.append(current).append(cout);
                current=input.charAt(i);
                cout=1;
            }
          }
          comp.append(current).append(cout);
          return comp.toString();
        }
    }
    
    
