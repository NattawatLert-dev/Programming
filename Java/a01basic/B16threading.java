package a01basic;

import java.util.Scanner;

public class B16threading {

    public static void main(String[] args) {

        // ========================================================
        // Threading
        // ========================================================
        // Thread = หน่วยการทำงานย่อยภายในโปรแกรม
        //
        // Threading ช่วยให้โปรแกรมสามารถทำงานหลายอย่าง โดยแต่ละงานสามารถทำงานแยกกันได้
        //
        //
        // ตัวอย่างเช่น
        //
        // โปรแกรมกำลัง
        //
        // 1. ดาวน์โหลดไฟล์
        // 2. แสดง Animation
        // 3. รับ Input จากผู้ใช้
        //
        // ถ้าทำทุกอย่างใน Thread เดียว งานหนึ่งอาจต้องรออีกงานหนึ่งเสร็จก่อน
        //
        // Threading สามารถช่วยแยกงานออกจากกันได้
        //
        //
        // ตัวอย่างงานที่มักใช้ Thread
        //
        // - File I/O
        // - Network Communication
        // - Background Tasks
        // - Download
        // - Animation
        // - งานที่ใช้เวลานาน
        //
        //
        // ========================================================
        // จำง่าย ๆ
        // ========================================================
        //
        // Thread = "เส้นทางการทำงานของโปรแกรม"
        //
        //
        // ถ้ามี Thread เดียว
        //
        // Task A
        //   ↓
        // Task B
        //   ↓
        // Task C
        //
        //
        // ถ้ามีหลาย Thread
        //
        // Thread 1 → Task A
        //
        // Thread 2 → Task B
        //
        // Thread 3 → Task C
        //
        //
        // สามารถทำงานแบบ Concurrent ได้
        //
        // ⚠️ Concurrent ไม่ได้แปลว่า CPU ต้องทำทุกอย่างพร้อมกันจริง ๆ
        //
        // CPU อาจสลับให้แต่ละ Thread ทำงาน แต่ละช่วงเวลา
        //
        // ถ้ามีหลาย Core บางงานสามารถทำพร้อมกันจริง ๆ ได้


        // ========================================================
        // วิธีสร้าง Thread
        // ========================================================
        //
        // วิธีที่ 1
        // extends Thread
        //
        //
        // วิธีที่ 2
        // implements Runnable
        //
        //
        // โดยทั่วไป Runnable เป็นวิธีที่ยืดหยุ่นกว่า
        // เพราะ Java ไม่สามารถ extends Class หลายตัวพร้อมกันได้
        //
        // ดังนั้นถ้า Class ของเราต้อง extends Class อื่นอยู่แล้ว
        // เราสามารถใช้ Runnable ได้


        // ========================================================
        // วิธีที่ 1: extends Thread
        // ========================================================
        // ตัวอย่างโครงสร้าง
        //
        //
        // class MyThread extends Thread {
        //
        //     @Override
        //     public void run() {
        //
        //         System.out.println("Thread is running");
        //     }
        // }
        //
        //
        // จากนั้น
        //
        // MyThread thread = new MyThread();
        //
        // thread.start();
        //
        //
        // ⚠️ สำคัญมาก
        //
        // ต้องใช้
        //
        // start()
        //
        // ไม่ใช่
        //
        // run()
        //
        //
        // start() = ขอให้ JVM เริ่ม Thread ใหม่
        //
        //
        // run() = เรียก Method ธรรมดา
        //
        // ถ้าเรียก run() โดยตรง จะไม่ได้สร้าง Thread ใหม่


        // ========================================================
        // วิธีที่ 2: Runnable
        // ========================================================
        // Runnable = Interface ที่ใช้กำหนดงาน ที่ต้องการให้ Thread ทำ
        //
        //
        // เราสามารถสร้าง Runnable แล้วส่งให้ Thread
        //
        //
        // รูปแบบ
        //
        // Runnable task = () -> {
        //
        //     // งานที่ต้องการทำ
        //
        // };
        //
        //
        // Thread thread = new Thread(task);
        //
        // thread.start();


        // ========================================================
        // ตัวอย่าง Thread ด้วย Runnable
        // ========================================================

        Runnable task = () -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        "Background Thread: " + i
                );

                try {

                    Thread.sleep(1000);

                }
                catch (InterruptedException e) {

                    System.out.println(
                            "Background Thread was interrupted"
                    );

                    // คืนสถานะ interrupted
                    Thread.currentThread().interrupt();

                    return;
                }
            }
        };


        // สร้าง Thread
        // แล้วนำ task ไปให้ Thread ทำ

        Thread thread = new Thread(task);


        // ========================================================
        // start()
        // ========================================================
        // start() = เริ่ม Thread ใหม่
        //
        //
        // หลังจากเรียก start()
        // Thread จะเริ่มทำงานใน run()
        //
        //
        // Main Thread
        //      |
        //      +----> Background Thread
        //
        //
        // Main Thread และ Background Thread
        // สามารถทำงานแยกจากกันได้


        thread.start();


        // ========================================================
        // Main Thread
        // ========================================================
        // ขณะที่ Background Thread กำลังทำงาน Main Thread ก็สามารถทำงานต่อได้
        //
        //
        // ดังนั้นข้อความด้านล่าง
        // อาจแสดงสลับกับข้อความของ Background Thread


        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Main Thread: " + i
            );

            try {

                Thread.sleep(500);

            }
            catch (InterruptedException e) {

                System.out.println(
                        "Main Thread was interrupted"
                );

                Thread.currentThread().interrupt();

                return;
            }
        }


        // ========================================================
        // join()
        // ========================================================
        // join() = ให้ Thread ปัจจุบัน รอ Thread ที่ระบุทำงานเสร็จ
        //
        //
        // เช่น
        //
        // thread.join();
        //
        //
        // หมายถึง
        //
        // "รอให้ thread ทำงานเสร็จก่อน
        //  แล้วค่อยทำคำสั่งถัดไป"
        //
        //
        // เหมาะเมื่อเราต้องการ
        // รอผลจาก Thread ก่อนดำเนินการต่อ


        try {

            thread.join();

        }
        catch (InterruptedException e) {

            System.out.println(
                    "Main Thread was interrupted"
            );

            Thread.currentThread().interrupt();

            return;
        }


        System.out.println(
                "All threads are finished"
        );


        // ========================================================
        // Thread.sleep()
        // ========================================================
        // sleep() = ทำให้ Thread ปัจจุบันหยุดชั่วคราว
        //
        //
        // เช่น
        //
        // Thread.sleep(1000);
        //
        // = หยุดประมาณ 1 วินาที
        //
        //
        // เพราะ
        //
        // 1000 milliseconds
        // = 1 second
        //
        //
        // ⚠️ sleep() ไม่ได้สร้าง Thread ใหม่
        //
        // sleep() เพียงแค่ทำให้
        // "Thread ที่กำลังทำงานอยู่"
        // หยุดชั่วคราว


        // ========================================================
        // ตัวอย่าง Countdown
        // ========================================================
        // ตัวอย่างนี้ใช้ Thread เดียว
        // เพื่อทำ Countdown


        System.out.println();
        System.out.println("Countdown:");

        for (int i = 3; i >= 1; i--) {

            System.out.println(i);

            try {

                Thread.sleep(1000);

            }
            catch (InterruptedException e) {

                Thread.currentThread().interrupt();

                return;
            }
        }

        System.out.println("Go!");


        // ========================================================
        // Thread.currentThread()
        // ========================================================
        // currentThread() = คืนค่า Thread ที่กำลังทำงานอยู่
        //
        //
        // สามารถใช้ดูชื่อ Thread ได้


        Thread current = Thread.currentThread();

        System.out.println(
                "Current Thread = " + current.getName()
        );


        // ========================================================
        // ตั้งชื่อ Thread
        // ========================================================
        // สามารถกำหนดชื่อ Thread ได้
        //
        // เพื่อช่วยให้ Debug โปรแกรมง่ายขึ้น


        Thread namedThread = new Thread(
                () -> {
                    System.out.println(
                            "Hello from another thread"
                    );
                }
        );

        namedThread.setName("MyThread");

        namedThread.start();


        // รอให้ namedThread ทำงานเสร็จ

        try {

            namedThread.join();

        }
        catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            return;
        }


        // ========================================================
        // ตัวอย่าง Input
        // ========================================================
        // Scanner สามารถใช้รับข้อมูลจากผู้ใช้
        //
        // แต่ถ้าเราต้องการให้
        //
        // Countdown
        // +
        // รับ Input
        //
        // ทำงานพร้อมกันจริง ๆ
        //
        // เราต้องแยกงานออกเป็นหลาย Thread
        //
        //
        // ตัวอย่างด้านล่างเป็นแนวคิด
        // ว่า Input และ Timer สามารถแยกกันได้


        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(
                "Enter your name:"
        );

        String name = scanner.nextLine();

        System.out.println(
                "Hello " + name
        );

        scanner.close();


        // ========================================================
        // Summary
        // ========================================================
        /*
         * ========================================================
         * THREADING
         * ========================================================
         *
         * Thread = หน่วยการทำงานย่อยของโปรแกรม
         *
         *
         * Threading = การจัดการหลาย Thread
         *
         *
         * ========================================================
         * วิธีสร้าง Thread
         * ========================================================
         *
         * 1. extends Thread
         *
         * 2. implements Runnable
         *
         *
         * Runnable
         * มักยืดหยุ่นกว่า
         *
         *
         * ========================================================
         * Method สำคัญ
         * ========================================================
         *
         *
         * start() = เริ่ม Thread ใหม่
         *
         *
         * run() = งานที่ Thread จะทำ
         *
         *
         * sleep() = หยุด Thread ปัจจุบันชั่วคราว
         *
         *
         * join() = รอ Thread อื่นให้ทำงานเสร็จ
         *
         *
         * currentThread() = ดู Thread ที่กำลังทำงาน
         *
         *
         * ========================================================
         */
    }
}