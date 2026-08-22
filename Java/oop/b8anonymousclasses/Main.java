package oop.b8anonymousclasses;

public class Main{
    public static void main(String[] args) {
        
        // Anonymous class = คลาสที่ไม่มีชื่อ ไม่สามารถนำกลับมาใช้ซ้ำได้
        //                   ใช้เพิ่มพฤติกรรม (Behavior) แบบกำหนดเอง
        //                   โดยไม่ต้องสร้างคลาสใหม่ขึ้นมา
        //                   มักใช้กับงานที่ใช้เพียงครั้งเดียว
        //                   เช่น TimerTask, Runnable หรือ Callback

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak(); // the dog goes woof
        dog2.speak(); // Scooby Doo says *Ruh Roh*

    }
}
