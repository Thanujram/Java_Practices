package DataStructures.Stacks;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    Scanner scanner = new Scanner(System.in);

    //Adding values for stack
    static void stackPush(Stack<Integer> _stack){

        for (int i=0; i<5; i++){
            _stack.push((i*10)+(i+3));
        }
        System.out.println("Stacked");
    }


    static void stackPushString(Stack<String> _stack){

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++){
            System.out.print("Enter name:");
            String val = scanner.nextLine();
            _stack.push(val);
        }
        System.out.println("Stacking");
    }

    //Remove values from stack
    static void stackPop(Stack<Integer> _stack){

        System.out.println("Popping");

        for (int j=0; j<5; j++){

            int x = _stack.pop();
            System.out.println(x);
        }
    }

    static void stackPopString(Stack<String> _stack){

        System.out.println("Popping");

        for (int j=0; j<5; j++){

            String x = _stack.pop();
            System.out.println(x);
        }
    }


    public static void main(String[] Args){

//        Stack<Integer> stack = new Stack<Integer>();
//
//        stackPush(stack);
//        System.out.println(stack);
//        stackPop(stack);

        Stack stackString = new Stack<>();
        stackPushString(stackString);
        System.out.println(stackString);
        stackPopString(stackString);



//        System.out.println("Peek:"+ stack.peek());
//
//        System.out.println("13 in :" + stack.search(47));

    }
}