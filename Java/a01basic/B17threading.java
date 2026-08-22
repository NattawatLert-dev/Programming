package a01basic;

import java.util.Scanner;

public class B17threading {
    public static void main(String[] args) {
        
        // Threading = ช่วยให้โปรแกรมสามารถทำงานหลาย ๆ งานพร้อมกันได้ (ทำงานแบบหลายเธรด)
        //             ช่วยเพิ่มประสิทธิภาพสำหรับงานที่ใช้เวลานาน
        //             (เช่น การอ่าน/เขียนไฟล์ (File I/O),
        //              การสื่อสารผ่านเครือข่าย (Network Communication),
        //              หรือการทำงานเบื้องหลัง (Background Tasks))

        // วิธีการสร้าง Thread
        // วิธีที่ 1: สืบทอด (Extend) คลาส Thread (ง่ายกว่า)
        // วิธีที่ 2: นำไปใช้ (Implement) อินเทอร์เฟซ Runnable (เป็นวิธีที่ดีกว่า)

        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");

        for (int i = 0; i <= 5; i++) {

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 5){
                System.out.println("Time's up!");
            }
        }

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello " + name);

    }
}
