package a03collections;

import java.util.LinkedHashSet;

public class A5LinkedHashSet {
    public static void main(String[] args) {
        
        // LinkedHashSet = คลาสที่เก็บข้อมูลแบบ Set ซึ่งมีคุณสมบัติเด่น 2 อย่างพร้อมกัน
        //                 คือ ไม่เก็บข้อมูลซ้ำ (Unique) จำลำดับการเพิ่มข้อมูล (Insertion Order)
        //                 พูดง่าย ๆ คือ ถ้าคุณเพิ่มข้อมูลเข้าไปตามลำดับ A → B → C เวลาวนลูปก็จะได้ A → B → C เสมอ

        LinkedHashSet<String> history = new LinkedHashSet<>();
        
        history.add("Java");
        history.add("Python");
        history.add("Java");
        history.add("C++");
        
        System.out.println(history);
    }
}
