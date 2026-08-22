package a01basic;

public class A6Operator {
    public static void main(String[] args) {
        
        // Operator = สัญลักษณ์ที่ใช้ในการกระทำกับข้อมูล (Operand) เช่น คำนวณ เปรียบเทียบ กำหนดค่า หรือเชื่อมเงื่อนไข

        int a = 10;
        int b = 3;

        // Arithmetic Operators

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        // Comparison (Relational) Operators = ใช้เปรียบเทียบค่า ผลลัพธ์เป็น true หรือ false

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a < b);  // false
        System.out.println(a > b);  // true
        System.out.println(a <= b); // false
        System.out.println(a >= b); // true

        // Assignment Operators
        
        int x = 10;

        x += 5; // x = x + 5
        System.out.println(x); // 15

        x -= 5; // x = x - 5
        System.out.println(x); // 10

        x *= 2; // x = x * 2
        System.out.println(x); // 20

        // /= , %=

        // Logical Operators = ใช้กับค่าประเภท boolean
        
        int age = 20;
        boolean hasCard = true;

        System.out.println(age >= 18 && hasCard); // true
        System.out.println(age < 18 || hasCard);  // true
        System.out.println(!hasCard);             // false

        // Increment / Decrement Operators = เพิ่มหรือลดค่าทีละ 1

        int y = 5;

        y++;
        System.out.println(y); // 6

        ++y;
        System.out.println(y); // 7

        --y;
        System.out.println(y); // 6

        y--;
        System.out.println(y); // 5

    }
}
