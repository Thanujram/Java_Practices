package Inheritance;

public class Run {
    public static void main(String[] args){

        Teacher tr1 = new Teacher();

        tr1.login();

        User U1 = new User();
        U1.login();
        User U2 = new Teacher();
        U2.login();
        User U3 = new Student();
        U3.login();
    }
}
