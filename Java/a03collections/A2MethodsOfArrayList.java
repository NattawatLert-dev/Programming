package a03collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ============================================================
 * A2MethodsOfArrayList
 * ============================================================
 *
 * บทนี้เรียน Method สำคัญของ ArrayList
 *
 * ArrayList = List ที่สามารถเพิ่ม/ลบขนาดได้
 *
 * Method ที่ควรรู้:
 *
 * add()
 * get()
 * set()
 * remove()
 * clear()
 * size()
 * isEmpty()
 * contains()
 * indexOf()
 * lastIndexOf()
 * equals()
 * toArray()
 * forEach()
 *
 * และ Collections:
 *
 * Collections.sort()
 * Collections.reverse()
 * Collections.shuffle()
 *
 * ============================================================
 */

public class A2MethodsOfArrayList {

    public static void main(String[] args) {

        // ========================================================
        // เตรียมข้อมูล
        // ========================================================

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("เริ่มต้น  : " + fruits);

        /*
         * Output:
         *
         * เริ่มต้น : [Apple, Banana, Orange]
         *
         *
         * Index:
         *
         * Apple   → 0
         * Banana  → 1
         * Orange  → 2
         */


        // ========================================================
        // 1. add()
        // ========================================================
        //
        // เพิ่มข้อมูล "ท้าย List"
        //
        // add(element)
        //
        // ก่อน: [Apple, Banana, Orange]
        //
        // add("Mango")
        //
        // หลัง: [Apple, Banana, Orange, Mango]


        fruits.add("Mango");

        System.out.println("1. add()       : " + fruits);


        // ========================================================
        // 2. add(index, element)
        // ========================================================
        //
        // แทรกข้อมูลตาม Index
        //
        // add(1, "Grape")
        //
        // หมายถึง: เอา "Grape" ไปแทรกที่ Index 1
        //
        // สมาชิกตัวเดิมตั้งแต่ Index 1 จะถูกเลื่อนไปทางขวา


        fruits.add(1, "Grape");

        System.out.println("2. add(index)  : " + fruits);


        // ========================================================
        // 3. get()
        // ========================================================
        //
        // อ่านข้อมูลจาก Index
        //
        // รูปแบบ: list.get(index)
        //
        //
        // คล้ายกับ Array:
        //
        // Array: arr[index]
        //
        // ArrayList: list.get(index)


        System.out.println("3. get()       : " + fruits.get(0));


        // ========================================================
        // 4. set()
        // ========================================================
        //
        // แก้ไขข้อมูลที่มีอยู่แล้ว
        //
        // set(index, newValue)
        //
        //
        // ตัวอย่าง:
        //
        // Index 1 เดิมคือ Grape
        //
        // เปลี่ยนเป็น Strawberry


        fruits.set(1, "Strawberry");

        System.out.println("4. set()       : " + fruits);


        // ========================================================
        // 5. remove(index)
        // ========================================================
        //
        // ลบข้อมูลตาม Index
        //
        // remove(0) = ลบข้อมูลที่ Index 0


        fruits.remove(0);

        System.out.println("5. remove()    : " + fruits);


        // ========================================================
        // 6. size()
        // ========================================================
        //
        // จำนวนสมาชิกใน ArrayList
        //
        // Array: arr.length
        //
        // ArrayList: list.size()


        System.out.println("6. size()      : " + fruits.size());


        // ========================================================
        // 7. isEmpty()
        // ========================================================
        //
        // ตรวจสอบว่า List ว่างหรือไม่
        //
        // ว่าง     → true
        // ไม่ว่าง → false


        System.out.println("7. isEmpty()   : " + fruits.isEmpty());


        // ========================================================
        // 8. contains()
        // ========================================================
        //
        // ตรวจสอบว่ามีข้อมูลที่ต้องการหรือไม่
        //
        // ผลลัพธ์: true / false


        System.out.println("8. contains()  : " + fruits.contains("Orange"));


        System.out.println("   contains()  : " + fruits.contains("Apple"));


        // ========================================================
        // 9. indexOf()
        // ========================================================
        //
        // หาตำแหน่งของข้อมูล
        //
        // ถ้าเจอ: → คืน Index
        //
        // ถ้าไม่เจอ: → -1
        //
        // ถ้ามีข้อมูลซ้ำ: → คืนตำแหน่ง "ตัวแรก"


        System.out.println("9. indexOf()   : " + fruits.indexOf("Orange"));


        // ========================================================
        // 10. lastIndexOf()
        // ========================================================
        //
        // หาตำแหน่ง "ตัวสุดท้าย"
        //
        // มีประโยชน์เมื่อข้อมูลซ้ำกัน


        fruits.add("Apple");
        fruits.add("Apple");

        System.out.println("ข้อมูลซ้ำ       : " + fruits);

        System.out.println("10. lastIndex  : " + fruits.lastIndexOf("Apple"));


        // ========================================================
        // 11. equals()
        // ========================================================
        //
        // เปรียบเทียบว่า List สองตัวมีข้อมูลเหมือนกันหรือไม่
        //
        // ต้องมี:
        //
        // 1. จำนวนสมาชิกเท่ากัน
        // 2. ข้อมูลตรงกัน
        // 3. ลำดับตรงกัน
        //
        // ตัวอย่าง:
        //
        // [10, 20]
        // [10, 20]
        //
        // → true
        //
        //
        // แต่:
        //
        // [10, 20]
        // [20, 10]
        //
        // → false
        //
        // เพราะลำดับไม่เหมือนกัน


        ArrayList<Integer> a = new ArrayList<>();

        ArrayList<Integer> b = new ArrayList<>();

        a.add(10);
        a.add(20);

        b.add(10);
        b.add(20);

        System.out.println("11. equals()  : " + a.equals(b));


        // ========================================================
        // 12. toArray()
        // ========================================================
        //
        // แปลง ArrayList → Array
        //
        // จาก:
        //
        // ArrayList<String>
        //
        // เป็น:
        //
        // String[]
        //
        //
        // รูปแบบที่นิยม:
        //
        // list.toArray(new String[0])


        String[] arr = fruits.toArray(new String[0]);

        System.out.println("12. toArray() : " + arr[0]);


        // ========================================================
        // 13. forEach()
        // ========================================================
        //
        // ใช้ทำงานกับสมาชิกทุกตัว
        //
        // วิธีหนึ่งคือ:
        //
        // fruits.forEach(System.out::println);
        //
        //
        // :: เรียกว่า Method Reference
        //
        // System.out::println
        //
        // หมายถึง:
        //
        // เอาแต่ละข้อมูลไปให้ System.out.println()
        //
        //
        // เทียบเท่ากับ:
        //
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }


        System.out.println("\n13. forEach():");

        fruits.forEach(System.out::println);


        // ========================================================
        // 14. Collections.sort()
        // ========================================================
        //
        // Collections เป็นคลาสที่มี Utility Method
        // สำหรับจัดการ Collection
        //
        //
        // sort() = เรียงข้อมูลจากน้อย → มาก
        //
        // String:
        // A → Z
        //
        // Number:
        // น้อย → มาก


        Collections.sort(fruits);

        System.out.println("14. sort()     : " + fruits);


        // ========================================================
        // 15. Collections.reverse()
        // ========================================================
        //
        // กลับลำดับข้อมูล
        //
        // ไม่ได้หมายความว่า "เรียงจากมากไปน้อย" เสมอไป
        //
        // มันคือการ "กลับลำดับปัจจุบัน"


        Collections.reverse(fruits);

        System.out.println("15. reverse()  : " + fruits);


        // ========================================================
        // 16. Collections.shuffle()
        // ========================================================
        //
        // สุ่มลำดับสมาชิก
        //
        // ทุกครั้งที่รัน
        // ลำดับอาจแตกต่างกัน


        Collections.shuffle(fruits);

        System.out.println("16. shuffle()  : " + fruits);


        // ========================================================
        // 17. addAll()
        // ========================================================
        //
        // รวมข้อมูลจาก List หนึ่ง
        // เข้าไปในอีก List หนึ่ง
        //
        //
        // x: [A]
        //
        // y: [B]
        //
        // x.addAll(y)
        //
        // x: [A, B]


        ArrayList<String> x = new ArrayList<>();

        ArrayList<String> y = new ArrayList<>();

        x.add("A");
        y.add("B");

        x.addAll(y);

        System.out.println("17. addAll()  : " + x);


        // ========================================================
        // 18. removeAll()
        // ========================================================
        //
        // ลบข้อมูลที่มีอยู่ในอีก List
        //
        //
        // ตัวอย่าง:
        //
        // x = [A, B, C]
        // y = [B]
        //
        // x.removeAll(y)
        //
        // ผล:
        //
        // [A, C]


        ArrayList<String> x2 = new ArrayList<>();

        ArrayList<String> y2 = new ArrayList<>();

        x2.add("A");
        x2.add("B");
        x2.add("C");

        y2.add("B");

        x2.removeAll(y2);

        System.out.println( "18. removeAll(): " + x2);


        // ========================================================
        // 19. retainAll()
        // ========================================================
        //
        // เก็บเฉพาะข้อมูลที่มีอยู่ในอีก List
        //
        //
        // x = [A, B, C]
        // y = [B, C]
        //
        // x.retainAll(y)
        //
        // ผล:
        //
        // [B, C]


        ArrayList<String> x3 = new ArrayList<>();

        ArrayList<String> y3 = new ArrayList<>();

        x3.add("A");
        x3.add("B");
        x3.add("C");

        y3.add("B");
        y3.add("C");

        x3.retainAll(y3);

        System.out.println("19. retainAll(): " + x3);


        // ========================================================
        // 20. Collections.reverseOrder()
        // ========================================================
        //
        // ถ้าต้องการเรียงจากมาก → น้อย
        //
        // สามารถใช้:
        //
        // Collections.sort(
        //     list,
        //     Collections.reverseOrder()
        // );


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);

        Collections.sort(
                numbers,
                Collections.reverseOrder()
        );

        System.out.println("20. Descending : " + numbers);


        // ========================================================
        // 21. Collections.min()
        // ========================================================
        //
        // หาค่าที่น้อยที่สุด


        System.out.println("21. min()      : " + Collections.min(numbers));


        // ========================================================
        // 22. Collections.max()
        // ========================================================
        //
        // หาค่าที่มากที่สุด


        System.out.println("22. max()      : " + Collections.max(numbers));


        // ========================================================
        // 23. Collections.frequency()
        // ========================================================
        //
        // นับว่าข้อมูลหนึ่งตัวปรากฏกี่ครั้ง


        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(10);
        scores.add(20);
        scores.add(10);
        scores.add(30);
        scores.add(10);

        System.out.println("23. frequency(): " + Collections.frequency(scores, 10));


        // ========================================================
        // 24. copy()
        // ========================================================
        //
        // Collections.copy()
        // ใช้คัดลอกข้อมูลจาก List หนึ่ง
        // ไปยังอีก List หนึ่ง
        //
        // สำคัญ: Destination ต้องมีขนาดเพียงพอ
        //
        // จึงต้องสร้าง List ปลายทาง
        // ให้มีสมาชิกก่อน


        ArrayList<String> source = new ArrayList<>();

        source.add("A");
        source.add("B");
        source.add("C");

        ArrayList<String> destination = new ArrayList<>();

        destination.add("");
        destination.add("");
        destination.add("");

        Collections.copy(
                destination,
                source
        );

        System.out.println("24. copy()     : " + destination);


        // ========================================================
        // 25. swap()
        // ========================================================
        //
        // สลับข้อมูลระหว่างสองตำแหน่ง


        ArrayList<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");

        Collections.swap(
                letters,
                0,
                2
        );

        System.out.println(
                "25. swap()     : " + letters
        );


        // ========================================================
        // 26. สรุป Method สำคัญ
        // ========================================================
        /*
         *
         * ========================================================
         * ArrayList Methods
         * ========================================================
         *
         * add() → เพิ่มข้อมูล
         *
         * add(index, value) → แทรกข้อมูล
         *
         * get() → อ่านข้อมูล
         *
         * set() → แก้ไขข้อมูล
         *
         * remove() → ลบข้อมูล
         *
         * size() → จำนวนสมาชิก
         *
         * isEmpty() → ตรวจสอบว่าว่างหรือไม่
         *
         * contains() → ตรวจสอบว่ามีข้อมูลหรือไม่
         *
         * indexOf() → หา Index ตัวแรก
         *
         * lastIndexOf() → หา Index ตัวสุดท้าย
         *
         * equals() → เปรียบเทียบ List
         *
         * toArray() → ArrayList → Array
         *
         * forEach() → ทำงานกับสมาชิกทุกตัว
         *
         * addAll() → รวม List
         *
         * removeAll() → ลบข้อมูลที่อยู่ในอีก List
         *
         * retainAll() → เก็บเฉพาะข้อมูลที่อยู่ในอีก List
         *
         * clear() → ลบข้อมูลทั้งหมด
         *
         * ========================================================
         * Collections Methods
         * ========================================================
         *
         * Collections.sort() → เรียงจากน้อย → มาก
         *
         * Collections.reverse() → กลับลำดับ
         *
         * Collections.shuffle() → สุ่มลำดับ
         *
         * Collections.min() → หาค่าน้อยที่สุด
         *
         * Collections.max() → หาค่ามากที่สุด
         *
         * Collections.frequency() → นับจำนวนข้อมูลที่ซ้ำ
         *
         * Collections.copy() → คัดลอก List
         *
         * Collections.swap() → สลับข้อมูล
         *
         * ========================================================
         */
    }
}