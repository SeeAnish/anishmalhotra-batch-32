interface phase1{
    void method1();
}
interface phase2{
    void method2();
}
class fphase implements phase1, phase2{
    public void method1(){
        System.out.println("Printing method 1");
    }
    public void method2(){
        System.out.println("Printing method 2");
    }
}
public class Megastar {
    public static void main(String args[])
    {
        fphase take = new fphase();
        take.method1();
        take.method2();
    }
}