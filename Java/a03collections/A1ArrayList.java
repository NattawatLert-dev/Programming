package a03collections;

import java.util.ArrayList;

/*
 * ============================================================
 * A1ArrayList
 * ============================================================
 *
 * ArrayList = โครงสร้างข้อมูล (Data Structure) ที่ใช้เก็บข้อมูลแบบลำดับ (List)
 *
 * จุดเด่น:
 *
 * 1. ขนาดสามารถเพิ่ม/ลดได้
 * 2. เข้าถึงข้อมูลด้วย Index ได้
 * 3. เก็บข้อมูลตามลำดับที่เพิ่มเข้าไป
 * 4. มี Method สำหรับจัดการข้อมูลจำนวนมาก
 *
 *
 * Array vs ArrayList
 * ------------------------------------------------------------
 *
 * Array: int[] numbers = new int[5];
 *
 * ขนาดถูกกำหนดตั้งแต่สร้าง
 * และไม่สามารถเปลี่ยนขนาดของ Array เดิมได้
 *
 *
 * ArrayList: ArrayList<Integer> numbers = new ArrayList<>();
 *
 * สามารถเพิ่ม/ลบสมาชิกได้
 * ขนาดจะปรับตามจำนวนข้อมูล
 *
 * ============================================================
 */

public class A1ArrayList {

    public static void main(String[] args) {


        // ========================================================
        // 1. สร้าง ArrayList
        // ========================================================
        //
        // ต้อง import:
        //
        // import java.util.ArrayList;
        //
        //
        // รูปแบบ:
        //
        // ArrayList<DataType> variable = new ArrayList<>();
        //
        //
        // ตัวอย่าง:
        //
        // ArrayList<Integer> data = new ArrayList<>();
        //
        // Integer คือชนิดข้อมูลที่ ArrayList จะเก็บ


        ArrayList<Integer> data = new ArrayList<>();


        // ========================================================
        // 2. เพิ่มข้อมูลด้วย add()
        // ========================================================
        //
        // add() = เพิ่มข้อมูลเข้าไปใน ArrayList
        //
        //
        // ข้อมูลจะถูกเพิ่มต่อท้าย
        //
        // เริ่มต้น:
        //
        // []
        //
        // add(10)
        // [10]
        //
        // add(20)
        // [10, 20]
        //
        // add(30)
        // [10, 20, 30]


        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);

        System.out.println(data); // [10, 20, 30, 40, 50]


        // ========================================================
        // 3. Index ของ ArrayList
        // ========================================================
        //
        // ArrayList ใช้ Index เหมือน Array
        //
        // data:
        //
        // [10, 20, 30, 40, 50]
        //
        //  0   1   2   3   4
        //
        // Index เริ่มต้นที่ 0


        System.out.println(data.get(0)); // 10

        System.out.println(data.get(2)); // 30

        System.out.println(data.get(4)); // 50


        // ========================================================
        // 4. get()
        // ========================================================
        //
        // ใช้สำหรับ "อ่าน" ข้อมูลตาม Index
        //
        // Array:
        //
        // data[2]
        //
        // ArrayList:
        //
        // data.get(2)
        //
        // จำให้ดี:
        //
        // Array     → []
        // ArrayList → get()


        int value = data.get(1);

        System.out.println(value); // 20


        // ========================================================
        // 5. size()
        // ========================================================
        //
        // ใช้หาจำนวนสมาชิกใน ArrayList
        //
        // Array: array.length
        //
        // ArrayList: arrayList.size()


        System.out.println(data.size()); // 5


        // ========================================================
        // 6. set()
        // ========================================================
        //
        // ใช้เปลี่ยนค่าที่ Index ที่กำหนด
        //
        // set(index, value)
        //
        // ก่อน:
        //
        // [10, 20, 30, 40, 50]
        //
        // set(1, 200)
        //
        // หลัง:
        //
        // [10, 200, 30, 40, 50]


        data.set(1, 200);

        System.out.println(data); // [10, 200, 30, 40, 50]


        // ========================================================
        // 7. add(index, value)
        // ========================================================
        //
        // นอกจาก add(value)
        //
        // ยังสามารถกำหนดตำแหน่งที่ต้องการเพิ่มได้
        //
        // add(index, value)
        //
        // สำคัญ:
        //
        // การเพิ่มแบบนี้จะ "แทรก" และสมาชิกที่อยู่หลังจากนั้น
        // จะถูกเลื่อนไปด้านขวา


        data.add(1, 15);

        System.out.println(data); // [10, 15, 200, 30, 40, 50]


        // ========================================================
        // 8. remove(index)
        // ========================================================
        //
        // ลบข้อมูลตาม Index
        //
        // remove(index)
        //
        // ตัวอย่าง:
        //
        // remove(1)
        //
        // จะลบข้อมูลที่ Index 1


        data.remove(1);

        System.out.println(data); // [10, 200, 30, 40, 50]


        // ========================================================
        // 9. remove(Object)
        // ========================================================
        //
        // สามารถลบโดยระบุ "ค่า" ได้
        //
        // สำหรับ ArrayList<Integer>
        //
        // ต้องระวังเรื่อง remove()
        //
        //
        // remove(30)
        //
        // Java อาจตีความเป็น
        //
        // remove(int index)
        //
        // เพราะ 30 เป็น int
        //
        //
        // ถ้าต้องการลบ "ค่า 30"
        // ให้ใช้ Integer.valueOf(30)


        data.remove(Integer.valueOf(30));

        System.out.println(data); // [10, 200, 40, 50]


        // ========================================================
        // 10. contains()
        // ========================================================
        //
        // ตรวจสอบว่ามีข้อมูลที่ต้องการหรือไม่
        //
        // ผลลัพธ์: true / false


        System.out.println(data.contains(200)); // true


        System.out.println(data.contains(999)); // false


        // ========================================================
        // 11. indexOf()
        // ========================================================
        //
        // หาตำแหน่งของข้อมูล
        //
        // ถ้าเจอ: → คืน Index
        //
        // ถ้าไม่เจอ: → -1


        System.out.println(data.indexOf(200)); // 1


        System.out.println(data.indexOf(999)); // -1


        // ========================================================
        // 12. isEmpty()
        // ========================================================
        //
        // ตรวจสอบว่า ArrayList ว่างหรือไม่
        //
        // ว่าง: → true
        //
        // ไม่ว่าง: → false


        System.out.println(data.isEmpty()); // false


        // ========================================================
        // 13. clear()
        // ========================================================
        //
        // ลบข้อมูลทั้งหมดใน ArrayList
        //
        // ก่อน: [10, 200, 40, 50]
        //
        //
        // clear()
        //
        // หลัง:
        //
        // []


        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(10);
        temp.add(20);
        temp.add(30);

        System.out.println(temp); // [10, 20, 30]

        temp.clear();

        System.out.println(temp); // []


        // ========================================================
        // 14. Loop กับ ArrayList
        // ========================================================
        //
        // สามารถใช้ for loop ได้เหมือน Array
        //
        //
        // แต่ต้องใช้ size()
        // และ get()
        //
        //
        // Array:
        //
        // for (int i = 0; i < arr.length; i++)
        //
        //
        // ArrayList:
        //
        // for (int i = 0; i < data.size(); i++)
        //     System.out.println(data.get(i));


        for (int i = 0; i < data.size(); i++) {

            System.out.println(data.get(i));
        }


        // ========================================================
        // 15. for-each กับ ArrayList
        // ========================================================
        //
        // สามารถใช้ for-each ได้เช่นกัน
        //
        // รูปแบบ:
        //
        // for (DataType item : list)


        for (int item : data) {
            System.out.println(item);
        }


        // ========================================================
        // 16. ArrayList<String>
        // ========================================================
        //
        // ArrayList ไม่ได้เก็บเฉพาะ Integer
        //
        // สามารถเก็บ String ได้


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits); // [Apple, Banana, Orange]


        System.out.println(fruits.get(1)); // Banana


        // ========================================================
        // 17. ArrayList กับ Primitive Type
        // ========================================================
        //
        // ArrayList ต้องเก็บ Object
        //
        // จึงไม่สามารถเขียน: ArrayList<int>
        //
        // ❌ ผิด
        //
        // ต้องใช้ Wrapper Class:
        //
        // int      → Integer
        // double   → Double
        // char     → Character
        // boolean  → Boolean
        // long     → Long
        // float    → Float
        // short    → Short
        // byte     → Byte
        //
        // ตัวอย่าง:


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);

        // Java จัดการ Auto-boxing ให้
        //
        // int
        // ↓
        // Integer
        //
        // เราจึงสามารถเขียน
        //
        // numbers.add(10);
        //
        // ได้เลย


        // ========================================================
        // 18. ArrayList กับ Array ต่างกันอย่างไร?
        // ========================================================
        /*
         *
         * ========================================================
         * Array
         * ========================================================
         *
         * int[] numbers = new int[5];
         *
         * - ขนาดคงที่
         * - ใช้ length
         * - เข้าถึงด้วย []
         * - เหมาะเมื่อรู้จำนวนสมาชิกแน่นอน
         *
         *
         * ========================================================
         * ArrayList
         * ========================================================
         *
         * ArrayList<Integer> numbers =
         *         new ArrayList<>();
         *
         * - ขนาดปรับได้
         * - ใช้ size()
         * - เข้าถึงด้วย get()
         * - มี Method ช่วยจัดการข้อมูล
         * - เหมาะเมื่อจำนวนข้อมูลเปลี่ยนแปลง
         *
         *
         * ========================================================
         */


        // ========================================================
        // 19. ArrayList ไม่สามารถเก็บ Primitive โดยตรง
        // ========================================================
        /*
         *
         * Primitive:
         *
         * int
         * double
         * char
         * boolean
         *
         *
         * Wrapper:
         *
         * Integer
         * Double
         * Character
         * Boolean
         *
         *
         * ArrayList ต้องใช้ Wrapper
         *
         *
         * ArrayList<Integer>
         * ArrayList<Double>
         * ArrayList<Character>
         * ArrayList<Boolean>
         *
         */


        // ========================================================
        // 20. Autoboxing และ Unboxing
        // ========================================================
        //
        // Java สามารถแปลง Primitive และ Wrapper ให้โดยอัตโนมัติ
        //
        // Autoboxing:
        //
        // int → Integer
        //
        // Unboxing: Integer → int


        int primitive = 10;

        Integer object = primitive;
        // Autoboxing

        Integer objectNumber = 20;

        int primitiveNumber = objectNumber;
        // Unboxing


        System.out.println(object);
        System.out.println(primitiveNumber);


        // ========================================================
        // 21. remove() กับ Integer ที่ควรรู้
        // ========================================================
        //
        // จุดนี้สำคัญมาก
        //
        //
        // สมมติ: ArrayList<Integer> list
        //
        // list: [10, 20, 30]
        //
        // ถ้าเขียน:
        //
        // list.remove(1);
        //
        // Java จะมองว่า:
        //
        // remove(index)
        //
        // ดังนั้นจะลบ 20
        //
        //
        // ถ้าต้องการลบ "ค่า 1"
        //
        // ใช้:
        //
        // list.remove(Integer.valueOf(1));


        // ========================================================
        // 22. ArrayList สามารถมีข้อมูลซ้ำได้
        // ========================================================
        //
        // ArrayList อนุญาตให้ข้อมูลซ้ำกันได้


        ArrayList<Integer> duplicate = new ArrayList<>();

        duplicate.add(10);
        duplicate.add(20);
        duplicate.add(10);
        duplicate.add(10);

        System.out.println(duplicate); // [10, 20, 10, 10]


        // ========================================================
        // 23. ArrayList สามารถมี null ได้
        // ========================================================
        //
        // ArrayList สามารถเก็บ null ได้


        ArrayList<String> names = new ArrayList<>();

        names.add("Tle");
        names.add(null);
        names.add("Java");

        System.out.println(names); // [Tle, null, Java]


        // ========================================================
        // 24. สรุปสิ่งที่ต้องจำ
        // ========================================================
        /*
         *
         * 1. ArrayList เก็บข้อมูลแบบ List
         *
         * 2. ขนาดสามารถเพิ่ม/ลดได้
         *
         * 3. Index เริ่มจาก 0
         *
         * 4. ArrayList ใช้ size()
         *
         * 5. อ่านข้อมูลใช้ get()
         *
         * 6. เพิ่มข้อมูลใช้ add()
         *
         * 7. แก้ข้อมูลใช้ set()
         *
         * 8. ลบข้อมูลใช้ remove()
         *
         * 9. ตรวจสอบใช้ contains()
         *
         * 10. ล้างทั้งหมดใช้ clear()
         *
         * 11. ArrayList ใช้ Object
         *     จึงต้องใช้ Integer แทน int
         *
         * 12. ArrayList สามารถมีข้อมูลซ้ำได้
         *
         * 13. ArrayList สามารถมี null ได้
         *
         *
         * ========================================================
         */
    }
}