package a01basic;

public class A7Switch_case {

    public static void main(String[] args) {

        // ========================================================
        // Switch - Case
        // ========================================================
        // switch-case = คำสั่งที่ใช้เลือกการทำงานจากหลายตัวเลือก
        //
        // โดยจะนำ "ค่าของตัวแปร 1 ตัว"
        // ไปเปรียบเทียบกับหลาย ๆ กรณี (case)
        //
        // เหมาะกับกรณีที่เราต้องการตรวจสอบว่า
        // ตัวแปรมีค่าเป็นอะไร
        //
        // เช่น
        //
        // color = "Red"
        //
        // ถ้าเป็น Red
        //     -> Stop
        //
        // ถ้าเป็น Yellow
        //     -> Ready
        //
        // ถ้าเป็น Green
        //     -> Go
        //
        // ถ้าไม่ตรงกับอะไรเลย
        //     -> Unknown
        //
        //
        // switch เหมาะกับการตรวจสอบ "ค่าที่แน่นอน"
        //
        // ถ้าเป็นการตรวจสอบช่วงค่า เช่น
        //
        // age >= 18
        // score >= 80
        //
        // มักใช้ if-else จะเหมาะกว่า


        // ========================================================
        // 1. ตัวอย่าง String
        // ========================================================

        String color = "Red";

        switch (color) {

            case "Red" ->
                System.out.println("Stop");

            case "Yellow" ->
                System.out.println("Ready");

            case "Green" ->
                System.out.println("Go");

            default ->
                System.out.println("Unknown");
        }

        /*
         * color = "Red"
         *
         * Java จะนำ "Red"
         * ไปเปรียบเทียบกับแต่ละ case
         *
         * "Red"    -> ตรง ✅
         * "Yellow" -> ไม่ตรง
         * "Green"  -> ไม่ตรง
         *
         * ดังนั้นจะแสดง
         *
         * Stop
         */


        // ========================================================
        // 2. default
        // ========================================================
        /*
         * default = กรณีที่ไม่มี case ไหนตรง
         *
         * เปรียบเหมือน else ใน if-else
         *
         *
         * if-else
         *
         * if (color.equals("Red")) {
         *     System.out.println("Stop");
         * }
         * else {
         *     System.out.println("Unknown");
         * }
         *
         *
         * switch
         *
         * default -> System.out.println("Unknown");
         *
         *
         * default ไม่จำเป็นต้องมีก็ได้
         * แต่แนะนำให้มีเพื่อจัดการค่าที่เราไม่ได้คาดไว้
         */


        // ========================================================
        // 3. switch กับ int
        // ========================================================
        /*
         * switch ไม่ได้ใช้กับ String อย่างเดียว
         *
         * สามารถใช้กับ Primitive Type บางชนิด
         * เช่น int
         */

        int day = 3;

        switch (day) {

            case 1 ->
                System.out.println("Monday");

            case 2 ->
                System.out.println("Tuesday");

            case 3 ->
                System.out.println("Wednesday");

            case 4 ->
                System.out.println("Thursday");

            case 5 ->
                System.out.println("Friday");

            case 6 ->
                System.out.println("Saturday");

            case 7 ->
                System.out.println("Sunday");

            default ->
                System.out.println("Invalid day");
        }


        // ========================================================
        // 4. switch กับ char
        // ========================================================

        char grade = 'A';

        switch (grade) {

            case 'A' ->
                System.out.println("Excellent");

            case 'B' ->
                System.out.println("Good");

            case 'C' ->
                System.out.println("Average");

            case 'D' ->
                System.out.println("Poor");

            default ->
                System.out.println("Invalid grade");
        }


        // ========================================================
        // 5. หลาย case ที่ต้องการให้ทำงานเหมือนกัน
        // ========================================================
        /*
         * บางครั้งหลายค่าต้องการผลลัพธ์เดียวกัน
         *
         * เช่น
         *
         * Saturday
         * Sunday
         *
         * ทั้งคู่เป็นวันหยุด
         *
         * เราสามารถรวม case ได้
         */

        int weekendDay = 6;

        switch (weekendDay) {

            case 6, 7 ->
                System.out.println("Weekend");

            default ->
                System.out.println("Weekday");
        }


        // ========================================================
        // 6. switch expression
        // ========================================================
        /*
         * switch สามารถ "คืนค่า" ออกมาได้
         *
         * เรียกว่า switch expression
         *
         * เหมาะกับกรณีที่เราต้องการ
         * แปลงค่าหนึ่งให้เป็นอีกค่าหนึ่ง
         */

        String trafficLight = "Green";

        String action = switch (trafficLight) {

            case "Red" ->
                "Stop";

            case "Yellow" ->
                "Ready";

            case "Green" ->
                "Go";

            default ->
                "Unknown";
        };

        System.out.println("Action = " + action);


        // ========================================================
        // 7. switch + yield
        // ========================================================
        /*
         * ถ้า case มีหลายคำสั่ง
         * และเราต้องการคืนค่า
         *
         * สามารถใช้ yield ได้
         *
         * ตัวอย่าง
         */

        int score = 85;

        String result = switch (score / 10) {

            case 10, 9, 8 -> {
                System.out.println("Score is high");
                yield "A";
            }

            case 7 -> {
                yield "B";
            }

            case 6 -> {
                yield "C";
            }

            default -> {
                yield "Fail";
            }
        };

        System.out.println("Grade = " + result);


        // ========================================================
        // 8. switch แบบเก่า
        // ========================================================
        /*
         * Java รุ่นเก่าใช้ switch แบบนี้
         *
         * switch (color) {
         *
         *     case "Red":
         *         System.out.println("Stop");
         *         break;
         *
         *     case "Yellow":
         *         System.out.println("Ready");
         *         break;
         *
         *     default:
         *         System.out.println("Unknown");
         * }
         *
         *
         * จุดสำคัญคือ break
         *
         * ถ้าไม่มี break
         * โปรแกรมอาจทำงานต่อใน case ถัดไป
         *
         * เรียกว่า Fall-through
         *
         *
         * รูปแบบใหม่
         *
         * case "Red" -> ...
         *
         * ไม่จำเป็นต้องใช้ break
         *
         * และอ่านง่ายกว่า
         */


        // ========================================================
        // 9. switch vs if-else
        // ========================================================
        /*
         * ใช้ switch เมื่อ
         *
         * ต้องตรวจสอบค่าที่แน่นอน
         *
         * เช่น
         *
         * color == "Red"
         * day == 1
         * grade == 'A'
         *
         *
         * ใช้ if-else เมื่อ
         *
         * ต้องตรวจสอบเงื่อนไข
         *
         * เช่น
         *
         * age >= 18
         * score >= 80
         * height > 170
         *
         *
         * --------------------------------------------------------
         *
         * switch
         *      ↓
         * "ค่าอะไร?"
         *
         *
         * if
         *      ↓
         * "เงื่อนไขเป็นจริงไหม?"
         */


        // ========================================================
        // 10. ตัวอย่างเปรียบเทียบ
        // ========================================================

        int menu = 2;

        switch (menu) {

            case 1 ->
                System.out.println("Start Game");

            case 2 ->
                System.out.println("Setting");

            case 3 ->
                System.out.println("Exit");

            default ->
                System.out.println("Invalid Menu");
        }


        // ========================================================
        // Summary
        // ========================================================
        /*
         * ========================================================
         * สรุป Switch-Case
         * ========================================================
         *
         * switch
         *     = เลือกการทำงานจากค่าของตัวแปร
         *
         *
         * case
         *     = กรณีที่ต้องการตรวจสอบ
         *
         *
         * default
         *     = ทำงานเมื่อไม่มี case ไหนตรง
         *
         *
         * -> 
         *     = รูปแบบ switch แบบใหม่
         *       ไม่ต้องเขียน break
         *
         *
         * break
         *     = ใช้ใน switch แบบเก่า
         *       เพื่อหยุดการทำงานของ switch
         *
         *
         * yield
         *     = ใช้คืนค่าจาก block
         *       ใน switch expression
         *
         *
         * ========================================================
         * switch ใช้กับอะไรได้บ้าง?
         * ========================================================
         *
         * String
         * int
         * char
         * byte
         * short
         * enum
         *
         *
         * ========================================================
         * จำง่าย ๆ
         * ========================================================
         *
         * if
         *     = ตรวจสอบ "เงื่อนไข"
         *
         * switch
         *     = ตรวจสอบ "ค่าที่ตรงกัน"
         *
         *
         * ตัวอย่าง
         *
         * if (age >= 18)
         *     -> ตรวจสอบเงื่อนไข
         *
         * switch (day)
         *     -> ตรวจสอบว่า day เป็นค่าอะไร
         *
         * ========================================================
         */
    }
}


