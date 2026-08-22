package oop.a2constructors;

public class Main {
    public static void main(String[] args) {
        
        // Constructor = เมธอดพิเศษที่ใช้สำหรับกำหนดค่าเริ่มต้นให้กับอ็อบเจ็กต์ (Object)
        //               คุณสามารถส่งอาร์กิวเมนต์ (Arguments) เข้าไปใน Constructor ได้
        //               เพื่อกำหนดค่าเริ่มต้นให้กับตัวแปรหรือสถานะของอ็อบเจ็กต์

        Student student1 = new Student("Spongbob", 25, 3.4);
        Student student2 = new Student("Patrick", 30, 2.9);

        System.out.println(student1.name); // Spongbob
        System.out.println(student1.age); // 25
        System.out.println(student1.gpa); // 3.4

        student1.Study(); // Spongbob Studying
        student1.StudentAge(); // 25 year old
        student1.StudentGpa(); // 3.4

        System.out.println(student2.name); // Patrick
        System.out.println(student2.age); // 30
        System.out.println(student2.gpa); // 2.9

        student2.Study(); // Patrick Studying
        student2.StudentAge(); // 30 year old
        student2.StudentGpa(); // 2.9
        
    }
}
