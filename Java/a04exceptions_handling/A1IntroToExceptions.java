package a04exceptions_handling;

/*
 * ============================================================
 * A1IntroToExceptions
 * ============================================================
 *
 * Exception Handling
 * ============================================================
 *
 * Exception คือเหตุการณ์ผิดปกติที่เกิดขึ้นขณะโปรแกรมกำลังทำงาน
 * และอาจทำให้โปรแกรมทำงานต่อไม่ได้ตามปกติ
 *
 *
 * ตัวอย่าง:
 *
 * 10 / 0
 * → ArithmeticException
 *
 * เข้าถึง Array ที่ไม่มีอยู่
 * → ArrayIndexOutOfBoundsException
 *
 * แปลง String "abc" เป็น int
 * → NumberFormatException
 *
 *
 * ============================================================
 * ทำไมต้องจัดการ Exception?
 * ============================================================
 *
 * ถ้าไม่จัดการ:
 *
 *     โปรแกรมอาจหยุดทำงาน
 *
 * ถ้าจัดการ:
 *
 *     โปรแกรมสามารถแจ้งผู้ใช้
 *     หรือทำงานส่วนอื่นต่อได้
 *
 *
 * แนวคิด:
 *
 *     ป้องกันโปรแกรม Crash
 *            ↓
 *     ตรวจจับ Exception
 *            ↓
 *     จัดการอย่างเหมาะสม
 *
 * ============================================================
 */

public class A1IntroToExceptions {

    public static void main(String[] args) {


        // ========================================================
        // 1. Exception คืออะไร?
        // ========================================================
        /*
         *
         * Exception
         * = เหตุการณ์ผิดปกติที่เกิดขึ้นระหว่าง Runtime
         *
         *
         * ตัวอย่าง:
         *
         * int x = 10 / 0;
         *
         * Java ไม่สามารถหารจำนวนเต็มด้วย 0 ได้
         *
         * จึงเกิด:
         *
         * ArithmeticException
         *
         */


        // ========================================================
        // 2. โปรแกรมที่เกิด Exception
        // ========================================================
        /*
         *
         * ถ้าเขียน:
         *
         * int x = 10 / 0;
         *
         * โปรแกรมจะเกิด Exception
         *
         * และคำสั่งหลังจากนั้นจะไม่ทำงาน
         *
         */


        // ========================================================
        // 3. try...catch
        // ========================================================
        //
        // try
        // → ใส่โค้ดที่ "อาจเกิด Exception"
        //
        // catch
        // → จัดการ Exception ที่เกิดขึ้น


        try {

            int x = 10 / 0;

            System.out.println(x);

        } catch (Exception e) {

            System.out.println(
                    "เกิดข้อผิดพลาด!"
            );
        }


        /*
         * Output:
         *
         * เกิดข้อผิดพลาด!
         *
         *
         * โปรแกรมไม่หยุดทันที
         * เพราะ Exception ถูก catch ไว้
         */


        System.out.println(
                "Program End"
        );

        /*
         * Output:
         *
         * Program End
         *
         *
         * แสดงว่าโปรแกรมยังสามารถทำงานต่อได้
         */


        // ========================================================
        // 4. catch Exception แบบเจาะจง
        // ========================================================
        //
        // ไม่จำเป็นต้อง catch Exception
        // แบบกว้างเสมอไป
        //
        // ควรจับ Exception ที่เราคาดว่าจะเกิด
        // ให้ตรงประเภทมากที่สุด


        try {

            int[] arr = {1, 2};

            System.out.println(
                    arr[5]
            );

        } catch (
                ArrayIndexOutOfBoundsException e
        ) {

            System.out.println(
                    "Array Error"
            );
        }


        // ========================================================
        // 5. หลาย catch
        // ========================================================
        //
        // try หนึ่งตัว
        // สามารถมี catch ได้หลายตัว


        try {

            int[] arr = {1, 2};

            System.out.println(
                    arr[5]
            );

        }

        catch (
                ArrayIndexOutOfBoundsException e
        ) {

            System.out.println(
                    "Array Error"
            );
        }

        catch (
                Exception e
        ) {

            System.out.println(
                    "Other Error"
            );
        }


        // ========================================================
        // 6. ลำดับของ catch สำคัญมาก
        // ========================================================
        /*
         *
         * Exception
         * เป็น Parent Class ที่กว้าง
         *
         * ArrayIndexOutOfBoundsException
         * เป็น Child Class
         *
         *
         * ดังนั้น:
         *
         * ถูกต้อง:
         *
         * catch (ArrayIndexOutOfBoundsException e)
         * catch (Exception e)
         *
         *
         * ผิด:
         *
         * catch (Exception e)
         * catch (ArrayIndexOutOfBoundsException e)
         *
         *
         * เพราะ Exception จับได้หมดก่อน
         * ทำให้ catch ตัวที่เจาะจงไม่มีโอกาสทำงาน
         */


        // ========================================================
        // 7. finally
        // ========================================================
        //
        // finally จะทำงานหลัง try/catch
        //
        // โดยทั่วไปใช้สำหรับงาน Cleanup
        //
        // เช่น:
        //
        // ปิดไฟล์
        // ปิด Database Connection
        // ปิด Network Connection
        //
        //
        // finally จะทำงานไม่ว่า
        // จะเกิด Exception หรือไม่


        try {

            int y = 10 / 2;

            System.out.println(y);

        }

        catch (Exception e) {

            System.out.println(
                    "Error"
            );

        }

        finally {

            System.out.println(
                    "Finish"
            );
        }


        /*
         * Output:
         *
         * 5
         * Finish
         */


        // ========================================================
        // 8. finally แม้เกิด Exception
        // ========================================================


        try {

            int z = 10 / 0;

            System.out.println(z);

        }

        catch (Exception e) {

            System.out.println(
                    "Error"
            );

        }

        finally {

            System.out.println(
                    "Finish"
            );
        }


        /*
         * Output:
         *
         * Error
         * Finish
         */


        // ========================================================
        // 9. e.getMessage()
        // ========================================================
        //
        // Exception object เก็บข้อมูลเกี่ยวกับข้อผิดพลาด
        //
        // getMessage()
        // → เอาข้อความของ Exception


        try {

            int age = -5;

            if (age < 0) {

                throw new Exception(
                        "Age invalid"
                );
            }

        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }


        /*
         * Output:
         *
         * Age invalid
         */


        // ========================================================
        // 10. e.printStackTrace()
        // ========================================================
        //
        // ใช้แสดงรายละเอียดของ Exception
        // รวมถึงตำแหน่งที่เกิดปัญหา
        //
        // เหมาะสำหรับ Debug
        //
        // ตัวอย่าง:
        //
        // e.printStackTrace();
        //
        // จะเห็นประมาณ:
        //
        // java.lang.ArithmeticException: / by zero
        //     at ...
        //
        //
        // ไม่ควรใช้แทนข้อความสำหรับ User
        // ในโปรแกรม Production ทุกกรณี


        try {

            int a = 10 / 0;

        }

        catch (ArithmeticException e) {

            System.out.println(
                    "เกิดข้อผิดพลาดในการคำนวณ"
            );

            // สำหรับ Debug:
            // e.printStackTrace();
        }


        // ========================================================
        // 11. throw
        // ========================================================
        //
        // throw
        // = ใช้ "โยน Exception" ด้วยตัวเราเอง
        //
        //
        // รูปแบบ:
        //
        // throw new Exception("message");


        try {

            int age = -5;

            if (age < 0) {

                throw new Exception(
                        "อายุต้องไม่ติดลบ"
                );
            }

            System.out.println(
                    "Age: " + age
            );

        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }


        // ========================================================
        // 12. throw ทำงานอย่างไร?
        // ========================================================
        /*
         *
         * เมื่อเจอ:
         *
         * throw new Exception(...)
         *
         *
         * โปรแกรมจะ:
         *
         * 1. สร้าง Exception
         *
         * 2. หยุดการทำงานปกติของจุดนั้น
         *
         * 3. ส่ง Exception ไปหา catch
         *
         *
         * ภาพ:
         *
         * if (ผิด)
         *     ↓
         * throw Exception
         *     ↓
         * catch
         *     ↓
         * จัดการ Error
         *
         */


        // ========================================================
        // 13. throws
        // ========================================================
        //
        // throws ใช้ประกาศว่า
        // Method นี้ "อาจโยน Exception"
        //
        //
        // ตัวอย่าง:
        //
        // static void withdraw(int money)
        //         throws Exception
        //
        //
        // หมายความว่า:
        //
        // Method นี้อาจเกิด Exception
        // และผู้เรียก Method ต้องจัดการ


        try {

            withdraw(-100);

        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }


        // ========================================================
        // 14. throw vs throws
        // ========================================================
        /*
         *
         * throw
         * -----------------------------
         * ใช้ "โยน Exception"
         *
         *
         * ตัวอย่าง:
         *
         * throw new Exception(
         *     "Invalid"
         * );
         *
         *
         * throws
         * -----------------------------
         * ใช้ "ประกาศ" ว่า Method
         * อาจโยน Exception
         *
         *
         * ตัวอย่าง:
         *
         * void test() throws Exception
         *
         *
         * จำง่าย:
         *
         * throw
         * → โยนจริง
         *
         * throws
         * → ประกาศว่าอาจโยน
         *
         */


        // ========================================================
        // 15. Method withdraw()
        // ========================================================
        //
        // Method นี้ประกาศ:
        //
        // throws Exception
        //
        // เพราะภายในมี:
        //
        // throw new Exception(...)


        // ========================================================
        // 16. ArithmeticException
        // ========================================================
        //
        // เกิดจากการคำนวณผิด เช่น
        // หารจำนวนเต็มด้วย 0


        try {

            int result = 10 / 0;

            System.out.println(result);

        }

        catch (ArithmeticException e) {

            System.out.println(
                    "ไม่สามารถหารด้วย 0 ได้"
            );
        }


        // ========================================================
        // 17. ArrayIndexOutOfBoundsException
        // ========================================================
        //
        // Array มี Index เริ่มจาก 0
        //
        // เช่น:
        //
        // int[] numbers = {10, 20, 30};
        //
        // Index:
        //
        // 0 → 10
        // 1 → 20
        // 2 → 30
        //
        //
        // ถ้า:
        //
        // numbers[3]
        //
        // จะเกิด Exception


        try {

            int[] numbers = {
                    10,
                    20,
                    30
            };

            System.out.println(
                    numbers[3]
            );

        }

        catch (
                ArrayIndexOutOfBoundsException e
        ) {

            System.out.println(
                    "ไม่มี Index นี้ใน Array"
            );
        }


        // ========================================================
        // 18. NumberFormatException
        // ========================================================
        //
        // เกิดเมื่อพยายามแปลง String
        // ที่ไม่ใช่ตัวเลขให้เป็น Integer


        try {

            String text = "ABC";

            int number =
                    Integer.parseInt(text);

            System.out.println(number);

        }

        catch (NumberFormatException e) {

            System.out.println(
                    "ข้อความนี้ไม่ใช่ตัวเลข"
            );
        }


        // ========================================================
        // 19. NullPointerException
        // ========================================================
        //
        // เกิดเมื่อพยายามเรียก Method
        // หรือเข้าถึงข้อมูลจาก Object ที่เป็น null


        try {

            String name = null;

            System.out.println(
                    name.length()
            );

        }

        catch (NullPointerException e) {

            System.out.println(
                    "ตัวแปรเป็น null"
            );
        }


        // ========================================================
        // 20. Exception Hierarchy
        // ========================================================
        /*
         *
         * Java มีโครงสร้างประมาณนี้:
         *
         *
         * Throwable
         *     │
         *     ├── Error
         *     │
         *     └── Exception
         *           │
         *           ├── RuntimeException
         *           │      ├── ArithmeticException
         *           │      ├── NullPointerException
         *           │      ├── NumberFormatException
         *           │      └── ArrayIndexOutOfBoundsException
         *           │
         *           └── Checked Exceptions
         *
         *
         * ======================================================
         *
         * Error
         * → ปัญหาระดับร้ายแรงของระบบ
         *
         * เช่น:
         *
         * OutOfMemoryError
         *
         *
         * โดยทั่วไปเราไม่ควรพยายาม catch Error
         * เพื่อแก้ปัญหาทั่วไป
         *
         *
         * Exception
         * → ปัญหาที่โปรแกรมสามารถจัดการได้
         *
         */


        // ========================================================
        // 21. Checked vs Unchecked Exception
        // ========================================================
        /*
         *
         * Java แบ่ง Exception ที่ควรรู้เป็น 2 กลุ่มใหญ่:
         *
         *
         * --------------------------------------------------------
         * Checked Exception
         * --------------------------------------------------------
         *
         * Compiler บังคับให้เราจัดการ
         *
         * ตัวอย่าง:
         *
         * IOException
         * SQLException
         * FileNotFoundException
         *
         *
         * เราต้อง:
         *
         * try-catch
         *
         * หรือ
         *
         * throws
         *
         *
         * --------------------------------------------------------
         * Unchecked Exception
         * --------------------------------------------------------
         *
         * ส่วนใหญ่เป็น RuntimeException
         *
         * Compiler ไม่บังคับให้ catch
         *
         * ตัวอย่าง:
         *
         * ArithmeticException
         * NullPointerException
         * NumberFormatException
         * ArrayIndexOutOfBoundsException
         *
         */


        // ========================================================
        // 22. try-catch สามารถมี finally ได้
        // ========================================================
        /*
         *
         * รูปแบบ:
         *
         *
         * try {
         *
         *     // โค้ดที่อาจเกิด Exception
         *
         * }
         *
         * catch (Exception e) {
         *
         *     // จัดการ Exception
         *
         * }
         *
         * finally {
         *
         *     // Cleanup
         *
         * }
         *
         */


        // ========================================================
        // 23. try สามารถมี catch หรือ finally
        // ========================================================
        /*
         *
         * ใช้ได้:
         *
         * try + catch
         *
         * try + finally
         *
         * try + catch + finally
         *
         *
         * แต่ try เดี่ยว ๆ ไม่ได้
         *
         */


        // ========================================================
        // 24. สร้าง Custom Exception
        // ========================================================
        //
        // ในโปรแกรมจริง เราสามารถสร้าง Exception
        // ของเราเองได้
        //
        // ตัวอย่าง:
        //
        // InvalidAgeException
        //
        //
        // ดู Class ด้านล่างของไฟล์


        try {

            checkAge(15);

        }

        catch (InvalidAgeException e) {

            System.out.println(
                    "\nCustom Exception: "
                    + e.getMessage()
            );
        }


        // ========================================================
        // 25. Exception Handling ที่ดี
        // ========================================================
        /*
         *
         * หลักการ:
         *
         *
         * 1. อย่าใช้ catch (Exception e)
         *    ทุกที่โดยไม่มีเหตุผล
         *
         *
         * 2. จับ Exception ให้ตรงประเภท
         *
         * เช่น:
         *
         * catch (NumberFormatException e)
         *
         * ดีกว่า:
         *
         * catch (Exception e)
         *
         * ถ้าเรารู้แน่นอนว่าอาจเกิด
         * NumberFormatException
         *
         *
         * 3. อย่าใช้ Exception เป็นตัวควบคุม
         *    Logic ปกติของโปรแกรม
         *
         *
         * 4. ข้อความ Error ควรเข้าใจง่าย
         *
         *
         * 5. อย่ากลืน Exception ทิ้ง
         *
         * เช่น:
         *
         * catch (Exception e) {
         * }
         *
         * แบบนี้ไม่ดี เพราะเราไม่รู้ว่า
         * เกิดอะไรขึ้น
         *
         *
         * 6. ใช้ finally หรือ try-with-resources
         *    สำหรับ Cleanup ที่เหมาะสม
         *
         */


        // ========================================================
        // 26. สรุปภาพรวม
        // ========================================================
        /*
         *
         *                    Exception
         *                         │
         *                         ↓
         *                    try
         *                         │
         *              เกิด Exception?
         *                    /          \
         *                  ไม่            ใช่
         *                  ↓              ↓
         *              ทำต่อ          catch
         *                                 │
         *                                 ↓
         *                             จัดการ Error
         *                                 │
         *                                 ↓
         *                              finally
         *
         *
         * ========================================================
         *
         * try
         * → โค้ดที่อาจเกิด Exception
         *
         * catch
         * → จัดการ Exception
         *
         * finally
         * → Cleanup / ทำงานท้ายสุด
         *
         * throw
         * → โยน Exception ด้วยตัวเอง
         *
         * throws
         * → ประกาศว่า Method อาจโยน Exception
         *
         * ========================================================
         */


        System.out.println(
                "\n========== Program End =========="
        );
    }


    // ============================================================
    // Method: withdraw()
    // ============================================================
    //
    // throws Exception
    // → ประกาศว่า Method นี้อาจเกิด Exception
    //
    // ถ้าเงิน <= 0
    // → throw Exception


    static void withdraw(int money)
            throws Exception {

        if (money <= 0) {

            throw new Exception(
                    "จำนวนเงินต้องมากกว่า 0"
            );
        }

        System.out.println(
                "ถอนเงิน "
                + money
                + " บาท"
        );
    }


    // ============================================================
    // Custom Exception
    // ============================================================


    static void checkAge(int age)
            throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "ต้องมีอายุอย่างน้อย 18 ปี"
            );
        }

        System.out.println(
                "สามารถใช้งานได้"
        );
    }
}


/*
 * ================================================================
 * Custom Exception Class
 * ================================================================
 *
 * Exception ของเราเอง
 *
 * extends Exception
 * → ทำให้ Class นี้เป็น Exception
 *
 */


class InvalidAgeException
        extends Exception {

    public InvalidAgeException(
            String message) {

        super(message);
    }
}