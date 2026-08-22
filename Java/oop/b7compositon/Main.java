package oop.b7compositon;

public class Main {
    public static void main(String[] args) {
        
        // Composition = แสดงถึงความสัมพันธ์แบบ "เป็นส่วนหนึ่งของ" (part-of)
        //               ระหว่างออบเจ็กต์
        //               ตัวอย่างเช่น Engine เป็น "ส่วนหนึ่งของ" Car
        //               ช่วยให้สามารถสร้างออบเจ็กต์ที่ซับซ้อนขึ้น
        //               จากการประกอบออบเจ็กต์ขนาดเล็กหลาย ๆ ตัวเข้าด้วยกัน

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);        // Corvette
        System.out.println(car.year);         // 2025
        System.out.println(car.engine.type);  // V8

        car.start();    // You start the V8 enine
                        // THe corvette is running
    }
}
