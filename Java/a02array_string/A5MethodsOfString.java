package a02array_string;

public class A5MethodsOfString {
    public static void main(String[] args) {
        
        // Methods of String

        // 1. length() → ความยาวของข้อความ
        
        String a = "abc";
        System.out.println(a.length()); // 3;

        // 2. isEmpty() → ว่างไหม ("")
        
        System.out.println("".isEmpty()); // true
        
        // 3. isBlank() → ว่างหรือมีแต่ช่องว่าง (Java 11+)
        
        System.out.println("   ".isBlank()); // true

        // 4. charAt(int index) → เอาตัวอักษรตำแหน่งที่กำหนด
        
        String word = "Hello";
        System.out.println(word.charAt(1)); // e
        
        // 5. equals(String) → เท่ากันแบบ case-sensitive
        
        String name1 = "Tle";
        String name2 = "Tle";

        System.out.println(name1.equals(name2)); // true

        // 6. equalsIgnoreCase(String) → ไม่สนตัวพิมพ์เล็ก/ใหญ่

        System.out.println("a".equalsIgnoreCase("A")); // true

        // 7. contains() = เช็คว่ามีคำบางส่วนที่ตรงกันไหม
        
        String w = "Hello";
        System.out.println(w.contains("ell")); // true

        // 8. indexOf() = หาตำแหน่งในข้อความ
        
        String name3 = "Natt";
        System.out.println(name3.indexOf("at")); // 1

        // 9. startswith() = เช็คข้อความหน้าสุด

        String name4 = "Mr.Tle";
        if(name4.startsWith("Mr")){
            System.out.println("Man");
        }

        // 10. endswith() = เช็คข้อความหลังสุด

        String name5 = "Mr.Tle";
        if(name5.endsWith("Tle")){
            System.out.println("This is a name");
        }

        // 11. replace() = แทนที่ข้อความ , replaceFirst() = ตัวซ้ำเยอะๆจะเปลี่ยนแค่ตัวแรก

        String date = "August 2025";
        System.out.println(date.replace("2025", "2026")); // August 2026\

        // 12. trim() = ลบช่องว่างซ้ายขวา

        String h = "   Hi   ";
        System.out.println(h.trim()); // Hi

        // 13. split() = การหั่น String

        String fruits = "Apple Banana";
        String[] data = fruits.split(" ");
        System.out.println(data[0]); // Apple

        // 14. subString() = หาข้อความย่อย

        String name = "Nattawat";
        System.out.println(name.substring(0,4)); // Natt

        // 15. toCharArray() = ที่ใช้แปลงข้อความ (String) ให้กลายเป็นอาร์เรย์ของตัวอักษร (char[])

        char[] alphabet = name.toCharArray();
        System.out.println(alphabet[0]); // N

        // 16. copyValueOf() = แปลง Character เป็น String

        char[] alphabet1 = {'T', 'l', 'E'};
        String name6 = String.copyValueOf(alphabet1);
        System.out.println(name6); // TlE

        // 17. toLowerCase() = แปลงเป็นพิมพ์เล็ก

        System.out.println("NATTAWAT".toLowerCase()); // nattawat

        // 18. toUpperCase() = แปลงเป็นพิมพ์ใหญ่

        System.out.println("nattawat".toUpperCase()); // NATTAWAT

        // 19. valueOf = แปลงเลขเป็น String

        int num = 100;
        System.out.println(String.valueOf(num)); // 100

        // 20. parse = แปลงข้อความเป็น เลข

        String str = "123";
        int m = Integer.parseInt(str);

    }
}
