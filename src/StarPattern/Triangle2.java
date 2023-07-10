package StarPattern;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = num - 1; l > (num - i); l--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= num - 1; i++){
            for(int l = 1; l <= i; l++){
                System.out.print(" ");
            }
            for(int j = 1; j <= num - i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= num - (i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
