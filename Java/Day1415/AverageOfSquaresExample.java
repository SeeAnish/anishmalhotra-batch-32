package Day1415;
import java.util.*;
public class AverageOfSquaresExample
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double ave = Arrays.stream(nums)
                .filter(num -> num%2 != 0)
                .map(n -> n*n)
                .average()
                .orElse(0);
        System.out.println("Average of squares of odd numbers: " + ave);
    }
}
