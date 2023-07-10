package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class TestThrows1 {
    public static void method() throws FileNotFoundException{
         throw new FileNotFoundException();
    }

    public static void main(String [] args){
        try{
            method();
        }
        catch(FileNotFoundException fEx){
            fEx.printStackTrace();
        }
    }
}
