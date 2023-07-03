package threads;

public class Experiment_2
{
    public static void main(String[] args) {
        Thread r = new Thread(new exp());
        r.start();
    }
}
class exp implements Runnable{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
            System.out.println(i);
    }
}