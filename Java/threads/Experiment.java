package threads;

public class Experiment extends Thread
{
        public static void main(String args[])
        {
            Experiment t = new Experiment();
            t.start();
        }
        public void run() {
            for(int i = 1; i <= 10; i++)
                System.out.println(i);
        }
}
