package oop.a5static;

public class Main {
    public static void main(String[] args) {
        
        // static = ทำให้ตัวแปร (variable) หรือเมธอด (method)
        //          เป็นของคลาส (class) โดยตรง
        //          แทนที่จะเป็นของอ็อบเจ็กต์ (object) แต่ละตัว
        //          มักใช้สำหรับเมธอดเครื่องมือ (utility methods)
        //          หรือทรัพยากรที่ใช้ร่วมกัน (shared resources)

        Friend friend1 = new Friend("Spongbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");

        System.out.println(Friend.numOfFriend);
        friend1.ShowFriend();

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

    }
}
