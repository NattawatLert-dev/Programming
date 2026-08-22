package a03collections;

import java.util.HashSet;

public class A3HashSet {
    public static void main(String[] args) {
        
        // HashSet =  โครงสร้างข้อมูล (Data Structure) ในภาษา Java ที่ใช้เก็บข้อมูลแบบ ไม่ซ้ำกัน (Unique Elements) 
        //            และค้นหาข้อมูลได้เร็วมาก โดยภายในใช้ Hash Table ในการจัดเก็บข้อมูล

        HashSet<Integer> set = new HashSet<>();
        
        set.add(5);
        set.add(5);
        set.add(5);

        System.out.println(set); // [5]
    }
}
