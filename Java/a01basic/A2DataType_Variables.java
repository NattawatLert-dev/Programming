package a01basic;

/**
 * ============================================================
 * A2 - Data Types, Variables & Constants
 * ============================================================
 *
 * บทนี้เรียนรู้เกี่ยวกับ
 *
 * 1. Data Type คืออะไร?
 * 2. Primitive Type
 * 3. Reference Type
 * 4. การประกาศและใช้งานตัวแปร (Variables)
 * 5. การเปลี่ยนค่าตัวแปร
 * 6. การประกาศตัวแปรหลายตัว
 * 7. Constants ด้วย final
 * 8. การ Casting
 * 9. สิ่งที่ควรรู้เกี่ยวกับ String
 *
 * ============================================================
 */

public class A2DataType_Variables {

    public static void main(String[] args) {

        // ========================================================
        // 1. DATA TYPE
        // ========================================================
        /*
         * Data Type = ชนิดของข้อมูล
         *
         * ใช้บอก Java ว่า
         * "ตัวแปรนี้สามารถเก็บข้อมูลประเภทอะไร?"
         *
         * ตัวอย่าง
         *
         * int age = 20;
         *
         * int  -> Data Type
         * age  -> Variable
         * 20   -> Value
         */


        // ========================================================
        // 2. PRIMITIVE TYPE
        // ========================================================
        /*
         * Primitive Type คือ Data Type พื้นฐานของ Java
         *
         * Java มี Primitive Type ทั้งหมด 8 ชนิด
         *
         * --------------------------------------------------------
         * Type       ขนาด          ใช้เก็บอะไร
         * --------------------------------------------------------
         * byte       8 bit         จำนวนเต็มขนาดเล็ก
         * short      16 bit        จำนวนเต็ม
         * int        32 bit        จำนวนเต็ม
         * long       64 bit        จำนวนเต็มขนาดใหญ่
         *
         * float      32 bit        ทศนิยม
         * double     64 bit        ทศนิยม
         *
         * char       16 bit        ตัวอักษร 1 ตัว
         * boolean    JVM-dependent  true / false
         * --------------------------------------------------------
         */

        
        // ========================================================
        // 3. INTEGER TYPES - จำนวนเต็ม
        // ========================================================

        byte myByte = 100;
        short myShort = 30000;
        int age = 20;
        long population = 8000000000L;

        System.out.println("byte    = " + myByte);
        System.out.println("short   = " + myShort);
        System.out.println("int     = " + age);
        System.out.println("long    = " + population);

        /*
         * จุดสำคัญของ long
         *
         * ถ้าเราเขียน
         *
         * long population = 8000000000;
         *
         * อาจเกิด Error เพราะตัวเลขจำนวนเต็มที่เขียนตรง ๆ
         * โดยทั่วไป Java จะมองเป็น int ก่อน
         *
         * จึงควรเติม L
         *
         * 8000000000L
         *
         * L = บอก Java ว่านี่คือ long
         */


        // ========================================================
        // 4. DECIMAL TYPES - ทศนิยม
        // ========================================================

        float weight = 65.5f;
        double height = 175.8;

        System.out.println("float   = " + weight);
        System.out.println("double  = " + height);

        /*
         * ทำไม float ต้องมี f?
         *
         * เช่น
         *
         * float weight = 65.5;
         *
         * Java จะมอง 65.5 เป็น double
         *
         * ดังนั้นถ้าต้องการเก็บเป็น float
         * ให้เขียน
         *
         * float weight = 65.5f;
         *
         * f = float
         *
         * ส่วน double สามารถเขียนได้เลย
         *
         * double height = 175.8;
         *
         * โดยทั่วไปถ้าไม่จำเป็นต้องประหยัดพื้นที่
         * มักใช้ double มากกว่า float
         */


        // ========================================================
        // 5. CHAR - ตัวอักษร
        // ========================================================

        char grade = 'A';

        System.out.println("Grade = " + grade);

        /*
         * char ใช้เก็บ "ตัวอักษร 1 ตัว"
         *
         * ต้องใช้ Single Quote
         *
         * 'A'
         * 'B'
         * '1'
         * '@'
         *
         * ถูก
         *
         * char grade = 'A';
         *
         * ผิด
         *
         * char grade = "A";
         *
         * เพราะ "A" เป็น String
         * ไม่ใช่ char
         */


        // ========================================================
        // 6. BOOLEAN - จริง / เท็จ
        // ========================================================

        boolean isPass = true;
        boolean isOnline = false;

        System.out.println("Pass    = " + isPass);
        System.out.println("Online  = " + isOnline);

        /*
         * boolean มีได้แค่ 2 ค่า
         *
         * true
         * false
         *
         * มักใช้กับเงื่อนไข เช่น
         *
         * สอบผ่านไหม?
         * login อยู่ไหม?
         * เปิดอยู่ไหม?
         */


        // ========================================================
        // 7. REFERENCE TYPE
        // ========================================================
        /*
         * นอกจาก Primitive Type แล้ว
         * Java ยังมี Reference Type
         *
         * ตัวอย่างเช่น
         *
         * String
         * Array
         * Object
         *
         * Reference Type ใช้สำหรับอ้างอิงไปยัง Object
         *
         * ตัวอย่าง
         */

        String name = "Nattawat";

        System.out.println("Name = " + name);

        /*
         * String ไม่ใช่ Primitive Type
         *
         * ถึงแม้เราจะใช้ String บ่อยมาก
         *
         * String เป็น Class
         *
         * เช่น
         *
         * String name = "Nattawat";
         *
         * name
         * คือ variable
         *
         * "Nattawat"
         * คือ String value
         */


        // ========================================================
        // 8. VARIABLE
        // ========================================================
        /*
         * Variable = ตัวแปร
         *
         * ตัวแปรเปรียบเสมือน "กล่อง"
         * ที่ใช้เก็บข้อมูลใน Memory
         *
         * รูปแบบพื้นฐาน
         *
         * DataType variableName = value;
         *
         * ตัวอย่าง
         */

        int studentNumber = 16;

        System.out.println("Student number = " + studentNumber);


        // ========================================================
        // 9. เปลี่ยนค่าของ Variable
        // ========================================================

        int score = 50;

        System.out.println("Before = " + score);

        // เปลี่ยนค่าจาก 50 เป็น 80
        score = 80;

        System.out.println("After  = " + score);

        /*
         * สิ่งสำคัญ:
         *
         * ตอนประกาศครั้งแรก
         *
         * int score = 50;
         *
         * เราต้องบอก Data Type
         *
         * แต่เมื่อมีตัวแปรอยู่แล้ว
         * เราสามารถเปลี่ยนค่าได้โดยไม่ต้องเขียน int ซ้ำ
         *
         * score = 80;
         *
         * ไม่ควรเขียน
         *
         * int score = 80;
         *
         * เพราะนั่นคือการประกาศตัวแปรใหม่
         */


        // ========================================================
        // 10. ประกาศ Variable ก่อน แล้วค่อยกำหนดค่า
        // ========================================================

        int number;

        // กำหนดค่าให้ภายหลัง
        number = 100;

        System.out.println("Number = " + number);

        /*
         * สามารถแยกเป็น 2 ขั้นตอนได้
         *
         * ขั้นที่ 1
         * int number;
         *
         * ขั้นที่ 2
         * number = 100;
         *
         * แต่ก่อนนำ Local Variable ไปใช้งาน
         * ต้องกำหนดค่าให้มันก่อน
         */


        // ========================================================
        // 11. ประกาศหลาย Variable ในบรรทัดเดียว
        // ========================================================

        char gradeA = 'A',
             gradeB = 'B',
             gradeC = 'C';

        System.out.println("Grade A = " + gradeA);
        System.out.println("Grade B = " + gradeB);
        System.out.println("Grade C = " + gradeC);

        /*
         * สามารถเขียนแบบนี้ได้
         *
         * แต่สำหรับการอ่าน Code
         * บางครั้งการแยกเป็นคนละบรรทัดจะอ่านง่ายกว่า
         *
         * char gradeA = 'A';
         * char gradeB = 'B';
         * char gradeC = 'C';
         *
         * หลักสำคัญคือ
         *
         * "เขียน Code ให้คนอื่นอ่านง่าย"
         */


        // ========================================================
        // 12. CONSTANT
        // ========================================================
        /*
         * Constant = ค่าคงที่
         *
         * คือค่าที่กำหนดแล้ว
         * ไม่สามารถเปลี่ยนค่าได้อีก
         *
         * ใน Java ใช้คำว่า final
         */

        final int MAX_SCORE = 100;

        System.out.println("Maximum score = " + MAX_SCORE);

        /*
         * เมื่อประกาศว่าเป็น final
         *
         * MAX_SCORE = 200;
         *
         * จะเกิด Error
         *
         * เพราะ MAX_SCORE ถูกกำหนดให้เป็นค่าคงที่
         *
         * --------------------------------------------------------
         * Convention
         * --------------------------------------------------------
         *
         * Variable ปกติ
         *
         * int maxScore = 100;
         *
         * Constant
         *
         * final int MAX_SCORE = 100;
         *
         * Constant มักเขียนด้วย UPPER_CASE
         * และใช้ _ คั่นคำ
         */


        // ========================================================
        // 13. ตัวอย่าง Constant ที่เห็นภาพ
        // ========================================================

        final double PI = 3.14159;

        System.out.println("PI = " + PI);

        /*
         * PI เป็นค่าที่เราไม่ต้องการให้โปรแกรมเปลี่ยน
         *
         * ดังนั้นใช้ final
         */


        // ========================================================
        // 14. TYPE CASTING
        // ========================================================
        /*
         * Type Casting
         * = การแปลง Data Type
         *
         * ตัวอย่าง
         *
         * double -> int
         *
         * เราสามารถแปลงได้แบบนี้
         */

        double price = 99.99;

        int intPrice = (int) price;

        System.out.println("Original price = " + price);
        System.out.println("After casting  = " + intPrice);

        /*
         * ผลลัพธ์
         *
         * Original price = 99.99
         * After casting  = 99
         *
         * สิ่งสำคัญ:
         *
         * (int) price
         *
         * ไม่ได้ปัดเศษ
         *
         * แต่เป็นการตัดส่วนทศนิยมทิ้ง
         */


        // ========================================================
        // 15. WIDENING CASTING
        // ========================================================
        /*
         * การแปลงจาก Data Type ที่เล็กกว่า
         * ไปเป็น Data Type ที่ใหญ่กว่า
         *
         * เช่น
         *
         * int -> double
         *
         * Java สามารถทำให้เราอัตโนมัติ
         */

        int smallNumber = 10;

        double bigNumber = smallNumber;

        System.out.println("int    = " + smallNumber);
        System.out.println("double = " + bigNumber);

        /*
         * 10
         * กลายเป็น
         * 10.0
         *
         * การแปลงแบบนี้เรียกว่า
         *
         * Widening Casting
         */


        // ========================================================
        // 16. NARROWING CASTING
        // ========================================================
        /*
         * จาก Data Type ที่ใหญ่กว่า
         * ไปเป็น Data Type ที่เล็กกว่า
         *
         * เช่น
         *
         * double -> int
         *
         * ต้องเขียน Casting เอง
         */

        double decimalNumber = 10.99;

        int wholeNumber = (int) decimalNumber;

        System.out.println("double = " + decimalNumber);
        System.out.println("int    = " + wholeNumber);

        /*
         * 10.99
         *
         * ↓
         *
         * (int)
         *
         * ↓
         *
         * 10
         *
         * ข้อมูลบางส่วนหายไป
         *
         * ดังนั้นต้องระวังเมื่อใช้ Narrowing Casting
         */


        // ========================================================
        // 17. VARIABLE NAMING
        // ========================================================
        /*
         * การตั้งชื่อ Variable มีหลักที่ควรรู้
         *
         * ใช้ camelCase
         *
         * ตัวอย่างที่ดี
         *
         * studentName
         * studentAge
         * totalScore
         * firstName
         *
         * ไม่ควรเขียน
         *
         * studentname
         * student_name   // Java มักนิยม camelCase
         *
         * --------------------------------------------------------
         *
         * ห้ามขึ้นต้นด้วยตัวเลข
         *
         * int 1student;   // ❌
         *
         * ต้องเขียน
         *
         * int student1;   // ✅
         *
         * --------------------------------------------------------
         *
         * ห้ามใช้ Keyword ของ Java เป็นชื่อ Variable
         *
         * เช่น
         *
         * int class;      // ❌
         * int public;     // ❌
         * int int;        // ❌
         */


        // ========================================================
        // 18. FINAL SUMMARY
        // ========================================================

        System.out.println();
        System.out.println("=================================");
        System.out.println("SUMMARY");
        System.out.println("=================================");

        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Height      : " + height);
        System.out.println("Grade       : " + grade);
        System.out.println("Pass        : " + isPass);
        System.out.println("Max Score   : " + MAX_SCORE);

        /*
         * ========================================================
         * สรุปสิ่งที่ควรจำ
         * ========================================================
         *
         * 1. Data Type
         *    = ชนิดของข้อมูล
         *
         * 2. Variable
         *    = ตัวแปรสำหรับเก็บข้อมูล
         *
         * 3. Primitive Type มี 8 ชนิด
         *
         *    byte
         *    short
         *    int
         *    long
         *    float
         *    double
         *    char
         *    boolean
         *
         * 4. Reference Type
         *
         *    String
         *    Array
         *    Object
         *
         * 5. int
         *    = จำนวนเต็มที่ใช้บ่อย
         *
         * 6. double
         *    = ทศนิยมที่ใช้บ่อย
         *
         * 7. char
         *    = ตัวอักษร 1 ตัว
         *
         * 8. boolean
         *    = true / false
         *
         * 9. String
         *    = ข้อความ
         *
         * 10. final
         *     = ทำให้ตัวแปรเป็นค่าคงที่
         *
         * 11. Type Casting
         *     = การแปลงชนิดข้อมูล
         *
         * ========================================================
         */
    }
}