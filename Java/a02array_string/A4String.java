package a02array_string;

/*
 * ============================================================
 * A4String
 * ============================================================
 *
 * String = ชนิดข้อมูลที่ใช้เก็บข้อความ (Text)
 *
 * ตัวอย่าง:
 *
 * "Hello"
 * "Java"
 * "Hello World"
 * "Nattawat"
 *
 *
 * ใน Java String เป็น Reference Type
 * ไม่ใช่ Primitive Type
 *
 * String เป็น Class ที่อยู่ใน package java.lang
 *
 * ดังนั้นสามารถใช้ String ได้เลย
 * โดยไม่ต้อง import
 *
 * ============================================================
 */

public class A4String {

    public static void main(String[] args) {


        // ========================================================
        // 1. การสร้าง String
        // ========================================================
        //
        // รูปแบบ
        //
        // String variableName = "ข้อความ";
        //
        //
        // String ใช้ "double quotes"
        //
        // ❌ 'Hello'
        //    ไม่ถูกต้อง เพราะ ' ' ใช้กับ char
        //
        // ✅ "Hello"
        //    ถูกต้อง เพราะ " " ใช้กับ String
        //
        //
        // char เก็บตัวอักษร 1 ตัว
        //
        // char letter = 'A';
        //
        //
        // String เก็บข้อความ
        //
        // String text = "Hello";


        String a = "Hello";

        System.out.println(a);

        // Output:
        // Hello


        // ========================================================
        // 2. String สามารถเก็บข้อความหลายตัวอักษร
        // ========================================================


        String name = "Nattawat";
        String message = "Hello World";
        String sentence = "Java is easy to learn";


        System.out.println(name);
        System.out.println(message);
        System.out.println(sentence);


        // ========================================================
        // 3. String เป็น Reference Type
        // ========================================================
        //
        // Primitive Type เช่น
        //
        // int
        // double
        // char
        // boolean
        //
        //
        // String ไม่ใช่ Primitive Type
        //
        // String เป็น Class
        //
        // ดังนั้นเราสามารถเรียก Method
        // ที่ String มีให้ใช้งานได้
        //
        // เช่น
        //
        // text.length()
        // text.toUpperCase()
        // text.toLowerCase()
        //
        //
        // จะเรียนเพิ่มเติมด้านล่าง


        // ========================================================
        // 4. การต่อ String (Concatenation)
        // ========================================================
        //
        // ใช้เครื่องหมาย +
        //
        //
        // String + String
        //
        // จะเป็นการนำข้อความมาต่อกัน
        //
        //
        // ตัวอย่าง:
        //
        // "Hello" + "Java"
        //
        // ผลลัพธ์:
        //
        // "HelloJava"


        String first = "Hello";
        String last = "Java";

        String full = first + " " + last;

        System.out.println(full);

        // Output:
        // Hello Java


        // ========================================================
        // 5. ต่อ String กับตัวเลข
        // ========================================================
        //
        // สามารถใช้ + ต่อ String กับตัวเลขได้
        //
        //
        // เมื่อมี String อยู่ในนิพจน์
        // Java จะเปลี่ยนค่าที่เหลือให้เป็นข้อความ
        //
        //
        // ตัวอย่าง:


        int age = 21;

        System.out.println("Age = " + age);

        // Output:
        // Age = 21


        double height = 175.8;

        System.out.println("Height = " + height);

        // Output:
        // Height = 175.8


        // ========================================================
        // 6. ระวังเรื่องลำดับการคำนวณ
        // ========================================================
        //
        // เรื่องนี้สำคัญมาก
        //
        //
        // ดูตัวอย่าง:
        //
        // 10 + 20
        //
        // = 30
        //
        //
        // แต่ถ้ามี String ก่อน:
        //
        // "Result = " + 10 + 20
        //
        // Java จะมองเป็น
        //
        // "Result = " + 10
        //     ↓
        // "Result = 10"
        //
        // แล้วต่อ 20
        //
        // "Result = 1020"
        //
        //
        // ไม่ใช่ 30


        System.out.println("Result = " + 10 + 20);

        // Output:
        // Result = 1020


        // ถ้าต้องการให้ 10 + 20
        // คำนวณก่อน
        //
        // ให้ใช้ ()


        System.out.println("Result = " + (10 + 20));

        // Output:
        // Result = 30


        // ========================================================
        // 7. String สามารถใช้ Escape Characters
        // ========================================================
        //
        // Escape Character
        // = ใช้ \ เพื่อเขียนอักขระพิเศษ
        //
        //
        // \n = ขึ้นบรรทัดใหม่
        // \t = Tab
        // \" = "
        // \\ = \
        //
        //
        // ตัวอย่าง:


        System.out.println("Hello\nJava");

        // Output:
        //
        // Hello
        // Java


        System.out.println("Hello\tJava");

        // Output:
        //
        // Hello    Java


        System.out.println("\"Hello Java\"");

        // Output:
        //
        // "Hello Java"
    }
}