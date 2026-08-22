package oop.a3overloadedconstructor;

public class User {
    
    public String name;
    public String email;
    public int age;

    public User(){
        this.name = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    public User(String name){
        this.name = name;
        this.email = "Not Provided";
        this.age = 0;
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

}
