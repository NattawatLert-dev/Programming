package oop.a2constructors;

public class Student {
    
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void Study(){
        System.out.println(this.name + " Studying");
    }

    public void StudentAge(){
        System.out.println(this.age + " year old");
    }

    public void StudentGpa(){
        System.out.println(this.gpa + "\n");
    }
}
