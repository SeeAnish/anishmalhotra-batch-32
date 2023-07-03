package Lamda;
import java.util.*;
public class VowelCountExample {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Cat", "Dog", "Elephant", "BCD"};
        System.out.println(Arrays.toString(strings));
        Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> System.out.println(s + " (Vowel: " + counting(s) + ")"));
    }

    public static int counting(String str) {
        String vowels = "AEIOUaeiou";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(Character.toString(c))) {
                count++;
            }
        }
        return count;
    }
}
