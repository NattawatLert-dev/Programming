package a03collections;

import java.util.TreeSet;

public class A7TreeSet {
    public static void main(String[] args) {
        
        // TreeSet = Collection ที่เก็บข้อมูลแบบไม่ซ้ำ (Unique) และ เรียงลำดับข้อมูลอัตโนมัติ (Sorted) 
        //           โดยภายในใช้โครงสร้างข้อมูลแบบ Red-Black Tree (Balanced Binary Search Tree) 
        //           ทำให้ข้อมูลถูกจัดเรียงอยู่เสมอ เช่น เรียงจากน้อยไปมาก, ลำดับตัวอักษร, หรือลำดับอื่นที่ผู็ใช้กำหนด

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println(numbers);

    }
}
