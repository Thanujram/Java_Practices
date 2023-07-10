package Array;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String []args){

        int[] arr = {11,22,33,44,55,66,77,88,99};

        for(int i = 0; i < arr.length / 2 ; i++){
            System.out.println("arr val :"+ (arr.length / 2));
            int first_index = i;
            int last_index = (arr.length - 1) - i;

            System.out.println("Loop :" + (i + 1));
            int temp = arr[first_index];
            arr[first_index] = arr[last_index];
            arr[last_index] = temp;
        }

        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }
}
