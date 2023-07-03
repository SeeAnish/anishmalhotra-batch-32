package HashMap;
import java.util.*;
public class DistinctCharactersExample {
    public static void main(String[] args) {
        String input = "test string";
        String input2 = "Hello, World!";
        new DistinctCharactersExample().printDistinctCharacters(input);
        System.out.println();
        new DistinctCharactersExample().printDistinctCharacters(input2);
    }
    private void printDistinctCharacters(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
