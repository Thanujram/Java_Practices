package DataStructures.Queue;

import java.util.*;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){

        Queue<String> pQueue = new java.util.PriorityQueue<>();

        pQueue.add("Start");
        pQueue.add("Middle");
        pQueue.add("End");

//        System.out.println("INITIAL" + pQueue);
//
//        pQueue.remove("Start");
//
//        System.out.println("REMOVED" + pQueue);
//
//        System.out.println("POLL METHOD" + pQueue.poll());
//
//        System.out.println("FINAL" + pQueue);

        Iterator iterator = pQueue.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
