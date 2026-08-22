package a03collections;

import java.util.HashSet;

public class A4MethodsOfHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // 1. add() = เพิ่มข้อมูลเข้า Set

        set.add(10);

        System.out.println(set);

        // 2. remove() = ลบข้อมูลออกจาก Set

        set.remove(10);

        // 3. contains() = เช็กว่ามีข้อมูลนี้ไหม

        set.contains(10);

        // 4. size() = นับจำนวนสมาชิกใน Set

        set.size();

        // 5. clear() = ลบข้อมูลทั้งหมด

        set.clear();

        // 6. isEmpty() = เช็กว่า Set ว่างไหม

        set.isEmpty();

    }

}