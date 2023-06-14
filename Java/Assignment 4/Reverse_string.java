import java.util.*;
public class Reverse_string
{
    public static void main(String args[])
    {
        String s = "Java J2EE Reverse Me";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words)
        {
        StringBuilder rword = new StringBuilder(word);
        rword.reverse();
        sb.append(rword).append(" ");
        }
        System.out.println(sb);
    }
}
