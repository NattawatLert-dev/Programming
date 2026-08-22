package oop.a8methodoverriding;

public class Main {
    public static void main(String[] args) {
        
        // Method overriding = เมื่อคลาสลูก (Subclass) สร้างเมธอดของตัวเองขึ้นมา
        //                     เพื่อแทนที่ (Override) เมธอดที่มีอยู่แล้วในคลาสแม่ (Superclass)
        //                     ช่วยให้สามารถนำโค้ดกลับมาใช้ซ้ำ (Code Reusability)
        //                     และกำหนดการทำงานเฉพาะของแต่ละคลาสได้ 

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();  // The dog is running
        cat.move();  // The cat is running
        fish.move(); // The fish is swimming
    }
}
