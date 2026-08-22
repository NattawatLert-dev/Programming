package oop.b1abstraction;

public class Main {
    public static void main(String[] args) {
        
        // abstract = ใช้สำหรับกำหนดคลาสนามธรรม (Abstract Class)
        //            และเมธอดนามธรรม (Abstract Method)
        //            Abstraction คือกระบวนการซ่อนรายละเอียดการทำงานภายใน
        //            และแสดงเฉพาะคุณสมบัติหรือความสามารถที่จำเป็นเท่านั้น
        //            ไม่สามารถสร้างอ็อบเจ็กต์จาก Abstract Class ได้โดยตรง
        //            สามารถมีเมธอดแบบ 'abstract'
        //            (ซึ่งคลาสลูกต้องนำไป Implement)
        //            และสามารถมีเมธอดแบบ 'concrete'
        //            (ที่มีโค้ดการทำงานอยู่แล้วและคลาสลูกสามารถสืบทอดไปใช้ได้)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.Display(); // This is Shape
        circle.DisplayArea(); // 9.42

        System.out.println(triangle.area()); // 10.0
        System.out.println(rectangle.area()); // 42.0
    }
}
