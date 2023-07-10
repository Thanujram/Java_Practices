package ExceptionHandling;

public class UserDefined{
    public static void main(String []args){
        try{
            throw new UserDefinedException("User Defined Exception");
        }
        catch (UserDefinedException udEx){
            System.out.println(udEx.getMessage());
        }
    }
}

class UserDefinedException extends Exception{
    public UserDefinedException(String s){
        super(s);
    }
}
