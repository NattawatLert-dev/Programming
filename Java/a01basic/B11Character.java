package a01basic;

public class B11Character {
    public static void main(String[] args) {
        
        // char = ชนิดข้อมูลที่ใช้เก็บ ตัวอักษร 1 ตัว

        // char เป็นตัวเลขได้ด้วย (ASCII/Unicode value)
        char a = 'A';
        System.out.println(a); // A
        System.out.println((int)a); // 65

        // Methods of Character

        // 1. isLetter() → เช็คว่าเป็นตัวอักษรไหม
        char b = 'T';
        System.out.println(Character.isLetter(b)); // true

        // 2. isDigit() → เช็คว่าตัวอักษรเป็นตัวเลขไหม
        char c = '1';
        System.out.println(Character.isDigit(c)); // true

        // 3. isWhitespace() → เช็คช่องว่าง
        System.out.println(Character.isWhitespace(c)); // false
        
        // 4. toUpperCase() → แปลงเป็นตัวใหญ่
        System.out.println(Character.toUpperCase('a')); // A
        System.out.println(Character.toUpperCase('z')); // Z

        // 5. toLowerCase() → แปลงเป็นตัวเล็ก
        System.out.println(Character.toLowerCase('A')); // a
        System.out.println(Character.toLowerCase('Z')); // z
    
        // 6. isUpperCase() → เช็คตัวใหญ่
        System.out.println(Character.isUpperCase('A')); // true
        System.out.println(Character.isUpperCase('a')); // false
    
        // 7. isLowerCase() → เช็คตัวเล็ก
        System.out.println(Character.isLowerCase('a')); // true
        System.out.println(Character.isLowerCase('A')); // false
    
    }   
}
