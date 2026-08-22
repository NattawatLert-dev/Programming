package oop.b4runtimepolymorphism;

public class Main {
    public static void main(String[] args) {
        
        // Runtime polymorphism = การเกิดพหุรูป (Polymorphism) ในช่วงรันไทม์
        //                        คือ เมธอดที่จะถูกเรียกใช้งาน จะถูกตัดสินใจ
        //                        ในขณะโปรแกรมกำลังทำงาน (Runtime)
        //                        โดยอิงจากชนิดจริง (Actual Type) ของออบเจ็กต์
        //                        ไม่รู้ล่วงหน้าว่าจะเรียกเมธอดของคลาสไหน จนกว่าจะถึงตอนที่โปรแกรมกำลังรันอยู่

        Animal animal;

        animal = new Dog();
        animal.speak();      // The Dog goes woof

        animal = new Cat();
        animal.speak();      // The cat goes meow

    }
}
