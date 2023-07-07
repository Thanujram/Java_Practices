package ExceptionHandling;

public class MultipleCatch {
    public static void main(String []args){
        try{
            int a[] = new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException aEx){
            System.out.println(aEx);
        }
        catch (ArrayIndexOutOfBoundsException arEx){
            System.out.println(arEx);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
