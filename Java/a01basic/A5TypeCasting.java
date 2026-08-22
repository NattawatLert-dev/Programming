package a01basic;

public class A5TypeCasting {
    public static void main(String[] args) {
        
        // Type Casting = การแปลงชนิดข้อมูล (Data Type) จากชนิดหนึ่งไปเป็นอีกชนิดหนึ่ง เพื่อให้สามารถนำข้อมูลไปใช้งานได้ตามต้องการ

        // Widening Casting = Java แปลงชนิดข้อมูลให้อัตโนมัติ แปลงจากชนิดข้อมูลที่เล็ก → ใหญ่
        //                    byte → short → char → int → long → float → double

        int numInt = 10;
        double numDouble = numInt;

        System.out.println(numDouble);

        // Narrow Casting = ต้องทำเอง แปลงจากใหญ่ → เล็ก
        //                  double → float → long → int → char → short → byte

        double numDou = 10.0;
        int num = (int) numDou;

        System.out.println(num);

    }
}
