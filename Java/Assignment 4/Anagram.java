import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        String s = "car";
        String t= "rat";
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c , d)) System.out.println("Strings Match");
        else System.out.println("Strings do not Match");
    }
}