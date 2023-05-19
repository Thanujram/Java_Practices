package Pack1;

public class Basic {
    public static void main(String[] args){

        Student student = new Student();

        System.out.println(student.c + 10);

        System.out.println(student._c);

//        student._c = student._c+ 10;

        System.out.println(student._c + 10);
    }
}

class Student {
    int c = 55;

    final int _c = 50;
}