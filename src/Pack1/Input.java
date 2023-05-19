package Pack1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Name is " + name);

        System.out.print("Enter Age:");
        String age = scanner.nextLine();

        System.out.println("Age is " + age);

    }
}
