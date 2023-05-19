package DataStructures.LinkedList;

class LinkedList{

    // head of the list
    Node head;

    //Node of LL
    static class Node{
        int data;
        Node next;

        //Constructor
        Node( int d){
            data = d;
            next = null;
        }
    }

    //Traversal

    public void printLList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args){

        // Linkedlist defineing
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node _2 = new Node(22);
        Node _3 = new Node( 33);

        linkedList.head.next = _2;
        _2.next = _3;

        linkedList.printLList();
    }
}