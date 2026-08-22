package a03collections;

import java.util.HashMap;

public class B1MethodsOfHashMap {
    public static void main(String[] args) {

        HashMap<String,Integer> fruit = new HashMap<>();
        
        // 1. put() = ใช้เพิ่มข้อมูล

        fruit.put("Apple",50);
        fruit.put("Banana",30);
        fruit.put("Orange",40);

        // 2. get() = ดึงข้อมูล

        System.out.println(fruit.get("Apple")); // 50

        // 3. containsKey() = เช็คว่ามี Key ไหม

        fruit.containsKey("Apple"); // true

        // 4. containsValue() = เช็คว่ามี Value หรือไม่

        fruit.containsValue(50); // true

        // 5. replace() = เปลี่ยน Value

        fruit.replace("Apple",80);

        // 6. remove() = ลบข้อมูล

        fruit.remove("Banana");

        // 7. size() = นับจำนวนข้อมูล

        System.out.println(fruit.size());

        // 8. clear() = ลบทั้งหมด

        fruit.clear();

        // 9. isEmpty() = เช็คว่าว่างหรือไม่

        fruit.isEmpty();

    }
}
