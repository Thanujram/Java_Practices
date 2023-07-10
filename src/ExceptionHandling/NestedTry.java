package ExceptionHandling;

public class NestedTry {
    public static void main(String []args){

        try{
            try{
                System.out.println("Inner try 1");
                int b = 9/0;
            }
            catch(ArithmeticException aEx){
                System.out.println(aEx);
            }

            try{
                System.out.println("Inner try 2");
                int[] a = new int[5];
                a[5] = 4;
            }
            catch (ArrayIndexOutOfBoundsException arEx){
                System.out.println(arEx);
            }
            System.out.println("Outer try");
        }
        catch (Exception eEx){
            System.out.println(eEx);
        }
        System.out.println("Normal Flow");
    }
}
