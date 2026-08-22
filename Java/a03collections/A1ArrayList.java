package a03collections;

import java.util.ArrayList;

public class A1ArrayList {
    public static void main(String[] args) {
        
        // ArrayList = โครงสร้างข้อมูลที่เก็บข้อมูลแบบลำดับ (List) และสามารถขยายขนาดได้อัตโนมัติ
        //             ต้อง import java.util.ArrayList;
        //             เก็บได้เฉพาะ Object จึงใช้ Integer, Double, Character, Boolean แทน Primitive Type
        //             เหมาะเมื่อจำนวนข้อมูลไม่แน่นอนและต้องเพิ่ม/ลบบ่อย

        ArrayList<Integer> data = new ArrayList<>();

        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);

        // การเข้าถึงสมาชิก
        System.out.println(data); // [10, 20, 30, 40, 50]

    }
}
