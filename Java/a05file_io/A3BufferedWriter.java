package a05file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*
 * ============================================================
 * A3BufferedWriter
 * ============================================================
 *
 * BufferedWriter
 * ============================================================
 *
 * BufferedWriter = Class ที่ใช้สำหรับ "เขียนข้อมูลแบบ Text"
 *                  ลงไฟล์ โดยมี Buffer ช่วยเก็บข้อมูล
 *                  ก่อนเขียนลงไฟล์จริง
 *
 *
 * ภาพรวม:
 *
 * โปรแกรม
 *    ↓
 * BufferedWriter
 *    ↓
 * Buffer
 *    ↓
 * FileWriter
 *    ↓
 * File
 *
 *
 * ============================================================
 * ทำไมต้องใช้ BufferedWriter ?
 * ============================================================
 *
 * ถ้าใช้ FileWriter โดยตรง:
 *
 *     Program
 *        ↓
 *     FileWriter
 *        ↓
 *     File
 *
 *
 * BufferedWriter จะเพิ่ม Buffer เข้ามาช่วย:
 *
 *     Program
 *        ↓
 *     BufferedWriter
 *        ↓
 *     Buffer
 *        ↓
 *     FileWriter
 *        ↓
 *     File
 *
 *
 * Buffer = พื้นที่ชั่วคราวสำหรับเก็บข้อมูล
 *
 *
 * แทนที่จะเขียนข้อมูลลงไฟล์
 * ทุกครั้งที่เรียก write()
 *
 * BufferedWriter สามารถเก็บข้อมูลไว้ก่อน
 * แล้วค่อยเขียนเป็นชุด ๆ
 *
 * ซึ่งช่วยลดจำนวนครั้งในการเข้าถึงไฟล์
 *
 * ============================================================
 */


public class A3BufferedWriter {

    public static void main(String[] args) {


        // ========================================================
        // 1. สร้าง BufferedWriter
        // ========================================================
        //
        // BufferedWriter ต้องใช้ Writer
        // เป็นตัวรับข้อมูลด้านล่าง
        //
        //
        // ในตัวอย่างนี้:
        //
        // BufferedWriter
        //       ↓
        // FileWriter
        //       ↓
        // hello.txt
        //
        //
        // FileWriter → ติดต่อกับไฟล์
        //
        // BufferedWriter → ช่วยจัดการ Buffer
        //
        //
        // try-with-resources
        // จะปิด Writer ให้อัตโนมัติ


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("hello.txt")
                        )
        ) {


            // ====================================================
            // 2. write()
            // ====================================================
            //
            // ใช้เขียนข้อความ
            //
            // ข้อมูลที่เขียนจะถูกส่งเข้า Buffer
            //
            // ยังไม่จำเป็นต้องเขียนลง Disk
            // ทันทีทุกครั้ง


            writer.write("Hello");


            // ====================================================
            // 3. newLine()
            // ====================================================
            //
            // ใช้ขึ้นบรรทัดใหม่
            //
            // ดีกว่าการเขียน:
            //
            // writer.write("\n");
            //
            //
            // เพราะ newLine()
            // จะใช้ตัวขึ้นบรรทัดใหม่
            // ที่เหมาะสมกับระบบ


            writer.newLine();


            writer.write("Java");


            /*
             * ====================================================
             * ตอนนี้ไฟล์ควรมี:
             * ====================================================
             *
             * Hello
             * Java
             *
             */


        }

        catch (IOException e) {

            System.out.println(
                    "ไม่สามารถเขียนไฟล์ได้"
            );

            System.out.println(
                    "รายละเอียด: "
                    + e.getMessage()
            );
        }


        // ========================================================
        // 4. try-with-resources
        // ========================================================
        //
        // ตัวอย่าง:
        //
        // try (BufferedWriter writer = ...) {
        //
        // }
        //
        //
        // เมื่อออกจาก try
        //
        // Java จะเรียก:
        //
        // writer.close()
        //
        // ให้อัตโนมัติ
        //
        //
        // และ close()
        // จะทำการ flush ข้อมูลที่ค้างอยู่
        // ก่อนปิด Resource


        // ========================================================
        // 5. flush()
        // ========================================================
        //
        // flush() = บอกให้ Writer
        // นำข้อมูลที่ค้างอยู่ใน Buffer
        // ออกไปเขียนยังปลายทาง
        //
        //
        // ตัวอย่าง:
        //
        // writer.write("Hello");
        //
        // ข้อมูลอาจอยู่ใน Buffer
        //
        // writer.flush();
        //
        // ↓
        //
        // ส่งข้อมูลออกไป
        //
        //
        // หมายเหตุ:
        //
        // ถ้าใช้ try-with-resources
        // และปิด writer ด้วย close()
        // โดยทั่วไปไม่จำเป็นต้องเรียก
        // flush() ก่อน close()
        //
        // เพราะ close() จะ flush ให้อยู่แล้ว


        // ========================================================
        // 6. ตัวอย่าง flush()
        // ========================================================


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("flush-example.txt")
                        )
        ) {

            writer.write("Hello Java");

            // ส่งข้อมูลจาก Buffer ออกไป
            writer.flush();

        }

        catch (IOException e) {

            System.out.println(
                    "Flush Error"
            );
        }


        // ========================================================
        // 7. เขียนหลายบรรทัด
        // ========================================================
        //
        // BufferedWriter เหมาะมากกับการ
        // เขียนข้อมูลหลายบรรทัด


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("students.txt")
                        )
        ) {

            writer.write("Student List");
            writer.newLine();

            writer.write("Tle");
            writer.newLine();

            writer.write("Alice");
            writer.newLine();

            writer.write("Bob");
            writer.newLine();

            writer.write("Charlie");

        }

        catch (IOException e) {

            System.out.println(
                    "ไม่สามารถสร้าง students.txt ได้"
            );
        }


        // ========================================================
        // 8. เขียนข้อมูลจาก Loop
        // ========================================================
        //
        // สามารถใช้ BufferedWriter
        // ร่วมกับ Loop ได้


        String[] names = {
                "Tle",
                "Alice",
                "Bob",
                "Charlie"
        };


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("names.txt")
                        )
        ) {

            for (String name : names) {

                writer.write(name);
                writer.newLine();

            }

        }

        catch (IOException e) {

            System.out.println(
                    "Write Error"
            );
        }


        // ========================================================
        // 9. เขียนตัวเลข
        // ========================================================
        //
        // write()
        // รับ String หรือข้อมูลที่เหมาะกับ Writer
        //
        // ถ้าต้องการเขียน int
        // สามารถแปลงเป็น String ได้


        int age = 20;


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("number.txt")
                        )
        ) {

            writer.write(
                    String.valueOf(age)
            );

        }

        catch (IOException e) {

            System.out.println(
                    "Number Write Error"
            );
        }


        // ========================================================
        // 10. append mode
        // ========================================================
        //
        // จุดสำคัญมาก
        //
        // FileWriter แบบปกติ:
        //
        // new FileWriter("hello.txt")
        //
        //
        // ถ้าไฟล์มีข้อมูลอยู่แล้ว
        // การเปิดแบบนี้สามารถเขียนทับ
        // ข้อมูลเดิมได้
        //
        //
        // ถ้าต้องการ "เขียนต่อท้าย"
        // ให้ใช้:
        //
        // new FileWriter("hello.txt", true)
        //
        //
        // true = append mode


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter(
                                        "hello.txt",
                                        true
                                )
                        )
        ) {

            writer.newLine();
            writer.write("New Line");

        }

        catch (IOException e) {

            System.out.println(
                    "Append Error"
            );
        }


        /*
         * ========================================================
         * 11. overwrite vs append
         * ========================================================
         *
         *
         * แบบที่ 1:
         *
         * new FileWriter("hello.txt")
         *
         *
         *     File เดิม
         *         ↓
         *     เขียนข้อมูลใหม่
         *         ↓
         *     ข้อมูลเดิมอาจถูกเขียนทับ
         *
         *
         * --------------------------------------------------------
         *
         * แบบที่ 2:
         *
         * new FileWriter("hello.txt", true)
         *
         *
         *     File เดิม
         *         ↓
         *     เขียนต่อท้าย
         *         ↓
         *     ข้อมูลเดิมยังอยู่
         *
         */


        // ========================================================
        // 12. BufferedWriter vs FileWriter
        // ========================================================
        /*
         *
         * FileWriter
         * --------------------------------------------------------
         *
         * ใช้เขียน Text ลงไฟล์
         *
         *
         * BufferedWriter
         * --------------------------------------------------------
         *
         * ใช้ Buffer ช่วยในการเขียน
         *
         * มีเมธอดที่สะดวก เช่น:
         *
         * write()
         * newLine()
         * flush()
         *
         *
         * ดังนั้นเรามักพบ:
         *
         * BufferedWriter
         *      ↓
         * FileWriter
         *
         *
         * ไม่ใช่การเลือกอย่างใดอย่างหนึ่งเสมอไป
         *
         * แต่ BufferedWriter
         * สามารถครอบ FileWriter ได้
         *
         */


        // ========================================================
        // 13. Writer คืออะไร?
        // ========================================================
        //
        // FileWriter และ BufferedWriter
        // อยู่ในกลุ่ม Writer
        //
        //
        // แนวคิด:
        //
        // Writer
        //   │
        //   ├── FileWriter
        //   │
        //   └── BufferedWriter
        //
        //
        // BufferedWriter สามารถรับ Writer
        // เข้ามาเป็นตัวด้านในได้
        //
        //
        // ตัวอย่าง:
        //
        // new BufferedWriter(
        //
        //     new FileWriter("hello.txt")
        //
        // )
        //
        //
        // อ่านจากข้างในออก:
        //
        // FileWriter
        //      ↓
        // BufferedWriter
        //
        //
        // แล้วโปรแกรมใช้:
        //
        // BufferedWriter
        //
        // เป็นตัวหลักในการเขียน


        // ========================================================
        // 14. IOException
        // ========================================================
        //
        // การทำงานกับไฟล์สามารถเกิดปัญหาได้
        //
        // เช่น:
        //
        // - ไม่มีสิทธิ์เขียนไฟล์
        // - Path ไม่ถูกต้อง
        // - Disk มีปัญหา
        // - File System มีปัญหา
        //
        //
        // จึงต้องจัดการ IOException


        // ========================================================
        // 15. FileWriter + BufferedWriter + FileReader
        // ========================================================
        //
        // ตอนนี้เรามองภาพรวม File I/O ได้แล้ว
        //
        //
        // เขียน:
        //
        // Program
        //    ↓
        // BufferedWriter
        //    ↓
        // FileWriter
        //    ↓
        // File
        //
        //
        // อ่าน:
        //
        // File
        //    ↓
        // FileReader
        //    ↓
        // BufferedReader
        //    ↓
        // Program
        //
        //
        // จึงสามารถจับคู่ได้:
        //
        //
        // เขียน:
        //
        // BufferedWriter
        // + FileWriter
        //
        //
        // อ่าน:
        //
        // BufferedReader
        // + FileReader


        // ========================================================
        // 16. ตัวอย่างครบ Write → Read
        // ========================================================
        //
        // ตัวอย่างนี้เป็น Workflow ที่สำคัญ
        //
        // 1. เขียนไฟล์
        // 2. ปิดไฟล์
        // 3. เปิดไฟล์
        // 4. อ่านไฟล์


        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter(
                                        "complete-example.txt"
                                )
                        )
        ) {

            writer.write("Hello");
            writer.newLine();
            writer.write("This is Java File I/O.");

        }

        catch (IOException e) {

            System.out.println(
                    "Write Error"
            );
        }


        // ========================================================
        // 17. ข้อควรจำ
        // ========================================================
        /*
         *
         * 1.
         *
         * BufferedWriter
         * ใช้เขียน Text
         *
         *
         * 2.
         *
         * Buffer
         * คือพื้นที่ชั่วคราว
         * สำหรับเก็บข้อมูล
         *
         *
         * 3.
         *
         * newLine()
         * ใช้ขึ้นบรรทัดใหม่
         *
         *
         * 4.
         *
         * flush()
         * ส่งข้อมูลใน Buffer
         * ออกไปยังปลายทาง
         *
         *
         * 5.
         *
         * close()
         * ปิด Resource
         *
         * และโดยทั่วไปจะ flush ก่อนปิด
         *
         *
         * 6.
         *
         * try-with-resources
         * ช่วยปิด Resource อัตโนมัติ
         *
         *
         * 7.
         *
         * FileWriter("file.txt")
         *
         * อาจเขียนทับข้อมูลเดิม
         *
         *
         * 8.
         *
         * FileWriter("file.txt", true)
         *
         * ใช้ Append
         *
         *
         * 9.
         *
         * BufferedWriter
         * สามารถครอบ
         * FileWriter ได้
         *
         *
         * ========================================================
         */


        System.out.println(
                "\n========== Program End =========="
        );
    }
}
