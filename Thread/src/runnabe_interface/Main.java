package runnabe_interface;

public class Main {

    public static void main(String args[])
    {
        A t1 = new A();

        Thread t2 = new Thread(t1);
        t2.start();
    }

}

class A extends B implements Runnable
{

    @Override
    public void run() {
        for (int i=0; i<10; i++)
        {
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B
{

}
