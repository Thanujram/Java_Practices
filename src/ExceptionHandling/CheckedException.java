package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args){
        PrintWriter printWriter;

        try{
            printWriter = new PrintWriter("jtp.txt");
            printWriter.println("Saved");
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }

    }
}
