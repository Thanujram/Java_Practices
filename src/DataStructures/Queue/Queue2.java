package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args){


        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<10; i++){
            queue.add((i*10) + (i+5) + ((-1^i)*3));
        }

        System.out.println("QUEUE");
        System.out.println(queue);
        System.out.println("Size of the Queue:" + queue.size());

        System.out.println("HEAD");
        System.out.println("Remove the head if the queue:" + queue.remove());

        System.out.println("QUEUE");
        System.out.println(queue);
        System.out.println("Size of the Queue:" + queue.size());

        System.out.println("HEAD");
        System.out.println("Head of the Queue:" + queue.peek());

        System.out.println("QUEUE");
        System.out.println(queue);
        System.out.println("Size of the Queue:" + queue.size());
    }
}
