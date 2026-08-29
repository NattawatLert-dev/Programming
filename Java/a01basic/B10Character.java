package a01basic;

public class B10Character {

    public static void main(String[] args) {

        // ========================================================
        // Character / char
        // ========================================================
        // char = ชนิดข้อมูลที่ใช้เก็บ "ตัวอักษร 1 ตัว"
        //
        // ตัวอย่าง
        //
        // 'A'
        // 'B'
        // '1'
        // '!'
        // 'ก'
        //
        // ⚠️ char ใช้ Single Quote ' '
        //
        // char letter = 'A';    // ถูก
        //
        // String word = "Hello"; // String ใช้ Double Quote " "
        //
        //
        // จำง่าย ๆ
        //
        // char = ตัวอักษร 1 ตัว
        //
        // String = ข้อความหลายตัวอักษร


        // ========================================================
        // 1. char สามารถแปลงเป็นตัวเลขได้
        // ========================================================
        // char ใน Java มีขนาด 16 bits
        //
        // และเก็บค่าตาม Unicode
        //
        // ตัวอักษรแต่ละตัวจะมี "ค่าตัวเลข" ที่สัมพันธ์กับมัน
        //
        // สำหรับตัวอักษรภาษาอังกฤษพื้นฐานค่าจะตรงกับ ASCII ด้วย
        //
        //
        // เช่น
        //
        // 'A' = 65
        // 'B' = 66
        // 'C' = 67
        //
        // ...
        //
        // 'Z' = 90


        char a = 'A';

        System.out.println(a);
        // A


        // (int)a = แปลง char เป็น int
        //
        // เรียกว่า Type Casting
        // 'A' -> 65

        System.out.println((int) a); // 65

        // ========================================================
        // 2. Unicode
        // ========================================================
        // char ไม่ได้มีแค่ A-Z เพราะ Java ใช้ Unicode
        //
        // ดังนั้นสามารถใช้ตัวอักษรภาษาอื่นได้ด้วย
        // เช่น ภาษาไทย


        char thai = 'ก';

        System.out.println(thai);


        // สามารถดูค่าตัวเลขของ Unicode code unit ได้

        System.out.println((int) thai);


        // ========================================================
        // 3. Character Class
        // ========================================================
        // Character = Class ที่ Java เตรียมไว้ให้ สำหรับจัดการกับ char
        //
        // ตัวอย่าง
        //
        // Character.isLetter()
        // Character.isDigit()
        // Character.toUpperCase()
        //
        //
        // สังเกตว่า
        //
        // char = primitive type
        //
        // Character = wrapper class
        //
        //
        // char -> เก็บตัวอักษร
        //
        // Character -> มี Method สำหรับจัดการตัวอักษร


        // ========================================================
        // 4. isLetter()
        // ========================================================
        // isLetter() → ตรวจสอบว่า char เป็น "ตัวอักษร" หรือไม่
        //
        // Return → boolean
        //
        // true
        // หรือ
        // false


        char b = 'T';

        System.out.println(Character.isLetter(b));
        // true


        System.out.println(Character.isLetter('A'));
        // true


        System.out.println(Character.isLetter('7'));
        // false


        System.out.println(Character.isLetter('!'));
        // false


        // สามารถใช้กับภาษาอื่นได้ด้วย

        System.out.println(Character.isLetter('ก'));
        // true


        // ========================================================
        // 5. isDigit()
        // ========================================================
        // isDigit() → ตรวจสอบว่า char เป็น "ตัวเลข" หรือไม่
        //
        // Return → boolean


        char c = '1';

        System.out.println(Character.isDigit(c));
        // true


        System.out.println(Character.isDigit('9'));
        // true


        System.out.println(Character.isDigit('A'));
        // false


        /*
         * ⚠️ สิ่งที่ต้องเข้าใจ
         *
         * '1' เป็น char
         *
         * ไม่ใช่ int 1
         *
         *
         * '1' = ตัวอักษร 1
         *
         *
         * 1 = ตัวเลขจำนวนเต็ม
         *
         *
         * ตัวอย่าง
         *
         * char x = '1';
         *
         * int y = 1;
         *
         * x กับ y เป็นคนละชนิดข้อมูล
         */


        // ========================================================
        // 6. isWhitespace()
        // ========================================================
        // isWhitespace() → ตรวจสอบว่า char เป็น Whitespace หรือไม่
        //
        // Whitespace = ตัวอักษรที่ใช้เว้นระยะ
        //
        // เช่น
        //
        // ' '
        // '\t'
        // '\n'
        //
        //
        // Return → true / false


        System.out.println(Character.isWhitespace(c));
        // false
        //
        // เพราะ c = '1'


        System.out.println(Character.isWhitespace(' '));
        // true


        // Tab
        System.out.println(Character.isWhitespace('\t'));
        // true


        // New Line
        System.out.println(Character.isWhitespace('\n'));
        // true


        // ========================================================
        // 7. toUpperCase()
        // ========================================================
        // toUpperCase() → แปลงตัวอักษรเป็นตัวพิมพ์ใหญ่
        //
        // ตัวอย่าง
        //
        // a -> A
        // z -> Z


        System.out.println(Character.toUpperCase('a'));
        // A


        System.out.println(Character.toUpperCase('z'));
        // Z


        // ถ้าเป็นตัวใหญ่อยู่แล้ว
        // ก็จะยังคงเป็นตัวใหญ่

        System.out.println(Character.toUpperCase('A'));
        // A


        // ========================================================
        // 8. toLowerCase()
        // ========================================================
        // toLowerCase() → แปลงตัวอักษรเป็นตัวพิมพ์เล็ก
        //
        // ตัวอย่าง
        //
        // A -> a
        // Z -> z


        System.out.println(Character.toLowerCase('A'));
        // a


        System.out.println(Character.toLowerCase('Z'));
        // z


        // ========================================================
        // 9. isUpperCase()
        // ========================================================
        // isUpperCase() → ตรวจสอบว่าเป็นตัวพิมพ์ใหญ่หรือไม่
        //
        // Return → true / false


        System.out.println(Character.isUpperCase('A'));
        // true


        System.out.println(Character.isUpperCase('a'));
        // false


        System.out.println(Character.isUpperCase('1'));
        // false


        // ========================================================
        // 10. isLowerCase()
        // ========================================================
        // isLowerCase() → ตรวจสอบว่าเป็นตัวพิมพ์เล็กหรือไม่
        //
        // Return → true / false


        System.out.println(Character.isLowerCase('a'));
        // true


        System.out.println(Character.isLowerCase('A'));
        // false


        System.out.println(Character.isLowerCase('1'));
        // false


        // ========================================================
        // 11. char กับ String
        // ========================================================
        // เป็นเรื่องที่ต้องแยกให้ออก
        //
        //
        // char = ตัวอักษร 1 ตัว
        //
        // String = ข้อความ
        //
        //
        // char
        // char letter = 'A';
        //
        //
        // String
        // String word = "Apple";
        //
        //
        // ใช้ Quote ต่างกัน
        //
        // char -> 'A'
        //
        // String -> "Apple"


        char letter = 'A';

        String word = "Apple";

        System.out.println("char   = " + letter);
        System.out.println("String = " + word);


        // ========================================================
        // 12. char สามารถนำไปคำนวณได้
        // ========================================================
        // เพราะ char มีค่าตัวเลข Unicode
        //
        // เราจึงสามารถใช้ char ในการคำนวณได้
        //
        //
        // เช่น
        //
        // 'A' = 65
        //
        // 'A' + 1
        //
        // = 66
        //
        // 66 คือ 'B'


        char first = 'A';

        System.out.println(first + 1);
        // 66


        // ถ้าต้องการให้ผลลัพธ์กลับมาเป็น char
        // ต้อง Cast กลับเป็น char

        char next = (char) (first + 1);

        System.out.println(next);
        // B


        // ตัวอย่างเพิ่มทีละตัว

        char letter1 = 'A';

        letter1++;

        System.out.println(letter1);
        // B


        // ========================================================
        // 13. ตรวจสอบประเภทของ Character
        // ========================================================
        // เราสามารถนำ Method ต่าง ๆ มาใช้ร่วมกันได้
        //
        // ตัวอย่าง
        //
        // ถ้าเป็นตัวอักษร -> บอกว่าเป็น Letter
        //
        // ถ้าเป็นตัวเลข -> บอกว่าเป็น Digit
        //
        // ถ้าไม่ใช่ทั้งสองอย่าง -> บอกว่าเป็น Symbol


        char input = '#';

        if (Character.isLetter(input)) {

            System.out.println("Letter");

        }
        else if (Character.isDigit(input)) {

            System.out.println("Digit");

        }
        else {

            System.out.println("Symbol");
        }


        // ========================================================
        // 14. ใช้ Character กับ Loop
        // ========================================================
        // Character มักถูกใช้ร่วมกับ Loop เพื่อวิเคราะห์ตัวอักษรทีละตัว
        //
        // ตัวอย่าง
        //
        // ตรวจตัวอักษร A ถึง E


        for (char ch = 'A'; ch <= 'E'; ch++) {

            System.out.println(ch);
        }


        /*
         * ผลลัพธ์
         *
         * A
         * B
         * C
         * D
         * E
         *
         *
         * เพราะ char มีค่าตัวเลขเรียงกัน
         *
         * A -> 65
         * B -> 66
         * C -> 67
         * D -> 68
         * E -> 69
         */


        // ========================================================
        // 15. Character กับ if
        // ========================================================
        // สามารถนำ Character Method
        // มาใช้ตัดสินใจด้วย if ได้


        char passwordCharacter = 'A';

        if (Character.isUpperCase(passwordCharacter)) {

            System.out.println("Uppercase");

        }
        else {

            System.out.println("Not Uppercase");
        }


        // ========================================================
        // 16. Method ที่ใช้บ่อย
        // ========================================================
        /*
         * ========================================================
         * ตรวจสอบ
         * ========================================================
         *
         * Character.isLetter(ch) -> เป็นตัวอักษรไหม
         *
         *
         * Character.isDigit(ch) -> เป็นตัวเลขไหม
         *
         *
         * Character.isWhitespace(ch) -> เป็นช่องว่างไหม
         *
         *
         * Character.isUpperCase(ch) -> เป็นตัวใหญ่ไหม
         *
         *
         * Character.isLowerCase(ch) -> เป็นตัวเล็กไหม
         *
         *
         * ========================================================
         * แปลง
         * ========================================================
         *
         * Character.toUpperCase(ch) -> แปลงเป็นตัวใหญ่
         *
         *
         * Character.toLowerCase(ch) -> แปลงเป็นตัวเล็ก
         *
         *
         * ========================================================
         */


        // ========================================================
        // 17. ตัวอย่างรวม
        // ========================================================
        // ตัวอย่างนี้จะตรวจสอบ Character
        // หลายประเภท


        char[] characters = {'A', 'b', '7', ' ', '!'};

        for (char ch : characters) {

            System.out.println(
                    "Character: '" + ch + "'"
            );

            System.out.println(
                    "Letter: " + Character.isLetter(ch)
            );

            System.out.println(
                    "Digit: " + Character.isDigit(ch)
            );

            System.out.println(
                    "Whitespace: " + Character.isWhitespace(ch)
            );

            System.out.println(
                    "UpperCase: " + Character.isUpperCase(ch)
            );

            System.out.println(
                    "LowerCase: " + Character.isLowerCase(ch)
            );

            System.out.println();
        }


        // ========================================================
        // Summary
        // ========================================================
        /*
         * ========================================================
         * สรุป char
         * ========================================================
         *
         * char = Primitive Type สำหรับเก็บตัวอักษร 1 ตัว
         *
         *
         * char letter = 'A';
         *
         *
         * Character = Wrapper Class ของ char และมี Method สำหรับจัดการตัวอักษร
         *
         *
         * ========================================================
         * สิ่งที่ต้องจำ
         * ========================================================
         *
         * 'A' = char
         *
         *
         * "A" = String
         *
         *
         * '1' = char ที่เป็นตัวอักษร 1
         *
         *
         * 1 = int ที่มีค่าเป็น 1
         *
         *
         * ========================================================
         * Character Methods
         * ========================================================
         *
         * isLetter() -> ตรวจว่าเป็นตัวอักษร
         *
         *
         * isDigit() -> ตรวจว่าเป็นตัวเลข
         *
         *
         * isWhitespace() -> ตรวจว่าเป็นช่องว่าง
         *
         *
         * toUpperCase() -> แปลงเป็นตัวใหญ่
         *
         *
         * toLowerCase() -> แปลงเป็นตัวเล็ก
         *
         *
         * isUpperCase() -> ตรวจว่าเป็นตัวใหญ่
         *
         *
         * isLowerCase() -> ตรวจว่าเป็นตัวเล็ก
         *
         *
         * ========================================================
         * Unicode
         * ========================================================
         *
         * Java ใช้ Unicode
         *
         * char มีขนาด 16 bits
         *
         * จึงสามารถใช้ตัวอักษรภาษาอื่น
         * นอกเหนือจาก A-Z ได้
         */
    }
}

