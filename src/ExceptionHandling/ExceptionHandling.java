package ExceptionHandling;

public class ExceptionHandling {

    public static void main(String args[]){

        try{
            int arr[] = {1,3,5,7};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }

    }
}
