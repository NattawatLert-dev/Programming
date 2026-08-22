package oop.a9tostringmethod;

public class Main {
    public static void main(String[] args) {
        
        // .toString() = เมธอดที่สืบทอดมาจากคลาส Object
        //               ใช้สำหรับคืนค่า (Return) ข้อมูลของอ็อบเจ็กต์ในรูปแบบ String
        //               โดยค่าเริ่มต้น จะคืนค่าเป็นชื่อคลาสและ Hash Code
        //               ซึ่งใช้เป็นตัวระบุเฉพาะของอ็อบเจ็กต์
        //               สามารถ Override เพื่อให้แสดงรายละเอียดที่มีความหมายมากขึ้นได้

        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car); // Red 2025 Ford Mustang

    }
}
