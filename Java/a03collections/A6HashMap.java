package a03collections;

import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * A9HashMap
 * ============================================================
 *
 * HashMap
 * = Collection ที่เก็บข้อมูลในรูปแบบ
 *
 *          Key → Value
 *
 *
 * ตัวอย่าง:
 *
 * "Apple"  → 50
 * "Banana" → 20
 * "Orange" → 30
 *
 *
 * Key = สิ่งที่ใช้ระบุข้อมูล
 * Value = ข้อมูลที่ต้องการเก็บ
 *
 *
 * ============================================================
 * จุดสำคัญของ HashMap
 * ============================================================
 *
 * 1. เก็บข้อมูลเป็น Key → Value
 *
 * 2. Key ห้ามซ้ำ
 *
 * 3. Value ซ้ำกันได้
 *
 * 4. ไม่รับประกันลำดับของข้อมูล
 *
 * 5. เข้าถึงข้อมูลผ่าน Key
 *
 * 6. Key และ Value ต้องเป็น Object
 *    จึงใช้ Wrapper Class เช่น
 *
 *    Integer
 *    Double
 *    Character
 *    Boolean
 *
 *    แทน Primitive Type
 *
 * ============================================================
 */

public class A6HashMap {

    public static void main(String[] args) {


        // ========================================================
        // 1. สร้าง HashMap
        // ========================================================
        //
        // รูปแบบ:
        //
        // HashMap<KeyType, ValueType> variable =
        //         new HashMap<>();
        //
        //
        // ตัวอย่างนี้:
        //
        // Key   = String
        // Value = Integer


        HashMap<String, Integer> map =
                new HashMap<>();


        // ========================================================
        // 2. put()
        // ========================================================
        //
        // ใช้เพิ่มข้อมูล
        //
        // รูปแบบ:
        //
        // map.put(key, value);


        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);


        System.out.println(map);

        /*
         * Output อาจเป็น:
         *
         * {Apple=50, Orange=30, Banana=20}
         *
         * หรือมีลำดับแตกต่างกัน
         *
         * เพราะ HashMap ไม่รับประกันลำดับ
         */


        // ========================================================
        // 3. get()
        // ========================================================
        //
        // ใช้ค้นหา Value โดยใช้ Key


        System.out.println(
                map.get("Banana")
        );

        // 20


        // ========================================================
        // 4. Key ที่ไม่มีอยู่
        // ========================================================
        //
        // ถ้าค้นหา Key ที่ไม่มี
        // get() จะคืนค่า null


        System.out.println(
                map.get("Mango")
        );

        // null


        // ========================================================
        // 5. Key ห้ามซ้ำ
        // ========================================================
        //
        // ถ้า put() ด้วย Key เดิม
        // Value เดิมจะถูกแทนที่


        map.put("Apple", 100);


        System.out.println(
                map.get("Apple")
        );

        // 100


        /*
         * เดิม:
         *
         * Apple → 50
         *
         *
         * put("Apple", 100)
         *
         * กลายเป็น:
         *
         * Apple → 100
         *
         *
         * ไม่ได้สร้าง Apple ตัวที่สอง
         */


        // ========================================================
        // 6. Value สามารถซ้ำกันได้
        // ========================================================
        //
        // Key ต้องไม่ซ้ำ
        // แต่ Value ซ้ำได้


        map.put("Mango", 100);


        System.out.println(map);

        /*
         * ตอนนี้:
         *
         * Apple → 100
         * Mango → 100
         *
         * Value 100 ซ้ำได้
         */


        // ========================================================
        // 7. containsKey()
        // ========================================================
        //
        // ตรวจสอบว่ามี Key หรือไม่


        System.out.println(
                map.containsKey("Apple")
        );

        // true


        System.out.println(
                map.containsKey("Watermelon")
        );

        // false


        // ========================================================
        // 8. containsValue()
        // ========================================================
        //
        // ตรวจสอบว่ามี Value หรือไม่


        System.out.println(
                map.containsValue(100)
        );

        // true


        System.out.println(
                map.containsValue(999)
        );

        // false


        // ========================================================
        // 9. remove()
        // ========================================================
        //
        // ลบข้อมูลโดยใช้ Key


        map.remove("Mango");


        System.out.println(
                map
        );


        // ========================================================
        // 10. size()
        // ========================================================
        //
        // จำนวนคู่ Key → Value


        System.out.println(
                "จำนวนข้อมูล: "
                + map.size()
        );


        // ========================================================
        // 11. isEmpty()
        // ========================================================
        //
        // ตรวจสอบว่า Map ว่างหรือไม่


        System.out.println(
                "ว่างหรือไม่: "
                + map.isEmpty()
        );


        // ========================================================
        // 12. replace()
        // ========================================================
        //
        // เปลี่ยน Value ของ Key ที่มีอยู่


        map.replace("Banana", 999);


        System.out.println(
                map.get("Banana")
        );

        // 999


        // ========================================================
        // 13. put() กับ replace() ต่างกันอย่างไร?
        // ========================================================
        //
        // put()
        // → ถ้าไม่มี Key → เพิ่ม
        // → ถ้ามี Key → เปลี่ยน Value
        //
        //
        // replace()
        // → เปลี่ยนเฉพาะ Key ที่มีอยู่แล้ว
        //
        //
        // ตัวอย่าง:


        map.put("Grape", 70);

        // เพิ่ม Grape


        map.replace("Grape", 80);

        // เปลี่ยน Grape จาก 70 → 80


        // ========================================================
        // 14. getOrDefault()
        // ========================================================
        //
        // ถ้าเจอ Key
        // → คืน Value
        //
        // ถ้าไม่เจอ
        // → คืนค่าที่เรากำหนด


        int price =
                map.getOrDefault(
                        "Mango",
                        0
                );


        System.out.println(
                "Mango price = "
                + price
        );

        // 0


        // ========================================================
        // 15. putIfAbsent()
        // ========================================================
        //
        // เพิ่มข้อมูลเฉพาะเมื่อ Key ยังไม่มี
        //
        // ถ้ามีแล้วจะไม่เปลี่ยน Value


        map.putIfAbsent("Apple", 500);


        System.out.println(
                map.get("Apple")
        );

        /*
         * Apple มีอยู่แล้ว
         *
         * ดังนั้น 500 จะไม่ถูกใช้
         *
         * Value ยังคงเป็น 100
         */


        // ========================================================
        // 16. remove(key, value)
        // ========================================================
        //
        // ลบเมื่อ Key และ Value ตรงกันทั้งคู่


        map.remove("Apple", 999);

        // ไม่ลบ เพราะ Value ไม่ใช่ 999


        map.remove("Apple", 100);

        // ลบ เพราะตรงกัน


        // ========================================================
        // 17. keySet()
        // ========================================================
        //
        // ดึง Key ทั้งหมดออกมา


        System.out.println(
                "\nKeys:"
        );

        for (String key : map.keySet()) {

            System.out.println(key);
        }


        // ========================================================
        // 18. values()
        // ========================================================
        //
        // ดึง Value ทั้งหมด


        System.out.println(
                "\nValues:"
        );

        for (Integer value : map.values()) {

            System.out.println(value);
        }


        // ========================================================
        // 19. entrySet()
        // ========================================================
        //
        // ถ้าต้องการทั้ง Key และ Value
        // วิธีที่นิยมคือ entrySet()


        System.out.println(
                "\nKey → Value:"
        );

        for (Map.Entry<String, Integer> entry
                : map.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " → "
                    + entry.getValue()
            );
        }


        // ========================================================
        // 20. getKey() และ getValue()
        // ========================================================
        //
        // Entry แต่ละตัวมี:
        //
        // getKey()
        // → เอา Key
        //
        // getValue()
        // → เอา Value


        for (Map.Entry<String, Integer> entry
                : map.entrySet()) {

            String key =
                    entry.getKey();

            Integer value =
                    entry.getValue();

            System.out.println(
                    "สินค้า = "
                    + key
                    + ", ราคา = "
                    + value
            );
        }


        // ========================================================
        // 21. forEach()
        // ========================================================
        //
        // สามารถใช้ Lambda Expression
        // เพื่อวน HashMap ได้


        map.forEach(
                (key, value) ->
                        System.out.println(
                                key + " = " + value
                        )
        );


        // ========================================================
        // 22. clear()
        // ========================================================
        //
        // ลบข้อมูลทั้งหมด


        HashMap<String, Integer> temp =
                new HashMap<>();

        temp.put("A", 10);
        temp.put("B", 20);
        temp.put("C", 30);


        System.out.println(
                "\nก่อน clear: "
                + temp
        );


        temp.clear();


        System.out.println(
                "หลัง clear: "
                + temp
        );

        // []


        // ========================================================
        // 23. HashMap สามารถใช้ Object เป็น Value
        // ========================================================
        //
        // Value ไม่จำเป็นต้องเป็น Integer
        //
        // สามารถเป็น String, List หรือ Object
        // ได้


        HashMap<String, String> countries =
                new HashMap<>();


        countries.put(
                "TH",
                "Thailand"
        );

        countries.put(
                "JP",
                "Japan"
        );

        countries.put(
                "US",
                "United States"
        );


        System.out.println(
                "\nCountry:"
                + countries
        );


        // ========================================================
        // 24. HashMap กับ String เป็น Key
        // ========================================================
        //
        // เป็นรูปแบบที่พบได้บ่อยมาก
        //
        // เช่น:
        //
        // username → password
        // productId → productName
        // countryCode → countryName
        // studentId → studentName


        HashMap<Integer, String> students =
                new HashMap<>();


        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");


        System.out.println(
                "\nStudent 102: "
                + students.get(102)
        );

        // Bob


        // ========================================================
        // 25. ตัวอย่างจริง: เก็บราคาสินค้า
        // ========================================================


        HashMap<String, Double> products =
                new HashMap<>();


        products.put("Laptop", 25000.0);
        products.put("Mouse", 500.0);
        products.put("Keyboard", 1200.0);


        String productName = "Laptop";


        if (products.containsKey(productName)) {

            double productPrice =
                    products.get(productName);

            System.out.println(
                    "\n"
                    + productName
                    + " ราคา "
                    + productPrice
                    + " บาท"
            );

        } else {

            System.out.println(
                    "ไม่พบสินค้า"
            );
        }


        // ========================================================
        // 26. ตัวอย่างจริง: นับจำนวนคำ
        // ========================================================
        //
        // HashMap เหมาะมากกับงาน
        // "นับจำนวน"
        //
        // เช่น:
        //
        // Apple Apple Banana
        //
        // จะได้:
        //
        // Apple  → 2
        // Banana → 1


        String[] fruits = {
                "Apple",
                "Banana",
                "Apple",
                "Orange",
                "Banana",
                "Apple"
        };


        HashMap<String, Integer> count =
                new HashMap<>();


        for (String fruit : fruits) {

            count.put(
                    fruit,
                    count.getOrDefault(
                            fruit,
                            0
                    ) + 1
            );
        }


        System.out.println(
                "\nจำนวนผลไม้:"
        );

        System.out.println(count);

        /*
         * Output:
         *
         * Apple  = 3
         * Banana = 2
         * Orange = 1
         *
         * ลำดับอาจแตกต่างกัน
         * เพราะ HashMap ไม่รับประกันลำดับ
         */


        // ========================================================
        // 27. null
        // ========================================================
        //
        // HashMap อนุญาตให้มี Key เป็น null
        // ได้หนึ่งตัว
        //
        // และสามารถมี Value เป็น null ได้


        HashMap<String, Integer> nullExample =
                new HashMap<>();


        nullExample.put(null, 100);
        nullExample.put("A", null);


        System.out.println(
                "\nNull Example:"
                + nullExample
        );


        // ========================================================
        // 28. HashMap ไม่ได้มี Index
        // ========================================================
        //
        // ArrayList:
        //
        // list.get(0)
        //
        //
        // HashMap:
        //
        // map.get(key)
        //
        //
        // เพราะ HashMap ใช้ Key
        // ไม่ใช่ Index


        // ========================================================
        // 29. HashMap กับ ArrayList ต่างกันอย่างไร?
        // ========================================================
        /*
         *
         * ArrayList
         * --------------------------
         *
         * เก็บข้อมูลเป็นลำดับ
         *
         * [Apple, Banana, Orange]
         *
         * เข้าถึงด้วย Index
         *
         * list.get(0)
         *
         *
         * HashMap
         * --------------------------
         *
         * เก็บข้อมูลแบบ Key → Value
         *
         * Apple → 50
         * Banana → 20
         *
         * เข้าถึงด้วย Key
         *
         * map.get("Banana")
         *
         */


        // ========================================================
        // 30. HashMap กับ HashSet ต่างกันอย่างไร?
        // ========================================================
        /*
         *
         * HashSet
         *
         * เก็บ:
         *
         * Apple
         * Banana
         * Orange
         *
         * จุดเด่น:
         * → ไม่ซ้ำ
         *
         *
         * HashMap
         *
         * เก็บ:
         *
         * Apple  → 50
         * Banana → 20
         * Orange → 30
         *
         * จุดเด่น:
         * → Key → Value
         * → Key ไม่ซ้ำ
         *
         */


        // ========================================================
        // 31. ความเร็วโดยทั่วไป
        // ========================================================
        /*
         *
         * HashMap ใช้ Hash Table
         *
         * โดยทั่วไป:
         *
         * put()      → O(1) โดยเฉลี่ย
         * get()      → O(1) โดยเฉลี่ย
         * remove()   → O(1) โดยเฉลี่ย
         * containsKey() → O(1) โดยเฉลี่ย
         *
         *
         * แต่ไม่ได้หมายความว่า O(1) เสมอไป
         *
         * ประสิทธิภาพจริงขึ้นอยู่กับ:
         *
         * - hashCode()
         * - equals()
         * - การชนกันของ Hash (Collision)
         * - จำนวนข้อมูล
         *
         */


        // ========================================================
        // 32. hashCode() และ equals()
        // ========================================================
        /*
         *
         * HashMap ใช้ hashCode() และ equals()
         * เพื่อจัดการ Key
         *
         *
         * แนวคิดง่าย ๆ:
         *
         * Key
         *   ↓
         * hashCode()
         *   ↓
         * หาตำแหน่งใน Hash Table
         *   ↓
         * equals()
         *   ↓
         * ตรวจว่าเป็น Key เดียวกันจริงหรือไม่
         *
         *
         * ดังนั้นถ้าเราสร้าง Class ของตัวเอง
         * แล้วนำ Object มาใช้เป็น Key
         * ต้องเข้าใจเรื่อง
         *
         * hashCode()
         * และ
         * equals()
         *
         * อย่างถูกต้อง
         *
         */


        // ========================================================
        // 33. เรื่องสำคัญ: HashMap ไม่รับประกันลำดับ
        // ========================================================
        /*
         *
         * อย่าคาดหวังว่า:
         *
         * map.put("A", 1);
         * map.put("B", 2);
         * map.put("C", 3);
         *
         * แล้วจะได้:
         *
         * {A=1, B=2, C=3}
         *
         * เสมอ
         *
         *
         * ถ้าต้องการ "จำลำดับที่เพิ่ม"
         * ใช้:
         *
         * LinkedHashMap
         *
         *
         * ถ้าต้องการ "เรียงตาม Key"
         * ใช้:
         *
         * TreeMap
         *
         */


        // ========================================================
        // 34. เปรียบเทียบ Map
        // ========================================================
        /*
         *
         * HashMap
         * → Key → Value
         * → ไม่รับประกันลำดับ
         * → เร็วโดยเฉลี่ย
         *
         *
         * LinkedHashMap
         * → Key → Value
         * → รักษาลำดับที่เพิ่ม
         *
         *
         * TreeMap
         * → Key → Value
         * → เรียง Key
         *
         *
         * จำง่าย:
         *
         * HashMap
         *       ↓
         * Key → Value
         * ไม่สนลำดับ
         *
         *
         * LinkedHashMap
         *       ↓
         * Key → Value
         * จำลำดับ
         *
         *
         * TreeMap
         *       ↓
         * Key → Value
         * เรียงลำดับ
         *
         */


        // ========================================================
        // 35. Method ที่ควรจำ
        // ========================================================
        /*
         *
         * put(key, value)
         * → เพิ่ม / แก้ไขข้อมูล
         *
         * get(key)
         * → ดึง Value
         *
         * remove(key)
         * → ลบข้อมูล
         *
         * containsKey(key)
         * → ตรวจสอบ Key
         *
         * containsValue(value)
         * → ตรวจสอบ Value
         *
         * size()
         * → จำนวนข้อมูล
         *
         * isEmpty()
         * → ตรวจสอบว่าว่าง
         *
         * clear()
         * → ลบทั้งหมด
         *
         * replace(key, value)
         * → เปลี่ยน Value
         *
         * getOrDefault(key, defaultValue)
         * → ถ้าไม่มี Key ให้ค่า Default
         *
         * putIfAbsent(key, value)
         * → เพิ่มเมื่อ Key ยังไม่มี
         *
         * keySet()
         * → เอา Key ทั้งหมด
         *
         * values()
         * → เอา Value ทั้งหมด
         *
         * entrySet()
         * → เอา Key + Value
         *
         */


        // ========================================================
        // 36. สรุป
        // ========================================================
        /*
         *
         * HashMap
         *
         * = โครงสร้างข้อมูลแบบ
         *
         *        Key → Value
         *
         *
         * ตัวอย่าง:
         *
         * Student ID → Student Name
         *
         * 101 → Alice
         * 102 → Bob
         *
         *
         * สิ่งที่ต้องจำ:
         *
         * ✓ Key ห้ามซ้ำ
         * ✓ Value ซ้ำได้
         * ✓ ไม่มี Index
         * ✓ ใช้ get(key) เพื่อค้นหา
         * ✓ put() ใช้เพิ่มหรือแก้ไข
         * ✓ remove() ใช้ลบ
         * ✓ ไม่รับประกันลำดับ
         * ✓ โดยทั่วไป get/put เร็วประมาณ O(1)
         *
         *
         * ถ้าโจทย์ถามว่า:
         *
         * "ต้องการจับคู่ข้อมูล"
         *
         * เช่น
         *
         * รหัสนักเรียน → ชื่อนักเรียน
         * สินค้า → ราคา
         * ประเทศ → เมืองหลวง
         *
         * ให้คิดถึง HashMap
         *
         * ========================================================
         */
    }
}
