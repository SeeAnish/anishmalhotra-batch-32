import java.util.Scanner;
public class Vowels
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels = " + count);
    }
}