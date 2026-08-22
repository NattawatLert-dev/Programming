package oop.a7super;

public class Person {
    
    String fname;
    String lname;

    public Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public void showName(){
        System.out.println(this.fname + " " + this.lname);
    }
}
