package oop.a7super;

public class Student extends Person{

    double gpa;

    public Student(String fname, String lname, double gpa){
        super(fname, lname);
        this.gpa = gpa;
    }

    public void showGpa(){
        System.out.println(this.fname + "'s gpa is: "+ this.gpa);
    }

}
