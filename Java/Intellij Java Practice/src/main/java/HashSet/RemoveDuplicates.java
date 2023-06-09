package HashSet;
import java.util.*;
public class RemoveDuplicates {
    public String removeDuplicateLetters(String s) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray())
        {
             set.add(Character.toString(c));
        }
        for(String str: set) sb.append(str);
        return sb.toString();
//        Stack<Character> stack = new Stack<>();
//        HashSet<Character> seen = new HashSet<>();
//        HashMap<Character, Integer> last_occurrence = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) last_occurrence.put(s.charAt(i), i);
//        for(int i = 0; i < s.length(); i++)
//        {
//            char c = s.charAt(i);
//            if (!seen.contains(c))
//            {
//                while(!stack.isEmpty() && c < stack.peek() && last_occurrence.get(stack.peek()) > i) seen.remove(stack.pop());
//                seen.add(c);
//                stack.push(c);
//            }
//        }
//        StringBuilder sb = new StringBuilder(stack.size());
//        for (Character c : stack) sb.append(c.charValue());
//        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "cbacdcbc";
        String str = "Hello World";
        String result = new RemoveDuplicates().removeDuplicateLetters(input);
        System.out.println("Result1: " + result);
        System.out.println("Result2: " + new RemoveDuplicates().removeDuplicateLetters(str));
    }
}
