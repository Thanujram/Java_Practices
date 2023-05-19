package Pack2;

public class Nested {
    public static void main(String[] args){
        OuterClass _out = new OuterClass();
        _out.dis1();

        OuterClass.InnerClass _in = _out.new InnerClass();
        _in.dis2();
    }

}

class OuterClass{
    void dis1(){
        System.out.println("Outer");
    }

    class InnerClass{
        void  dis2(){
            System.out.println("Inner");
        }
    }
}