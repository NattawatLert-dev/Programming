package a03collections;

import java.util.ArrayList;
import java.util.Collections;

public class A2MethodsOfArrayList {
    
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        
        // 1. add() = เพิ่มข้อมูลท้าย List
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println(fruits);

        // 2. add(index, element) = แทรกข้อมูล
        fruits.add(1, "Mango");

        // 3. get() = ดึงข้อมูล
        System.out.println(fruits.get(0));

        // 4. set() = แก้ไขข้อมูล
        fruits.set(1, "Grape");

        // 5. remove() = ลบด้วย Index
        fruits.remove(0);

        // 6. clear() = ลบทั้งหมด
        fruits.clear();

        // 7. size() = จำนวนสมาชิก
        System.out.println(fruits.size());

        // 8. isEmpty() = เช็คว่าว่างไหม
        System.out.println(fruits.isEmpty());

        // 9. contains() = ตรวจสอบว่ามีข้อมูลไหม
        fruits.contains("Apple");

        // 10. indexOf() = หา Index ตัวแรก
        fruits.indexOf("Banana");

        // 11. lastIndexOf() = กรณีข้อมูลซ้ำ
        fruits.lastIndexOf("Apple");

        // 12. equals() = เปรียบเทียบ List
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        a.add(10);
        b.add(10);
        
        System.out.println(a.equals(b));

        // 13. toArray() = แปลงเป็น Array
        String[] arr = fruits.toArray(new String[0]);

        System.out.println(arr[0]);

        // 14. forEach()
        fruits.forEach(System.out::println);

        // 15. Collections.sort()
        Collections.sort(fruits);

        // 16. Collections.reverse()
        Collections.reverse(fruits);

        // 17. Collections.shuffle() = สุ่มข้อมูล
        Collections.shuffle(fruits);

        // 18. addAll() = รวม List
        ArrayList<String> x = new ArrayList<>();
        x.add("A");
        ArrayList<String> y = new ArrayList<>();
        y.add("B");
        
        x.addAll(y);

        System.out.println(x);

    }
}
