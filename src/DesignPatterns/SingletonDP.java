package DesignPatterns;

public class SingletonDP {

    // To avoid concurrency and thread safety

    // Private declaration without initializer
    private static SingletonDP instance;

    // Private constructor to avoid direct instantiation
    private SingletonDP(){

    }

    // Initialises class after checking that the class is not initialized earlier
    // Synchronized for ensure thread safety and prevent concurrent access
    public static synchronized SingletonDP getInstance(){
        if(instance == null){
            instance = new SingletonDP();
        }
        return instance;
    }


}
