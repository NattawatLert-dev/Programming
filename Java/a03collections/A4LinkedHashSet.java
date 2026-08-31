package a03collections;

import java.util.LinkedHashSet;

/*
 * ============================================================
 * A4LinkedHashSet
 * ============================================================
 *
 * LinkedHashSet = Set ที่มีคุณสมบัติสำคัญ 2 อย่าง
 *
 * 1. ไม่เก็บข้อมูลซ้ำ (Unique)
 * 2. จำลำดับที่เพิ่มข้อมูล (Insertion Order)
 *
 * ============================================================
 * เปรียบเทียบ Set ที่เรียนมา
 * ============================================================
 *
 * HashSet → ไม่ซ้ำ
 *         → ไม่รับประกันลำดับ
 *
 *
 * LinkedHashSet → ไม่ซ้ำ
 *               → จำลำดับการเพิ่ม
 *
 * ตัวอย่าง:
 *
 * เพิ่ม: 
 * 
 * A → B → C
 *
 * HashSet:
 *
 * อาจได้: 
 * 
 * B → A → C
 *
 * ไม่ควรพึ่งพาลำดับ
 *
 * LinkedHashSet:
 *
 * A → B → C
 *
 * จะรักษาลำดับการเพิ่ม
 *
 * ============================================================
 */

public class A4LinkedHashSet {

    public static void main(String[] args) {


        // ========================================================
        // 1. สร้าง LinkedHashSet
        // ========================================================
        //
        // รูปแบบ:
        //
        // LinkedHashSet<DataType> variable = new LinkedHashSet<>();
        //
        // ในตัวอย่างนี้เก็บ String


        LinkedHashSet<String> history = new LinkedHashSet<>();


        // ========================================================
        // 2. add()
        // ========================================================
        //
        // เพิ่มข้อมูลตามลำดับ:
        //
        // Java
        // Python
        // Java
        // C++
        //
        // Java ถูกเพิ่มซ้ำ
        // ดังนั้น Java ตัวที่ 2 จะไม่ถูกเพิ่ม


        history.add("Java");
        history.add("Python");
        history.add("Java");
        history.add("C++");


        System.out.println(history);

        /*
         * Output:
         *
         * [Java, Python, C++]
         *
         *
         * สังเกต:
         *
         * Java มีเพียงครั้งเดียว
         *
         * และลำดับยังคงเป็น:
         *
         * Java → Python → C++
         */


        // ========================================================
        // 3. LinkedHashSet ไม่เก็บข้อมูลซ้ำ
        // ========================================================


        history.add("Python");
        history.add("Java");

        System.out.println(history);

        /*
         * Output:
         *
         * [Java, Python, C++]
         *
         *
         * เพราะข้อมูลเหล่านี้มีอยู่แล้ว จึงไม่ถูกเพิ่มซ้ำ
         */


        // ========================================================
        // 4. ลำดับการเพิ่มข้อมูล
        // ========================================================
        //
        // LinkedHashSet จะจำ "Insertion Order"
        //
        // Insertion Order = ลำดับที่เราเพิ่มข้อมูลเข้าไป


        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("\nLanguages: " + languages);

        /*
         * Output:
         *
         * [Java, Python, C++, JavaScript]
         *
         * ตามลำดับที่ add()
         */


        // ========================================================
        // 5. ถ้าเพิ่มข้อมูลซ้ำ
        // ========================================================
        //
        // การเพิ่มข้อมูลที่มีอยู่แล้ว
        // จะไม่ทำให้ข้อมูลนั้นย้ายไปอยู่ท้ายสุด
        //
        // มันจะยังคงอยู่ตำแหน่งเดิม


        languages.add("Java");

        System.out.println("หลังเพิ่ม Java ซ้ำ: " + languages);

        /*
         * Output:
         *
         * [Java, Python, C++, JavaScript]
         *
         *
         * Java ไม่ได้ย้ายไปท้ายสุด
         */


        // ========================================================
        // 6. add() คืนค่า boolean
        // ========================================================
        //
        // เช่นเดียวกับ HashSet
        //
        // true → เพิ่มข้อมูลสำเร็จ
        //
        // false → ข้อมูลมีอยู่แล้ว


        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        System.out.println( numbers.add(10)); // true


        System.out.println( numbers.add(20)); // true


        System.out.println( numbers.add(10)); // false


        System.out.println(numbers); // [10, 20]


        // ========================================================
        // 7. contains()
        // ========================================================
        //
        // ตรวจสอบว่ามีข้อมูลอยู่หรือไม่


        System.out.println(numbers.contains(10)); // true


        System.out.println(numbers.contains(100)); // false


        // ========================================================
        // 8. remove()
        // ========================================================
        //
        // ลบข้อมูลโดยระบุ "ค่า"
        //
        // ไม่ใช่ Index


        numbers.remove(10);

        System.out.println(numbers); // [20]


        // ========================================================
        // 9. size()
        // ========================================================
        //
        // จำนวนสมาชิก


        System.out.println("จำนวนสมาชิก: " + numbers.size());


        // ========================================================
        // 10. isEmpty()
        // ========================================================


        System.out.println("ว่างหรือไม่: " + numbers.isEmpty());


        // ========================================================
        // 11. clear()
        // ========================================================


        numbers.clear();

        System.out.println("หลัง clear: " + numbers); // []


        // ========================================================
        // 12. ไม่มี get(index)
        // ========================================================
        //
        // LinkedHashSet เป็น Set
        //
        // ดังนั้นไม่มี:
        //
        // numbers.get(0)
        //
        // ❌ ใช้ไม่ได้
        //
        //
        // เพราะ Set ไม่ได้ออกแบบมา
        // สำหรับเข้าถึงข้อมูลด้วย Index
        //
        //
        // ถ้าต้องการ Index:
        //
        // → ใช้ ArrayList


        // ========================================================
        // 13. วนข้อมูลด้วย for-each
        // ========================================================
        //
        // วิธีที่นิยมใช้กับ Set


        LinkedHashSet<String> users = new LinkedHashSet<>();

        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("David");


        System.out.println("\nUsers:");

        for (String user : users) {
            System.out.println(user);
        }

        /*
         * Output:
         *
         * Alice
         * Bob
         * Charlie
         * David
         *
         * ตามลำดับที่เพิ่ม
         */


        // ========================================================
        // 14. forEach()
        // ========================================================


        System.out.println("\nUsing forEach:");

        users.forEach(System.out::println);


        // ========================================================
        // 15. addAll()
        // ========================================================
        //
        // ใช้รวมข้อมูลจาก Collection อีกตัว
        // ข้อมูลซ้ำจะไม่ถูกเพิ่ม


        LinkedHashSet<String> setA = new LinkedHashSet<>();

        LinkedHashSet<String> setB = new LinkedHashSet<>();

        setA.add("A");
        setA.add("B");
        setA.add("C");


        setB.add("C");
        setB.add("D");
        setB.add("E");

        setA.addAll(setB);

        System.out.println("\naddAll(): " + setA);

        /*
         * Output:
         *
         * [A, B, C, D, E]
         *
         *
         * C มีอยู่แล้ว จึงไม่ถูกเพิ่มซ้ำ
         */


        // ========================================================
        // 16. removeAll()
        // ========================================================
        //
        // ลบสมาชิกที่มีอยู่ในอีก Collection


        LinkedHashSet<Integer> removeA = new LinkedHashSet<>();

        LinkedHashSet<Integer> removeB = new LinkedHashSet<>();

        removeA.add(1);
        removeA.add(2);
        removeA.add(3);
        removeA.add(4);


        removeB.add(2);
        removeB.add(4);

        removeA.removeAll(removeB);

        System.out.println("\nremoveAll(): " + removeA); // [1, 3]


        // ========================================================
        // 17. retainAll()
        // ========================================================
        //
        // เก็บเฉพาะสมาชิกที่มีร่วมกัน


        LinkedHashSet<Integer> retainA = new LinkedHashSet<>();

        LinkedHashSet<Integer> retainB = new LinkedHashSet<>();

        retainA.add(1);
        retainA.add(2);
        retainA.add(3);
        retainA.add(4);


        retainB.add(3);
        retainB.add(4);
        retainB.add(5);

        retainA.retainAll(retainB);

        System.out.println("\nretainAll(): " + retainA); // [3, 4]


        // ========================================================
        // 18. ตัวอย่างจริง: ประวัติการเข้าชม
        // ========================================================
        //
        // สมมติว่าเราทำระบบเก็บประวัติการเปิดหน้าเว็บ
        //
        // เราต้องการ:
        //
        // 1. ไม่เก็บหน้าเว็บซ้ำ
        // 2. รักษาลำดับที่ผู้ใช้เข้าชม
        //
        // LinkedHashSet เหมาะกับแนวคิดนี้


        LinkedHashSet<String> historyWeb = new LinkedHashSet<>();


        historyWeb.add("Home");
        historyWeb.add("Profile");
        historyWeb.add("Products");
        historyWeb.add("Home");
        historyWeb.add("Contact");


        System.out.println("\nWeb History: " + historyWeb);

        /*
         * Output:
         *
         * [Home, Profile, Products, Contact]
         *
         *
         * Home ถูกเข้าชมอีกครั้ง
         * แต่ไม่ถูกเก็บซ้ำ
         */


        // ========================================================
        // 19. HashSet vs LinkedHashSet
        // ========================================================
        /*
         *
         * ========================================================
         * HashSet
         * ========================================================
         *
         * ไม่ซ้ำ
         * ไม่รับประกันลำดับ
         *
         *
         * เหมาะเมื่อ:
         *
         * "ฉันสนใจแค่ว่าข้อมูลซ้ำหรือไม่"
         *
         *
         * ========================================================
         * LinkedHashSet
         * ========================================================
         *
         * ไม่ซ้ำ
         * รักษาลำดับการเพิ่ม
         *
         *
         * เหมาะเมื่อ:
         *
         * "ฉันต้องการข้อมูลไม่ซ้ำ และต้องการรักษาลำดับที่เพิ่ม"
         *
         *
         * ========================================================
         */


        // ========================================================
        // 20. ArrayList vs HashSet vs LinkedHashSet
        // ========================================================
        /*
         *
         * --------------------------------------------------------
         *                    ArrayList   HashSet   LinkedHashSet
         * --------------------------------------------------------
         *
         * มี Index               ✓          ✗           ✗
         *
         * ข้อมูลซ้ำได้             ✓          ✗           ✗
         *
         * รักษาลำดับ              ✓          ✗           ✓
         *
         * มี get(index)          ✓          ✗           ✗
         *
         * --------------------------------------------------------
         *
         *
         * จำง่าย ๆ:
         *
         *
         * ArrayList → "ฉันสนใจลำดับ + ยอมให้ซ้ำ"
         *
         *
         * HashSet → "ฉันสนใจไม่ซ้ำ + ไม่สนลำดับ"
         *
         *
         * LinkedHashSet → "ฉันสนใจไม่ซ้ำ + สนลำดับ"
         *
         */


        // ========================================================
        // 21. Method สำคัญที่ควรรู้
        // ========================================================
        /*
         *
         * add() → เพิ่มข้อมูล
         *
         * contains() → ตรวจสอบว่ามีข้อมูลหรือไม่
         *
         * remove() → ลบข้อมูล
         *
         * size() → จำนวนสมาชิก
         *
         * isEmpty() → ตรวจสอบว่าว่างหรือไม่
         *
         * clear() → ลบทั้งหมด
         *
         * addAll() → รวมข้อมูล
         *
         * removeAll() → ลบสมาชิกที่ตรงกับอีก Collection
         *
         * retainAll() → เก็บเฉพาะสมาชิกที่มีร่วมกัน
         *
         * containsAll() → ตรวจสอบว่ามีสมาชิกครบหรือไม่
         *
         * equals() → เปรียบเทียบ Set
         *
         * forEach() → วนสมาชิกทุกตัว
         *
         */


        // ========================================================
        // 22. สิ่งที่ต้องจำที่สุด
        // ========================================================
        /*
         *
         * LinkedHashSet = HashSet + การจำลำดับการเพิ่ม
         *
         *
         * ทั้งสองตัว:
         *
         * ✓ ไม่เก็บข้อมูลซ้ำ
         * ✓ ไม่มี Index
         * ✓ ใช้ contains()
         * ✓ ใช้ remove()
         * ✓ ใช้ size()
         *
         *
         * แตกต่างกันตรง:
         *
         * HashSet → ไม่รับประกันลำดับ
         *
         * LinkedHashSet → รักษา Insertion Order
         *
         */
    }
}