package Abstraction;

public class Run {
    public static void main(String [] args){

        //Abstraction class
        ImplAbstraction abstraction_class = new ImplAbstraction();

        abstraction_class.disp2();

        abstraction_class.disp1();

        Abstraction_Class dir_abstraction_class = new Abstraction_Class() {
            @Override
            void disp2() {
                System.out.println("changed in main");
            }
        };

        dir_abstraction_class.disp2();
        dir_abstraction_class.disp1();

        //Interface
        DisplayThingsImpl displayThings = new DisplayThingsImpl();

        displayThings.disp1();
    }
}
