package Threads;

public class Thread2 implements Runnable{

    public void run(){
        System.out.println("Thread Running");
    }

    public static void main(String []args){
        Thread2 m1 = new Thread2();

        Thread t1 = new Thread(m1);

        t1.start();
    }
}
