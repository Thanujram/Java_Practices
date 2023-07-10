package Threads;

public class Thread4 implements Runnable{
    public void run(){
        System.out.println("Running");
    }

    public static void main(String []Args){
         Runnable r1 = new Thread4();

         Thread th1 = new Thread(r1,"New thread");

         th1.start();

         System.out.println(th1.getName());
    }
}
