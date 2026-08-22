package oop.a1intro;

public class Main {
    public static void main(String[] args) {
        
        // Object = วัตถุที่ใช้แทนสิ่งใดสิ่งหนึ่ง
        //          ภายในมีข้อมูลของตัวเอง (Attributes หรือ Properties)
        //          และมีความสามารถหรือพฤติกรรมของตัวเอง (Methods)
        //          Object เป็นข้อมูลชนิดอ้างอิง (Reference Data Type)
        //          ซึ่งตัวแปรจะเก็บ "ที่อยู่ในหน่วยความจำ" ของ Object
        //          ไม่ได้เก็บ Object โดยตรง

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        System.out.println();

        car.drive();
        car.brake();
    }
}
