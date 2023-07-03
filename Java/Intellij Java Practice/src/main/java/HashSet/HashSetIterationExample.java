package HashSet;
import  java.util.*;
public class HashSetIterationExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Durian");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grape");
        set.add("Honeydew");
        set.add("Kiwi");
        set.add("Lemon");
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());
        System.out.println();
        System.out.println("Iterating HashSet using forEach:");
        set.forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("Iterating HashSet using Streams forEach:");
        set.stream().forEach(System.out::println);
        System.out.println();
        System.out.println("Iterating HashSet using enhanced for loop:");
        for(String s: set) System.out.println(s);
    }
}
