package a03collections;

import java.util.TreeSet;

public class A8MethodsOfTreeSet {
    public static void main(String[] args) {
        
    TreeSet<Integer> set = new TreeSet<>(); // เอาอันนี้ใส่ Collections.reverseOrder() ในวงเล็บจะเรียงจากมากไปน้อย
    // 1. add() = เพิ่มข้อมูลเข้า Set

    set.add(5);
    set.add(8);
    set.add(1);
    
    System.out.println(set);

    // 2. remove() = ลบข้อมูลออกจาก Set

    set.remove(8);

    // 3. contains() = เช็กว่ามีข้อมูลนี้ไหม

    System.out.println(set.contains(5));

    // 4. size() = นับจำนวนสมาชิกใน Set

    System.out.println(set.size());

    // 5. clear() = ลบข้อมูลทั้งหมด

    set.clear();

    // 6. isEmpty() = เช็กว่า Set ว่างไหม

    System.out.println(set.isEmpty());

    // 7. first() = ตัวแรก

    System.out.println(set.first());

    // 8. last() = ตัวสุดท้าย

    System.out.println(set.last());

    // 9. higher() = สมาชิกที่มากกว่าค่าที่กำหนด

    System.out.println(set.higher(5));

    // 10. lower() = สมาชิกที่น้อยกว่า

    System.out.println(set.lower(5));

    // 11. ceiling() = สมาชิกที่ มากกว่าหรือเท่ากับ

    System.out.println(set.ceiling(1));

    // 12. floor() = สมาชิกที่ น้อยกว่าหรือเท่ากับ

    System.out.println(set.floor(25));

    // 13. pollFirst() = เอาตัวแรกออก

    System.out.println(set.pollFirst());

    // 14. pollLast() = เอาตัวสุดท้ายออก

    System.out.println(set.pollLast());

    }
}
