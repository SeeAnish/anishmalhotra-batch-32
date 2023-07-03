package Lamda;
import java.util.Arrays;
import java.util.Comparator;
public class StringCapitalization
{
    public static void main(String[] args)
    {
        String[] strings = {"banana", "dog","cat", "apple", "elephant"};
        Arrays.stream(strings)
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(s -> System.out.println(s));
    }
}