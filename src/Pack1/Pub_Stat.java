package Pack1;

public class Pub_Stat {
    public static void main(String[] args){


        _statClassMethod();

        Pub_Stat class1 = new Pub_Stat();

        class1._pubClassMethod();

    }

    public void _pubClassMethod(){
        System.out.println("Public class");
    }

    static void _statClassMethod(){
        System.out.println("Static class");
    }
}


