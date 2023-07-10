package Array;

public class ReverseArray3 {
    public static void main(String [] args){
        int[] arr = {12,23,34,45,56,67,78,89};

        System.out.println("Initial Array");
        printAr(arr);
        System.out.println("Reversed Array");
        reverseArray(arr, 0, arr.length-1);
        printAr(arr);

    }
    static void reverseArray(int[] ar, int start, int end){
        if(start >= end) return;

        int temp = ar[end];
        ar[end] = ar[start];
        ar[start] = temp;

        reverseArray(ar, start + 1, end - 1);
    }

    static void printAr(int[] ar){
        for(  int i : ar){
            System.out.print(i);
        }
        System.out.println();
    }
}
