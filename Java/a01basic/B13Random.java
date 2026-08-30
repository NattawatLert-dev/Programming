package a01basic;

import java.util.Random;

public class B13Random {

    public static void main(String[] args) {

        // ========================================================
        // Random
        // ========================================================
        // Random = Class สำหรับสร้างค่าที่มีลักษณะเป็นการสุ่ม
        //
        // ต้อง import
        //
        // import java.util.Random;
        //
        // จากนั้นสร้าง Object
        //
        // Random random = new Random();


        Random random = new Random();


        // ========================================================
        // สุ่มจำนวนเต็ม
        // ========================================================
        // nextInt(origin, bound)
        //
        // origin = ค่าต่ำสุด (รวม)
        // bound  = ค่าสูงสุด (ไม่รวม)
        //
        //
        // ถ้าต้องการ 1 - 6
        //
        // random.nextInt(1, 7)
        //
        // เพราะ 7 ไม่ถูกนำมาสุ่ม
        //
        // จึงเหลือ
        //
        // 1, 2, 3, 4, 5, 6


        int number = random.nextInt(1, 7);

        System.out.println(number);


        // ========================================================
        // ตัวอย่าง
        // ========================================================

        int dice = random.nextInt(1, 7);

        System.out.println("Dice = " + dice);


        // สุ่มเลข 1 - 100

        int score = random.nextInt(1, 101);

        System.out.println("Random score = " + score);
    }
}