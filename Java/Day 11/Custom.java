package Day_11;

public class Custom
{
    static int divide(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ce) {
            try {
                throw new Except("Denominator is zero. Therefore division not possible");
            }
            catch (Except e)
            {
                System.out.println("Printing Custom message: " + e);
            }
        }
    }
}
class Except extends Exception
{
    public Except(String message)
    {
        super(message);
    }
}
