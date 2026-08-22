package oop.a7super;

public class Employee extends Person{
    
    int salary;

    public Employee(String fname, String lname, int salary){
        super(fname, lname);
        this.salary = salary;
    }

    public void showSalary(){
        System.out.println(this.fname + "'s salary is $" + this.salary);
    }

}
