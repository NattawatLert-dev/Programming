package a01basic;

import java.util.Scanner;

public class A4Input {

    public static void main(String[] args) {

        // ========================================================
        // Input
        // ========================================================
        // Input = การรับข้อมูลจากผู้ใช้หรือแหล่งข้อมูลอื่นเข้ามาในโปรแกรม เพื่อนำไปประมวลผล


        // ========================================================
        // Scanner
        // ========================================================
        // Scanner = Class ที่ใช้สำหรับรับข้อมูลจากผู้ใช้ เช่น การพิมพ์ข้อมูลผ่าน Keyboard
        //
        // ต้อง import Scanner ก่อน
        //
        // import java.util.Scanner;


        Scanner scanner = new Scanner(System.in);

        /*
         * Scanner scanner = new Scanner(System.in);
         *
         * Scanner = ชนิดข้อมูล (Class)
         *
         * scanner = ชื่อตัวแปร
         *
         * new Scanner(...) = สร้าง Scanner Object ขึ้นมา
         *
         * System.in = รับข้อมูลจาก Input ของระบบโดยปกติคือ Keyboard
         */


        // ========================================================
        // 1. String Input
        // ========================================================

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        /*
         * nextLine() = รับข้อความทั้งบรรทัด
         *
         * ตัวอย่าง
         *
         * Input: Nattawat
         *
         * name = "Nattawat"
         *
         * สามารถรับข้อความที่มีช่องว่างได้
         *
         * เช่น
         *
         * "Nattawat Jaidee"
         */


        // ========================================================
        // 2. int Input
        // ========================================================

        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        /*
         * nextInt() = รับจำนวนเต็ม
         *
         * ตัวอย่าง
         *
         * 20
         * 18
         * 100
         *
         * สามารถนำไปคำนวณได้
         *
         * เช่น
         *
         * age + 1
         */


        // ========================================================
        // 3. double Input
        // ========================================================

        System.out.print("Enter your height: ");

        double height = scanner.nextDouble();

        /*
         * nextDouble() = รับตัวเลขทศนิยม
         *
         * ตัวอย่าง
         *
         * 175.8
         * 180.5
         * 165.2
         */


        // ========================================================
        // IMPORTANT !!!
        // ========================================================

        /*
         * เมื่อใช้ nextInt() หรือ nextDouble()
         * แล้วต้องการใช้ nextLine() ต่อ
         *
         * ต้องระวังเรื่อง Enter ที่ค้างอยู่
         *
         * ตัวอย่าง:
         *
         * ผู้ใช้พิมพ์
         *
         * 20 + Enter
         *
         * nextInt()
         *      ↓
         * อ่านแค่ 20
         *
         * แต่ Enter (\n) ยังเหลืออยู่
         *
         * ดังนั้นถ้าเรียก nextLine() ทันที
         * มันอาจอ่าน Enter ที่เหลืออยู่
         *
         * จึงใช้
         *
         * scanner.nextLine();
         *
         * เพื่อรับ Enter ที่ค้างอยู่ก่อน
         */

        scanner.nextLine(); // ล้าง Enter ที่ค้างอยู่


        // ========================================================
        // 4. char Input
        // ========================================================

        System.out.print("Enter your grade: ");

        char grade = scanner.nextLine().charAt(0);

        /*
         * Scanner ไม่มี nextChar()
         *
         * ดังนั้นถ้าต้องการรับ char เราจะใช้
         *
         * nextLine()
         *      ↓
         * รับ String
         *      ↓
         * charAt(0)
         *      ↓
         * เอาตัวอักษรตัวแรก
         *
         *
         * ตัวอย่าง:
         *
         * ผู้ใช้พิมพ์
         *
         * A
         *
         * nextLine()
         *      ↓
         * "A"
         *
         * charAt(0)
         *      ↓
         * 'A'
         *
         *
         * String:
         *
         * "ABC"
         *
         * Index:
         *
         *   A   B   C
         *   ↑   ↑   ↑
         *   0   1   2
         *
         * charAt(0) = 'A'
         */


        // ========================================================
        // 5. boolean Input
        // ========================================================

        System.out.print("Are you a student? (true/false): ");

        boolean isStudent = scanner.nextBoolean();

        /*
         * nextBoolean() = รับค่า boolean
         *
         * สามารถรับได้
         *
         * true
         * false
         *
         * ตัวอย่าง
         *
         * Input:
         * true
         *
         * isStudent = true
         */


        // ========================================================
        // Output
        // ========================================================

        System.out.println();
        System.out.println("========== RESULT ==========");

        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Height    : " + height);
        System.out.println("Grade     : " + grade);
        System.out.println("Student   : " + isStudent);


        // ========================================================
        // Input + Process + Output
        // ========================================================

        /*
         * ตัวอย่างการนำ Input ไปประมวลผล
         *
         * Input
         * ↓
         * age
         *
         * Process
         * ↓
         * คำนวณอายุในปีถัดไป
         */

        int nextYearAge = age + 1;

        System.out.println("Next year age : " + nextYearAge);


        // ========================================================
        // Scanner close
        // ========================================================

        scanner.close();

        /*
         * close() = ปิด Scanner เมื่อใช้งานเสร็จ
         *
         * เป็นการคืน Resource ที่ Scanner ใช้งานอยู่
         * เมื่อปิดแล้ว Scanner จะไม่สามารถรับ Input ต่อได้
         */


        // ========================================================
        // Summary
        // ========================================================

        /*
         * ========================================================
         * Scanner Method ที่ควรรู้
         * ========================================================
         *
         * nextLine() -> รับ String ทั้งบรรทัด
         *
         * next() -> รับ String 1 คำ
         *
         * nextInt() -> รับจำนวนเต็ม
         *
         * nextDouble() -> รับทศนิยม
         *
         * nextFloat() -> รับ float
         *
         * nextLong() -> รับ long
         *
         * nextBoolean() -> รับ true / false
         *
         *
         * ========================================================
         * จำง่าย ๆ
         * ========================================================
         *
         * String  -> nextLine()
         * int     -> nextInt()
         * double  -> nextDouble()
         * float   -> nextFloat()
         * long    -> nextLong()
         * boolean -> nextBoolean()
         * char    -> nextLine().charAt(0)
         *
         *
         * ========================================================
         * สิ่งที่ต้องระวังที่สุด
         * ========================================================
         *
         * nextInt()
         * nextDouble()
         * nextBoolean()
         *
         * แล้วตามด้วย nextLine()
         *
         * อาจมีปัญหา Enter ค้าง
         *
         * วิธีแก้:
         *
         * scanner.nextLine();
         *
         * ========================================================
         */
    }
}
