package oop.b7compositon;

public class Engine {
    
    String type;

    public Engine(String type) {
        this.type = type;
    }
    
    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
    
}
