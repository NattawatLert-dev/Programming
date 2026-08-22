package oop.a3overloadedconstructor;

public class Main {
    public static void main(String[] args) {
        
        // overloaded constructors = อนุญาตให้คลาสมี Constructor ได้หลายตัว
        //                           โดยแต่ละตัวมีรายการพารามิเตอร์ (parameter list) ที่แตกต่างกัน
        //                           ทำให้สามารถสร้างและกำหนดค่าเริ่มต้นให้กับออบเจ็กต์ได้หลายรูปแบบ

        User user1 = new User();
        User user2 = new User("Spongbob");
        User user3 = new User("Patrick", "fake123@gmail.com");
        
        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age + "\n");

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age + "\n");

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age + "\n");
    }
}
