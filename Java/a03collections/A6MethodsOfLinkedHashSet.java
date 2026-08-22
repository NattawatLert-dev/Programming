package a03collections;

import java.util.LinkedHashSet;

public class A6MethodsOfLinkedHashSet {
    public static void main(String[] args) {
        
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // 1. add() = เพิ่มข้อมูลเข้า Set

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

        // 2. remove() = ลบข้อมูลออกจาก Set

        fruits.remove("Apple");

        // 3. contains() = เช็กว่ามีข้อมูลนี้ไหม

        fruits.contains("Apple");

        // 4. size() = นับจำนวนสมาชิกใน Set

        fruits.size();

        // 5. clear() = ลบข้อมูลทั้งหมด

        fruits.clear();

        // 6. isEmpty() = เช็กว่า Set ว่างไหม

        fruits.isEmpty();

    }
}
