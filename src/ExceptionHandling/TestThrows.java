package ExceptionHandling;

public class TestThrows {
    public static void validate(int a){
        if(a<21) throw new ArithmeticException("Not Eligible");
        else System.out.println("Eligible");
    }

    public static void main(String [] args){
        validate(11);
    }
}
