package oop.a4arrayofobject;

public class Car {
    
    String model;
    String color;

    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
