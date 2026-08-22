package oop.b3polymorphism;

public class Main {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" หมายถึง "หลาย (Many)"
        //                "MORPH" หมายถึง "รูปแบบ (Shape/Form)"
        //                อ็อบเจ็กต์สามารถถูกมองว่าเป็นอ็อบเจ็กต์ชนิดอื่นได้
        //                โดยเฉพาะชนิดของคลาสแม่ (Superclass) หรือ Interface ที่มันสืบทอดหรือ Implement
        //                ทำให้อ็อบเจ็กต์หลายชนิดสามารถถูกใช้งานผ่านชนิดข้อมูลเดียวกันได้
    
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicle = {car, bike, boat};

        for(Vehicle list : vehicle){
            list.go();
        }

        car.go();
        bike.go();
        boat.go();
    
    }
}
