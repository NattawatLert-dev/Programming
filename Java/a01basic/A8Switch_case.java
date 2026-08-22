package a01basic;

public class A8Switch_case {
    public static void main(String[] args) {
        
        // switch-case = คำสั่งที่ใช้ เลือกทำงานจากหลายตัวเลือก โดยเปรียบเทียบค่าของตัวแปรเพียงตัวเดียวกับหลาย ๆ กรณี 
        //               (case) ทำให้โค้ดอ่านง่ายกว่า if-else if เมื่อมีหลายค่าที่ต้องตรวจสอบ

        String color = "Red";

        switch (color) {
            case "Red" -> System.out.println("Stop");
            case "Yellow" -> System.out.println("Ready");
            case "Green" -> System.out.println("Go");
            default -> System.out.println("Unknown");
            }
            
    }
}
