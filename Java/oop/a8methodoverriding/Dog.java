package oop.a8methodoverriding;

public class Dog extends Animal{
    
    @Override
    public void move(){
        System.out.println("The dog is running");
    }
}
