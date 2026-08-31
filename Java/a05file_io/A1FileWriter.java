package a05file_io;

import java.io.FileWriter;
import java.io.IOException;


/*
 * ============================================================
 * A1FileWriter
 * ============================================================
 *
 * File I/O
 * ============================================================
 *
 * File I/O = File Input / Output
 *
 * คือการทำงานกับไฟล์ เช่น
 *
 *     เขียนข้อมูลลงไฟล์
 *     อ่านข้อมูลจากไฟล์
 *     เพิ่มข้อมูลลงไฟล์
 *     สร้างไฟล์
 *     ลบไฟล์
 *     ตรวจสอบไฟล์
 *
 *
 * ในบทนี้เราจะเริ่มจาก:
 *
 *     FileWriter
 *
 *
 * ============================================================
 * FileWriter คืออะไร?
 * ============================================================
 *
 * FileWriter
 * = Class สำหรับ "เขียนข้อมูลแบบตัวอักษร (Text)"
 *   ลงในไฟล์
 *
 *
 * ตัวอย่างไฟล์:
 *
 * hello.txt
 *
 * Name : Tle
 * Age : 20
 * Major : Computer Science
 *
 *
 * FileWriter เหมาะกับไฟล์ Text เช่น:
 *
 *     .txt
 *     .csv
 *     .log
 *
 *
 * ============================================================
 */

public class A1FileWriter {

    public static void main(String[] args) {


        // ========================================================
        // 1. เขียนข้อมูลลงไฟล์
        // ========================================================
        //
        // new FileWriter("hello.txt")
        //
        // หมายถึง:
        //
        // เปิดไฟล์ชื่อ hello.txt
        // เพื่อเตรียมเขียนข้อมูล
        //
        //
        // ถ้าไฟล์ยังไม่มี
        // → Java จะสร้างไฟล์ให้
        //
        //
        // ถ้าไฟล์มีอยู่แล้ว
        // → ค่าเดิมจะถูกเขียนทับ
        //
        //
        // ดังนั้นต้องระวังเรื่อง "Overwrite"


        try {

            FileWriter writer =
                    new FileWriter("hello.txt");


            // ====================================================
            // 2. write()
            // ====================================================
            //
            // ใช้เขียนข้อความลงไฟล์


            writer.write(
                    "Name : Tle\n"
            );

            writer.write(
                    "Age : 20\n"
            );

            writer.write(
                    "Major : Computer Science"
            );


            // ====================================================
            // 3. close()
            // ====================================================
            //
            // ปิด FileWriter
            //
            // สำคัญมาก!
            //
            // เพราะข้อมูลบางส่วนอาจยังอยู่ใน Buffer
            //
            // การ close() ทำให้ Java
            // จัดการข้อมูลที่ค้างอยู่ให้เรียบร้อย


            writer.close();


            System.out.println(
                    "เขียนไฟล์สำเร็จ!"
            );

        }

        catch (IOException e) {

            System.out.println(
                    "เกิดข้อผิดพลาดในการเขียนไฟล์"
            );
        }


        // ========================================================
        // 4. \n คืออะไร?
        // ========================================================
        //
        // \n = New Line
        //
        // ใช้สำหรับขึ้นบรรทัดใหม่
        //
        //
        // เช่น:
        //
        // writer.write("Hello\n");
        // writer.write("Java");
        //
        //
        // ผลในไฟล์:
        //
        // Hello
        // Java
        //
        //
        // เราสามารถเขียน:
        //
        // "\n"
        //
        // เพื่อขึ้นบรรทัดใหม่ได้
        //
        //
        // แต่ในโปรแกรมที่ต้องการให้เหมาะกับ
        // Windows / Linux / macOS
        // สามารถใช้:
        //
        // System.lineSeparator()
        //
        // ได้เช่นกัน


        // ========================================================
        // 5. FileWriter เขียนทับไฟล์
        // ========================================================
        //
        // ตัวอย่าง:
        //
        // new FileWriter("hello.txt")
        //
        // ถ้า hello.txt มี:
        //
        // Hello
        // Java
        //
        //
        // แล้วเขียน:
        //
        // writer.write("Python");
        //
        //
        // ผลจะกลายเป็น:
        //
        // Python
        //
        //
        // ข้อมูลเดิมถูกเขียนทับ


        // ========================================================
        // 6. Append Mode
        // ========================================================
        //
        // ถ้าไม่ต้องการเขียนทับ
        // แต่ต้องการ "เพิ่มข้อมูลต่อท้าย"
        //
        // ให้ใช้:
        //
        // new FileWriter("hello.txt", true)
        //
        //
        // true
        // = append mode


        try {

            FileWriter writer =
                    new FileWriter(
                            "hello.txt",
                            true
                    );


            writer.write(
                    "\n--------------------\n"
            );

            writer.write(
                    "New data added!"
            );


            writer.close();


            System.out.println(
                    "เพิ่มข้อมูลสำเร็จ!"
            );

        }

        catch (IOException e) {

            System.out.println(
                    "ไม่สามารถเพิ่มข้อมูลได้"
            );
        }


        // ========================================================
        // 7. Overwrite vs Append
        // ========================================================
        /*
         *
         * Overwrite
         *
         * new FileWriter("hello.txt")
         *
         *     ↓
         *
         * เขียนทับข้อมูลเดิม
         *
         *
         * ------------------------------------------------
         *
         *
         * Append
         *
         * new FileWriter("hello.txt", true)
         *
         *     ↓
         *
         * เพิ่มข้อมูลต่อท้าย
         *
         */


        // ========================================================
        // 8. try-with-resources
        // ========================================================
        //
        // วิธีที่แนะนำมากกว่าใน Java สมัยใหม่
        //
        // เพราะ Java จะ close()
        // ให้เราโดยอัตโนมัติ
        //
        //
        // ไม่ต้องเขียน:
        //
        // writer.close();
        //
        // เอง


        try (
                FileWriter writer =
                        new FileWriter(
                                "example.txt"
                        )
        ) {

            writer.write(
                    "Hello Java!"
            );

            writer.write(
                    "\nFile I/O"
            );


        }

        catch (IOException e) {

            System.out.println(
                    "เกิดข้อผิดพลาด: "
                    + e.getMessage()
            );
        }


        /*
         *
         * จุดสำคัญ:
         *
         * try (
         *     FileWriter writer = ...
         * )
         *
         * Java จะจัดการ close()
         * ให้อัตโนมัติ
         *
         *
         * ดังนั้นรูปแบบนี้ปลอดภัยกว่า:
         *
         *
         * try {
         *
         *     FileWriter writer = ...
         *
         *     ...
         *
         *     writer.close();
         *
         * }
         *
         *
         * เพราะถ้าเกิด Exception ก่อนถึง
         * writer.close()
         *
         * ไฟล์อาจไม่ได้ถูกปิดอย่างถูกต้อง
         *
         */


        // ========================================================
        // 9. เขียนข้อมูลหลายบรรทัด
        // ========================================================


        try (
                FileWriter writer =
                        new FileWriter(
                                "student.txt"
                        )
        ) {

            writer.write(
                    "Student Information\n"
            );

            writer.write(
                    "-------------------\n"
            );

            writer.write(
                    "Name : Tle\n"
            );

            writer.write(
                    "Age : 20\n"
            );

            writer.write(
                    "Major : Computer Science\n"
            );

            writer.write(
                    "Score : 95"
            );


            System.out.println(
                    "สร้าง student.txt สำเร็จ"
            );

        }

        catch (IOException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }


        // ========================================================
        // 10. เขียนตัวเลขลงไฟล์
        // ========================================================
        //
        // FileWriter เขียน Text
        //
        // ดังนั้นถ้าเรามี int / double
        // Java จะต้องแปลงเป็นข้อความ
        //
        // สามารถต่อ String ได้เลย


        int age = 20;
        double score = 95.5;


        try (
                FileWriter writer =
                        new FileWriter(
                                "data.txt"
                        )
        ) {

            writer.write(
                    "Age : " + age + "\n"
            );

            writer.write(
                    "Score : " + score + "\n"
            );

        }

        catch (IOException e) {

            System.out.println(
                    "ไม่สามารถเขียน data.txt ได้"
            );
        }


        // ========================================================
        // 11. System.lineSeparator()
        // ========================================================
        //
        // ใช้สำหรับขึ้นบรรทัดใหม่
        // ตามระบบปฏิบัติการ
        //
        // Windows
        // → \r\n
        //
        // Linux / macOS
        // → \n
        //
        //
        // ถ้าต้องการให้ Java จัดการให้:
        //
        // System.lineSeparator()


        try (
                FileWriter writer =
                        new FileWriter(
                                "system-line.txt"
                        )
        ) {

            writer.write(
                    "Line 1"
            );

            writer.write(
                    System.lineSeparator()
            );

            writer.write(
                    "Line 2"
            );

        }

        catch (IOException e) {

            System.out.println(
                    "Error"
            );
        }


        // ========================================================
        // 12. IOException
        // ========================================================
        //
        // File I/O สามารถเกิดปัญหาได้หลายอย่าง
        //
        // เช่น:
        //
        //     ไม่มีสิทธิ์เขียนไฟล์
        //     Path ไม่ถูกต้อง
        //     Disk มีปัญหา
        //     ไฟล์ถูกใช้งานอยู่
        //     Storage เต็ม
        //
        //
        // Java จึงใช้:
        //
        // IOException
        //
        // เพื่อจัดการปัญหาเกี่ยวกับ Input / Output


        // ========================================================
        // 13. ทำไมต้อง import?
        // ========================================================
        //
        // FileWriter:
        //
        // import java.io.FileWriter;
        //
        //
        // IOException:
        //
        // import java.io.IOException;
        //
        //
        // java.io
        // = Package ที่เกี่ยวข้องกับ
        //   Input / Output


        // ========================================================
        // 14. Relative Path
        // ========================================================
        //
        // ตัวอย่าง:
        //
        // new FileWriter("hello.txt")
        //
        //
        // "hello.txt"
        // เป็น Relative Path
        //
        // หมายถึง:
        //
        // ให้สร้างไฟล์จากตำแหน่ง
        // Working Directory ของโปรแกรม
        //
        //
        // ตรงนี้สำคัญมาก!
        //
        // เพราะไฟล์อาจไม่ได้ไปอยู่ใน
        // Folder เดียวกับ .java
        //
        // แต่จะอยู่ตาม Working Directory
        //
        //
        // IDE แต่ละตัวอาจกำหนด
        // Working Directory ต่างกัน


        // ========================================================
        // 15. Absolute Path
        // ========================================================
        //
        // เราสามารถระบุ Path แบบเต็มได้
        //
        // เช่น:
        //
        // Windows:
        //
        // C:/Users/Tle/Documents/hello.txt
        //
        //
        // Linux:
        //
        // /home/tle/Documents/hello.txt
        //
        //
        // แต่ไม่ควร Hard-code Path ของเครื่อง
        // เมื่อทำโปรเจกต์เพื่อแชร์บน GitHub
        //
        // เพราะเครื่องของคนอื่น
        // ไม่มี Path เดียวกับเรา


        // ========================================================
        // 16. FileWriter ใช้กับอะไร?
        // ========================================================
        /*
         *
         * FileWriter
         * ↓
         * Text File
         *
         *
         * เหมาะกับ:
         *
         * .txt
         * .csv
         * .log
         *
         *
         * ถ้าต้องการอ่าน:
         *
         * FileReader
         *
         *
         * ถ้าต้องการทำงานกับไฟล์ทั่วไป:
         *
         * java.io.File
         *
         *
         * ถ้าต้องการ API สมัยใหม่:
         *
         * java.nio.file.Files
         * java.nio.file.Path
         *
         */


        // ========================================================
        // 17. FileWriter vs Files.writeString()
        // ========================================================
        //
        // Java รุ่นใหม่มี API ที่เขียนง่ายขึ้น
        //
        // เช่น:
        //
        // Files.writeString(...)
        //
        //
        // แต่ FileWriter ยังสำคัญ
        // เพราะช่วยให้เข้าใจพื้นฐาน
        // ของ File I/O และ Writer


        // ========================================================
        // 18. สรุป
        // ========================================================
        /*
         *
         * FileWriter
         *     ↓
         * เขียน Text ลงไฟล์
         *
         *
         * ------------------------------------------------
         *
         * FileWriter("file.txt")
         *     ↓
         * เขียนทับไฟล์
         *
         *
         * FileWriter("file.txt", true)
         *     ↓
         * เพิ่มข้อมูลต่อท้าย
         *
         *
         * writer.write(...)
         *     ↓
         * เขียนข้อมูล
         *
         *
         * writer.close()
         *     ↓
         * ปิด Writer
         *
         *
         * try-with-resources
         *     ↓
         * ปิด Resource ให้อัตโนมัติ
         *
         *
         * IOException
         *     ↓
         * จัดการปัญหาด้าน I/O
         *
         */


        System.out.println(
                "\n========== Program End =========="
        );
    }
}