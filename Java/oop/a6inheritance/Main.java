package oop.a6inheritance;

public class Main {
    public static void main(String[] args) {
        
        // Inheritance = การสืบทอดคุณสมบัติ (Inheritance)
        //               คือการที่คลาสหนึ่งสืบทอดตัวแปร (attributes)
        //               และเมธอด (methods) มาจากอีกคลาสหนึ่ง
        //               Child (คลาสลูก) <- Parent (คลาสพ่อแม่) <- Grandparent (คลาสปู่ย่าตายาย)

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive); // true
        System.out.println(dog.lives);   // 1
        System.out.println(cat.isAlive); // true
        System.out.println(cat.lives);   // 9

        dog.eat();   // The animal is eating
        dog.speak(); // *The dog goes woof*
        cat.eat();   // The animal is eating
        cat.speak(); // *The cat goes meow*
    }
}
