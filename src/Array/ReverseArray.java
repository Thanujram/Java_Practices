package Array;

public class ReverseArray {
    public static void main(String []args) {

        int[] ar = {12,34,56,78,90};

        int len = ar.length;

        int[] rar = new int[len];

        for(int i = 0; i < len; i++){
            rar[i] = ar[len-1-i];
        }

        for(int i = 0; i < rar.length; i++)
        System.out.println(rar[i]);
    }
}
