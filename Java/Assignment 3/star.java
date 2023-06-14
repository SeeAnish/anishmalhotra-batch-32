final class finalclass
{
    private final int fvar;
    finalclass(int fvar)
    {
        this.fvar = fvar;
    }
    public final void finalmethod()
    {
        System.out.println("The Final Class has been invoked, The final variable value = " + fvar);
    }
}
class anfclass
{
    public void printmethod(final int var)
    {
        finalclass fm = new finalclass(var);
        fm.finalmethod();
    }
}
public class star
{
    public static void main(String args[])
    {
        anfclass am = new anfclass();
        am.printmethod(30);
    }
}