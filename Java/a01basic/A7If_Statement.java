package a01basic;

public class A7If_Statement {
    public static void main(String[] args) {
        
        // Condition = การเขียนโปรแกรมให้ ตัดสินใจว่าจะทำอะไรต่อไป โดยอาศัยผลลัพธ์ที่เป็น true (จริง) หรือ false (เท็จ)

        // if-else
        int age = 15;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }

        //หลายเงื่อนไข
        int score = 82;

        if (score >= 80) {
            System.out.println("Grade A");
        }
        else if (score >= 70) {
            System.out.println("Grade B");
        }
        else if (score >= 60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

        // Nested if (if ซ้อนกัน)
        int a = 20;
        boolean member = false;

        if (a >= 18) {
            if (member) {
                System.out.println("Discount");
            } else {
                System.out.println("DON'T HAVE DISCOUNT");
            }
        }

        // Ternary Operator = เขียน if-else แบบสั้น ๆ

        int x = 20;

        String result = x >= 18 ? "Adult" : "Child";

        System.out.println(result);

    }
}
