package java30;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
public class DAY23 {
      
    public static void main(String[] args) {
        // Test cases
        System.out.println(verifyBrackets("{[()]}")); // true
        System.out.println(verifyBrackets("{[(])}")); // false
        System.out.println(verifyBrackets("")); // true
        System.out.println(verifyBrackets("{[()]")); // false
        System.out.println(verifyBrackets("{[()]}}")); // false
        System.out.println(verifyBrackets("{[(<>)]}")); // true
        System.out.println(verifyBrackets("{[({})]}")); // true
    }

    public static boolean verifyBrackets(String input) {
        // Implement this method
        Map<Character,Character> brac= new HashMap<>();
        brac.put(')', '(');
        brac.put(']', '[');
        brac.put('>', '<');
        brac.put('}', '{');
        Stack<Character> stack=new Stack<>();
        for(char ch:input.toCharArray()){
            if(brac.containsValue(ch)){
                stack.push(ch);
            }
            else if(brac.containsKey(ch)){
                if(stack.isEmpty()||stack.pop()!=brac.get(ch)){
                    return false;
                }
            }
        }
        return true;

    }
}