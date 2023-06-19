package Day1415;
import java.util.*;
public class StringSortingExample
{
    public static void main(String[] args)
    {
        String[] strings = {"apple", "banana", "cherry", "date", "egg", "fig"};
        Arrays.stream(strings)
                .sorted((s1, s2) ->
                {
                    if(s1.length() == s2.length()) return s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1);
                    else return s1.length() - s2.length();
                })
                .forEach(s -> System.out.println(s));
    }
}