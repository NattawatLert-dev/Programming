package a01basic;
public class A2DataType_Variables {
    public static void main(String[] args) {
        
        //Data Type = การกำหนดว่าตัวแปรจะเก็บข้อมูลประเภทอะไร
        //            ประกอบไปด้วย Primitive Types , Reference Type

        // Primitive Type  Vs  Reference Type
        // byte    (8 Bit)     String
        // short   (16 Bit)    Array
        // int     (32 Bit)    Object
        // long    (64 Bit)
        // float   (32 Bit)
        // double  (64 Bit)
        // char    (16 Bit) 
        // boolean (8 Bit)

        int age = 20;
        double height = 175.8;
        String name = "Nattawat";
        char grade = 'A';
        boolean isPass = true;

        System.out.println("I'm " + age); // I'm 20
        System.out.println(height); // 175.8
        System.out.println("Hello " + name); // Hello Nattawat
        System.out.println(grade); // A
        System.out.println(isPass); // true

        // Variables = พื้นที่สำหรับการเก็บข้อมูลในหน่วยความจำ

        // แบบที่ 1 ประกาศโดยกำหนดค่า
        int studentNumber = 16;
        System.out.println("Number student is " + studentNumber + "."); // NUmber student is 16.

        // แบบที่ 2 ประกาศหลายตัว
        char gradeA = 'A', gradeB = 'B', gradeC = 'C';
        System.out.println("Your grade : " + gradeA); // Your grade : A
        System.out.println("Your grade : " + gradeB); // Your grade : B
        System.out.println("Your grade : " + gradeC); // Your grade : C

        // constants = ค่าคงที่กำหนดครั้งเดียวแล้วไม่สามารถเปลี่ยนแปลงค่าได้
        
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE); // 100
    
    }
}
