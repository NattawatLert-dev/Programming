package a01basic;

import java.util.Timer;
import java.util.TimerTask;

public class B16Timertasks {
    public static void main(String[] args) {

        // Timer = คลาสที่ใช้สำหรับกำหนดเวลาในการทำงานของ Task
        //         โดยสามารถให้ทำงานในเวลาที่กำหนด หรือทำงานซ้ำเป็นช่วงๆ ได้
        //         เหมาะสำหรับ: การส่งการแจ้งเตือน (Notifications),
        //                     การอัปเดตตามกำหนดเวลา (Scheduled Updates),
        //                     หรือการทำงานซ้ำๆ (Repetitive Actions)


        // TimerTask = คลาสที่ใช้แทน "งาน (Task)" ที่จะถูก Timer เรียกใช้งาน
        //             คุณจะต้องสืบทอด (extends) คลาส TimerTask
        //             เพื่อกำหนดรายละเอียดของงานที่ต้องการให้ทำ
        //             โดยสร้างคลาสลูก (Subclass) ของ TimerTask
        //             และใช้ @Override เมธอด run()
    
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}

// scheduleAtFixedRate() = เมธอดของ Timer ที่ใช้กำหนดให้ TimerTask
//                         ทำงานซ้ำๆ ตามช่วงเวลาที่กำหนด (Fixed Rate)
//                         โดยพยายามรักษาความถี่ในการทำงานให้สม่ำเสมอ
//
// รูปแบบ:
// timer.scheduleAtFixedRate(task, delay, period);
//
// task   = TimerTask ที่ต้องการให้ทำงาน
// delay  = เวลาที่รอก่อนเริ่มทำงานครั้งแรก (มิลลิวินาที)
// period = ช่วงเวลาระหว่างการทำงานแต่ละครั้ง (มิลลิวินาที)
