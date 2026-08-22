package a01basic;

public class A9Loop {
    public static void main(String[] args) {
        
        // loop = โครงสร้างควบคุมการทำงาน (Control Flow) ที่ใช้สำหรับ ทำคำสั่งเดิมซ้ำๆ จนกว่าจะเป็นไปตามเงื่อนไขที่กำหนด

        //for Loop (ใช้เมื่อ รู้จำนวนรอบ)
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while Loop (ใช้เมื่อ ไม่รู้ว่าจะวนกี่รอบ)

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do-while Loop (ต่างจาก while ตรงที่ ทำงานก่อน 1 ครั้ง แล้วค่อยตรวจเงื่อนไข)

        int j = 1;
        
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // Nested Loop (ลูปซ้อนลูป) = การนำ Loop ไปไว้ข้างในอีก Loop หนึ่ง

        for (int t = 1; t <= 3; t++) {
            for (int k = 1; k <= 2; k++) {
                System.out.println(t + " " + k);
            }
        }

        // break และ continue ทั้ง break และ continue ใช้สำหรับ ควบคุมการทำงานของ Loop แต่ทำหน้าที่ต่างกัน

        // break = เมื่อโปรแกรมเจอ break จะออกจาก Loop ทันทีไม่สนใจว่าเหลืออีกกี่รอบ
         
        for (int l = 1; l <= 10; l++) {
            
            if (l == 5) {
                break;
            }
        
            System.out.println(i);
        }

        // continue = เมื่อเจอ continue จะข้ามคำสั่งที่เหลือในรอบนั้นแล้วไปเริ่มรอบใหม
         
        for (int p = 1; p <= 5; p++) {
            
            if (i == 3) {
                continue;
            }
            
            System.out.println(i);
        }

    }
}
