package oop.b1abstraction;

public class Circle extends Shape{
    
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius;
    }

    public void DisplayArea(){
        System.out.printf("%.2f\n", area());
    }
}
