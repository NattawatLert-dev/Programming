package a01basic;

public class B12Printf {
    public static void main(String[] args) {
        
        // printf เป็นเมธอดสำหรับ แสดงผลข้อความที่สามารถกำหนดรูปแบบ (Format) ได้

        // 1. %d (จำนวนเต็ม)
        int score = 95;
        System.out.printf("Score = %d", score);

        // 2. %s (String)
        String name = "Alice";
        System.out.printf("Hello %s", name);

        // 3. %f (เลขทศนิยม)
        double price = 99.99;
        System.out.printf("%.2f", price);

        // 4. %c (ตัวอักษร)
        char grade = 'A';
        System.out.printf("%c", grade);
    
    }
}
