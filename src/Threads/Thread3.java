package Threads;

public class Thread3 {
    public static void main(String []args){

        Thread t = new Thread("Thread One");

        t.start();

        String str = t.getName();

        System.out.println(str);
    }
}
