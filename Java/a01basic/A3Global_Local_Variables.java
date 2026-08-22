package a01basic;
public class A3Global_Local_Variables {

    static int a = 20;   // Global Variable 

    public static void main(String[] args) {
        
        // Global Variable (ตัวแปรระดับ Global) = ตัวแปรที่ประกาศ อยู่นอก Method หรือ Function ทั้งหมด
        //                                      สามารถใช้งานได้จากทุก Method ภายใน Class (ถ้าเป็น static)

        // Local Variable (ตัวแปรภายใน) = ตัวแปรที่ประกาศ ภายใน Method หรือ Block {} ใช้งานได้เฉพาะในบริเวณที่ประกาศเท่านั้น

        int b = 20; // Local

        System.out.println(a);
        System.out.println(b);

    }

    public static void show() {

        System.out.println(a); // ได้
        // System.out.println(b); // ไม่ได้
    }
    
}
