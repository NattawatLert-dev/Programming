package oop.b5settergetter;

public class Main {
    public static void main(String[] args) {
        
        // ช่วยปกป้องข้อมูลของอ็อบเจ็กต์ (Object) และเพิ่มกฎในการเข้าถึงหรือแก้ไขข้อมูล
        // GETTERS = เมธอดที่ทำให้สามารถ "อ่าน" (Read) ค่าของฟิลด์ (Field) ได้
        // SETTERS = เมธอดที่ทำให้สามารถ "เขียน" หรือ "แก้ไข" (Write) ค่าของฟิลด์ (Field) ได้
        
        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Red");
        car.setPrice(13422);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice()); // Red Charger 13422

    }
}
