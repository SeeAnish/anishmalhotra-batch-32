package Day_11;

public class StringtoInt
{
    private int convert(String str)
    {

        try {
            int result = Integer.parseInt(str);
            return result;
        }
        catch (Exception e)
        {
            System.out.println("Invalid input. Cannot convert the string to an integer.");
            return -1;
        }
    }
    public static void main(String args[])
    {
        String[] words = {"23", "45.67" , "test", "123f"};
        StringtoInt con = new StringtoInt();
        for(String word: words)
        {
            int result = con.convert(word);
            System.out.println("Input: " + word + ", Converted to int: " + result);
        }

    }
}
