package a06generics;


/*
 * ============================================================
 * A2GenericsMethods
 * ============================================================
 *
 * Generic Method
 * ============================================================
 *
 * Generic Method = Method ที่สามารถรับข้อมูลได้หลาย Type
 *                  โดยไม่ต้องสร้าง Method แยกสำหรับแต่ละ Type
 *
 *
 * ตัวอย่าง:
 *
 * printData(100);
 * printData("Hello");
 * printData(99.99);
 * printData(true);
 *
 *
 * Method เดียวสามารถรองรับ:
 *
 * Integer
 * String
 * Double
 * Boolean
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * สิ่งที่ต้องเข้าใจก่อน
 * ============================================================
 *
 *
 * Generic Class:
 *
 * class Box<T> {
 *
 * }
 *
 *
 * Generic Method:
 *
 * public static <T> void printData(T data) {
 *
 * }
 *
 *
 * สังเกตตำแหน่งของ <T>
 *
 *
 * Generic Class:
 *
 * class Box<T>
 *          ↑
 *       หลังชื่อ Class
 *
 *
 * Generic Method:
 *
 * public static <T> void printData(T data)
 *              ↑
 *       ก่อน Return Type
 *
 *
 * ============================================================
 */


public class A2GenericsMethods {

    public static void main(String[] args) {


        // ========================================================
        // 1. Generic Method
        // ========================================================
        //
        // printData() สามารถรับหลาย Type


        printData(100);

        printData("Hello");

        printData(99.99);

        printData(true);

        printData('A');


        /*
         * ผลลัพธ์:
         *
         * 100
         * Hello
         * 99.99
         * true
         * A
         *
         */


        // ========================================================
        // 2. Generic Method แบบ Return Type
        // ========================================================
        //
        // getValue()
        //
        // รับค่าเข้ามา
        // แล้วคืนค่ากลับไป
        //
        //
        // T คือ Type ที่รับเข้ามา
        // และเป็น Type ที่ Return กลับไป


        Integer num =
                getValue(100);


        String word =
                getValue("Good");


        Double price =
                getValue(99.99);


        Boolean status =
                getValue(true);


        System.out.println(num);
        System.out.println(word);
        System.out.println(price);
        System.out.println(status);


        /*
         * ผลลัพธ์:
         *
         * 100
         * Good
         * 99.99
         * true
         *
         */


        // ========================================================
        // 3. Java สามารถเดา Type ให้เราได้
        // ========================================================
        //
        // เราไม่ได้เขียน:
        //
        // <Integer>
        //
        // หรือ:
        //
        // <String>
        //
        //
        // แต่ Java สามารถอนุมาน (Infer)
        // Type จาก Argument ที่ส่งเข้าไป


        String text =
                getValue("Java");


        Integer number =
                getValue(500);


        // Java จะเข้าใจว่า:
        //
        // getValue("Java")
        //
        // T = String
        //
        //
        // getValue(500)
        //
        // T = Integer


        // ========================================================
        // 4. สามารถระบุ Type เองได้
        // ========================================================
        //
        // ในบางกรณีเราสามารถระบุ Generic Type
        // ให้ Method โดยตรง


        String language =
                A2GenericsMethods
                        .<String>getValue("Java");


        Integer score =
                A2GenericsMethods
                        .<Integer>getValue(95);


        System.out.println(language);
        System.out.println(score);


        // แต่โดยทั่วไป:
        //
        // ไม่จำเป็นต้องเขียน <String>
        //
        // เพราะ Java สามารถ Infer Type ให้ได้


        // ========================================================
        // 5. Generic Method ที่ใช้กับ Array
        // ========================================================
        //
        // Generic Method ไม่ได้จำกัดแค่
        // String หรือ Integer
        //
        // สามารถใช้กับ Array ได้ด้วย


        String[] names = {
            "Tle",
            "Alice",
            "Bob"
        };


        Integer[] scores = {
            80,
            90,
            95
        };


        printArray(names);

        printArray(scores);


        // ========================================================
        // 6. Generic Method ที่มีหลาย Type
        // ========================================================
        //
        // Method หนึ่งสามารถมีมากกว่า 1 Generic Type
        //
        //
        // <K, V>
        //
        // K = Type แรก
        // V = Type ที่สอง
        //
        //
        // ตัวอย่าง:
        //
        // printPair("Age", 20)
        //
        // K = String
        // V = Integer


        printPair("Age", 20);

        printPair("Name", "Tle");

        printPair("Price", 99.99);


        // ========================================================
        // 7. Generic Method ที่ Return หลาย Type
        // ========================================================
        //
        // เราสามารถสร้าง Object ที่เก็บ
        // Type สองชนิดได้


        Pair<String, Integer> student =
                createPair("Tle", 20);


        System.out.println(
                "Name = "
                + student.first
        );


        System.out.println(
                "Age = "
                + student.second
        );


        // ========================================================
        // 8. Generic Method กับ Wrapper Class
        // ========================================================
        //
        // Generic ใช้กับ Primitive Type โดยตรงไม่ได้
        //
        //
        // ❌
        //
        // printData(int)
        //
        // ในมุมของ Generic Type
        // จะใช้ Reference Type
        //
        //
        // แต่ Java มี Autoboxing
        //
        // int
        // ↓
        // Integer
        //
        //
        // ดังนั้น:
        //
        // printData(100);
        //
        // สามารถทำงานได้
        //
        // เพราะ Java จัดการ Boxing ให้


        // ========================================================
        // 9. Type Safety
        // ========================================================
        //
        // Generic ช่วยให้ Type ถูกต้อง
        //
        //
        // ตัวอย่าง:
        //
        // String text = getValue("Hello");
        //
        // ถูกต้อง
        //
        //
        // แต่:
        //
        // Integer number = getValue("Hello");
        //
        // ❌ Compile Error
        //
        // เพราะ Method คืน String
        // แต่เราพยายามเก็บลง Integer


        String correct =
                getValue("Hello");


        System.out.println(correct);


        // ❌ Compile Error
        //
        // Integer wrong = getValue("Hello");


        // ========================================================
        // Program End
        // ========================================================


        System.out.println(
                "\n========== Program End =========="
        );
    }


    // ============================================================
    // 10. Generic Method ไม่มี Return
    // ============================================================
    //
    // รูปแบบ:
    //
    // public static <T> void method(T data)
    //
    //
    // แยกให้ออก:
    //
    // <T>
    // ↓
    // ประกาศ Generic Type
    //
    // void
    // ↓
    // ไม่มีค่าที่ Return
    //
    // T data
    // ↓
    // รับข้อมูล Type T


    public static <T> void printData(T data) {

        System.out.println(data);

    }


    // ============================================================
    // 11. Generic Method ที่มี Return Type
    // ============================================================
    //
    // รูปแบบ:
    //
    // public static <T> T getValue(T value)
    //
    //
    // <T>
    // ↓
    // ประกาศ Generic Type
    //
    // T
    // ↓
    // Return Type
    //
    // T value
    // ↓
    // Parameter Type


    public static <T> T getValue(T value) {

        return value;

    }


    // ============================================================
    // 12. Generic Method สำหรับ Array
    // ============================================================


    public static <T> void printArray(T[] array) {

        for (T value : array) {

            System.out.println(value);

        }

        System.out.println();

    }


    // ============================================================
    // 13. Generic Method หลาย Type
    // ============================================================
    //
    // <K, V>
    //
    // K = Type แรก
    // V = Type ที่สอง


    public static <K, V> void printPair(
            K key,
            V value
    ) {

        System.out.println(
                key + " → " + value
        );

    }


    // ============================================================
    // 14. Generic Method ที่ Return Pair
    // ============================================================


    public static <K, V> Pair<K, V> createPair(
            K first,
            V second
    ) {

        return new Pair<>(
                first,
                second
        );

    }
}


/*
 * ============================================================
 * Pair Class
 * ============================================================
 *
 * Class นี้มี Generic 2 ตัว
 *
 * K = Type แรก
 * V = Type ที่สอง
 *
 *
 * เช่น:
 *
 * Pair<String, Integer>
 *
 * String → first
 * Integer → second
 *
 * ============================================================
 */


class Pair<K, V> {

    K first;

    V second;


    public Pair(K first, V second) {

        this.first = first;

        this.second = second;

    }
}


/*
 * ============================================================
 * Generic Method vs Generic Class
 * ============================================================
 *
 *
 * Generic Class
 *
 * class Box<T>
 *
 * T จะผูกกับ Object
 * ที่สร้างจาก Class
 *
 *
 * เช่น:
 *
 * Box<String> box = new Box<>("Java");
 *
 * Box<Integer> box = new Box<>(100);
 *
 *
 * ------------------------------------------------------------
 *
 *
 * Generic Method
 *
 * public static <T> void printData(T data)
 *
 *
 * T จะถูกกำหนดตอนเรียก Method
 *
 *
 * เช่น:
 *
 * printData("Java");
 * T → String
 *
 *
 * printData(100);
 * T → Integer
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * Type Inference
 * ============================================================
 *
 *
 * Java สามารถดู Argument
 * แล้วอนุมาน Type ให้เรา
 *
 *
 * getValue("Java")
 *
 * Java เห็นว่า:
 *
 * "Java" → String
 *
 * ดังนั้น:
 *
 * T = String
 *
 *
 * ------------------------------------------------------------
 *
 *
 * getValue(100)
 *
 * 100 → Integer
 *
 * ดังนั้น:
 *
 * T = Integer
 *
 *
 * ทำให้เราไม่จำเป็นต้องเขียน:
 *
 * <String>
 * <Integer>
 *
 * ทุกครั้ง
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * Generic Naming Convention
 * ============================================================
 *
 *
 * T = Type
 *
 * E = Element
 *
 * K = Key
 *
 * V = Value
 *
 * N = Number
 *
 *
 * ตัวอย่าง:
 *
 * <T>
 *
 * ใช้เมื่อมี Type ทั่วไป
 *
 *
 * <E>
 *
 * มักใช้กับ Element ใน Collection
 *
 *
 * <K, V>
 *
 * มักใช้กับ Key และ Value
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * ตัวอย่างที่เราเรียนมาก่อนหน้านี้
 * ============================================================
 *
 *
 * ArrayList<String>
 *
 *        ↓
 *
 * Generic Class
 *
 *
 * HashSet<Integer>
 *
 *        ↓
 *
 * Generic Class
 *
 *
 * HashMap<String, Integer>
 *
 *        ↓
 *
 * Generic Class ที่มี 2 Type
 *
 *
 * ------------------------------------------------------------
 *
 *
 * ส่วน:
 *
 * printData(T data)
 *
 *        ↓
 *
 * Generic Method
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * สรุปบท A2
 * ============================================================
 *
 *
 * Generic Method
 * ↓
 * Method ที่สามารถทำงานกับหลาย Type
 *
 *
 * ------------------------------------------------------------
 *
 * ไม่มี Return
 *
 * public static <T> void printData(T data)
 *
 *
 * ------------------------------------------------------------
 *
 * มี Return
 *
 * public static <T> T getValue(T value)
 *
 *
 * ------------------------------------------------------------
 *
 * หลาย Type
 *
 * public static <K, V> void printPair(K key, V value)
 *
 *
 * ------------------------------------------------------------
 *
 * Java สามารถ Infer Type:
 *
 * getValue("Java")
 * → T = String
 *
 * getValue(100)
 * → T = Integer
 *
 *
 * ------------------------------------------------------------
 *
 * Generic ช่วย:
 *
 * ✅ Reusable
 * ✅ Type Safety
 * ✅ ลด Code ซ้ำ
 * ✅ Compile-time Type Checking
 *
 *
 * ============================================================
 */