package a01basic;

/**
 * ============================================================
 * A3 - Global & Local Variables (Variable Scope)
 * ============================================================
 *
 * บทนี้เรียนรู้เรื่อง
 *
 * 1. Variable Scope คืออะไร?
 * 2. Global Variable / Class Variable
 * 3. Local Variable
 * 4. Method Scope
 * 5. Block Scope
 * 6. Method Parameter
 * 7. static กับ Variable
 * 8. สิ่งที่ควรระวังเรื่อง Scope
 *
 * ============================================================
 */

public class A3Global_Local_Variables {

    // ============================================================
    // 1. GLOBAL / CLASS VARIABLE
    // ============================================================
    /*
     * ตัวแปรนี้ประกาศ "นอก Method"
     *
     * ดังนั้น Method ต่าง ๆ ภายใน Class
     * สามารถเข้าถึงตัวแปรนี้ได้
     *
     * ใน Java มักเรียกว่า
     *
     * Class Variable
     * หรือ
     * Field
     *
     * ถ้าใส่ static จะสามารถเรียกใช้ผ่าน Class ได้
     * โดยไม่ต้องสร้าง Object
     */

    static int a = 20;


    public static void main(String[] args) {

        // ========================================================
        // 2. LOCAL VARIABLE
        // ========================================================
        /*
         * ตัวแปร b ถูกประกาศอยู่ภายใน main()
         *
         * ดังนั้น b เป็น Local Variable
         *
         * b สามารถใช้ได้เฉพาะภายใน main()
         *
         * Method อื่นจะไม่สามารถใช้ b ได้
         */

        int b = 20;


        System.out.println("===== MAIN METHOD =====");

        // สามารถใช้ a ได้
        System.out.println("Global/Class variable a = " + a);

        // สามารถใช้ b ได้
        System.out.println("Local variable b = " + b);


        // เรียก Method show()
        show();


        // ========================================================
        // 3. BLOCK SCOPE
        // ========================================================
        /*
         * ตัวแปรที่ประกาศอยู่ภายใน {}
         * จะสามารถใช้งานได้เฉพาะใน {} นั้น
         */

        {
            int c = 30;

            System.out.println("Block variable c = " + c);

            // สามารถใช้ a และ b ได้
            // เพราะ block นี้อยู่ภายใน main()

            System.out.println("a inside block = " + a);
            System.out.println("b inside block = " + b);
        }

        /*
         * ตรงนี้ไม่สามารถใช้ c ได้แล้ว
         *
         * เพราะ c เกิดขึ้นภายใน {}
         * และหมดอายุเมื่อออกจาก {}
         *
         * System.out.println(c); // ❌ Error
         */


        // ========================================================
        // 4. LOCAL VARIABLE อีกตัวอย่าง
        // ========================================================

        int score = 80;

        if (score >= 50) {

            // ตัวแปรนี้อยู่ใน if block
            int result = 1;

            System.out.println("Result inside if = " + result);
        }

        /*
         * result ใช้ตรงนี้ไม่ได้
         *
         * System.out.println(result); // ❌ Error
         *
         * เพราะ result อยู่ใน {} ของ if
         */


        // ========================================================
        // 5. METHOD PARAMETER
        // ========================================================
        /*
         * Parameter ก็ถือเป็น Local Variable
         * ของ Method นั้น ๆ
         *
         * ตัวอย่าง:
         *
         * showScore(90);
         *
         * 90 ถูกส่งเข้าไปใน parameter score
         */

        showScore(90);

        // score ที่อยู่ใน showScore()
        // ไม่สามารถนำมาใช้ใน main() ได้

    }


    // ============================================================
    // 6. METHOD SHOW()
    // ============================================================

    public static void show() {

        System.out.println();
        System.out.println("===== SHOW METHOD =====");

        /*
         * สามารถใช้ a ได้
         *
         * เพราะ a เป็น Class Variable
         * และเป็น static
         */

        System.out.println("Global/Class variable a = " + a);


        /*
         * แต่ไม่สามารถใช้ b ได้
         *
         * เพราะ b เป็น Local Variable
         * ของ main()
         *
         * b มี Scope อยู่เฉพาะ main()
         *
         * System.out.println(b); // ❌ Error
         */
    }


    // ============================================================
    // 7. METHOD PARAMETER
    // ============================================================

    public static void showScore(int score) {

        /*
         * score คือ Parameter
         *
         * score สามารถใช้ได้เฉพาะภายใน Method นี้
         */

        System.out.println();
        System.out.println("===== SHOW SCORE METHOD =====");
        System.out.println("Score = " + score);

        /*
         * score เป็น Local Variable ของ Method นี้
         */
    }


    // ============================================================
    // 8. อีกตัวอย่างของ Scope
    // ============================================================

    public static void exampleScope() {

        int x = 100;

        System.out.println("x = " + x);

        if (true) {

            int y = 200;

            System.out.println("x inside if = " + x);
            System.out.println("y inside if = " + y);
        }

        /*
         * x ยังใช้ได้
         *
         * เพราะ x ถูกสร้างใน Method
         * และ if block อยู่ภายใน Method เดียวกัน
         */

        System.out.println("x outside if = " + x);


        /*
         * แต่ y ใช้ไม่ได้
         *
         * เพราะ y ถูกสร้างใน if block
         *
         * System.out.println(y); // ❌ Error
         */
    }


    // ============================================================
    // 9. FINAL SUMMARY
    // ============================================================
    /*
     * ============================================================
     * สรุป
     * ============================================================
     *
     * 1. Scope = บริเวณที่ตัวแปรสามารถถูกเรียกใช้งานได้
     *
     *
     * 2. Class Variable / Field
     *
     *    static int a = 20;
     *
     *    ประกาศนอก Method
     *
     *    Method ต่าง ๆ สามารถเข้าถึงได้
     *    ถ้าเข้าถึงในบริบท static ได้อย่างถูกต้อง
     *
     *    
     * 3. Local Variable
     *
     *    int b = 20;
     *
     *    ประกาศภายใน Method ใช้ได้เฉพาะ Method นั้น
     *
     *
     * 4. Block Variable
     *
     *    {
     *        int c = 30;
     *    }
     *
     *    ใช้ได้เฉพาะภายใน {}
     *
     *
     * 5. Parameter
     *
     *    showScore(int score)
     *
     *    score ใช้ได้เฉพาะใน Method showScore()
     *
     *
     * 6. static
     *
     *    static ทำให้ Field/Method เป็นของ Class
     *    และสามารถใช้งานโดยไม่ต้องสร้าง Object
     *
     * ============================================================
     */
}