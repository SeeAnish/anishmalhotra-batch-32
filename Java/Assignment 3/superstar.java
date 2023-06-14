class Parent
{
    int pvar;
    Parent(int pvar){
        this.pvar = pvar;
    }
}
class Child extends Parent
{
    int cvar;
    Child(int pvar, int cvar)
    {
        super(pvar);
        this.cvar = cvar;
    }
    Child(int cvar)
    {
        super(0);
        this.cvar = cvar;
    }
    public void dvar()
    {
        System.out.println("Parent variable = " + pvar);
        System.out.println("Child variable = " + cvar);
    }
}
public class superstar
{
    public static void main(String args[])
    {
        Child c1 = new Child(10);
        c1.dvar();
        System.out.println();
        Child c2 = new Child(20, 30);
        c2.dvar();
    }
}
