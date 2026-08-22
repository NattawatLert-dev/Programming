package oop.b2interfaces;

public class Main {
    public static void main(String[] args) {
        
        // Interface = แม่แบบ (Blueprint) สำหรับคลาส
        //             ที่กำหนดชุดของเมธอดแบบ abstract
        //             ซึ่งคลาสที่นำ Interface ไปใช้งาน (Implement)
        //             จะต้องกำหนดการทำงานของเมธอดเหล่านั้นทั้งหมด
        //             ช่วยให้สามารถมีพฤติกรรมคล้ายกับการสืบทอดหลายคลาส
        //             (Multiple Inheritance) ได้

        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();

        hawk.hunt();   // The hawk is hunting
        rabbit.flee(); // The rabbit running away

        fish.hunt();   // The fish is hunting
        fish.flee();   // The fish is swimming away

    }
}
