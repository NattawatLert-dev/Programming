package a02array_string;

import java.util.Arrays;

public class A2MethodsOfArrays {
    public static void main(String[] args) {
        
        // Methods of Array = Array ใน Java ไม่มีเมธอดของตัวเอง เหมือน String หรือ ArrayList 
        //                    ดังนั้นเมธอดที่เราใช้กับ Array ส่วนใหญ่จะมาจากคลาส array_string
        //                    ก่อนใช้เมธอดใน Arrays ต้อง import ก่อน

        // 1. toString() = แปลง Array เป็น String เพื่อแสดงผล
        
        int[] numbers1 = {10, 20, 30};
        System.out.println(Arrays.toString(numbers1)); // [10, 20, 30]

        // 2. sort() = เรียงลำดับข้อมูลจากน้อยไปมาก
        
        int[] numbers2 = {40, 10, 30, 20};
        
        Arrays.sort(numbers2);
        
        System.out.println(Arrays.toString(numbers2)); // [10, 20, 30, 40]

        // 3. binarySearch() = ค้นหาตำแหน่งของข้อมูลด้วย Binary Search (ต้องเรียงก่อน)
        
        int[] numbers3 = {40, 10, 30, 20};
        
        
        Arrays.sort(numbers3);
        
        int index = Arrays.binarySearch(numbers3, 30);
        
        System.out.println(index); // 2

        // 4. equal() = เปรียบเทียบว่า Array เหมือนกันหรือไม่
        
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        
        System.out.println(Arrays.equals(a, b)); // true

        // 5. fill() = เติมค่าเดียวกันทุกช่อง
        
        int[] numbers = new int[5];
        
        Arrays.fill(numbers, 100);
        
        System.out.println(Arrays.toString(numbers)); //[100, 100, 100, 100, 100]

        // 6. copyOf() = คัดลอก Array
        
        int[] numbers4 = {11, 22, 33};
        int[] copy = Arrays.copyOf(numbers4, numbers4.length);
        
        System.out.println(Arrays.toString(copy)); // [11, 22, 33]

        // 7. copyOfRange() = คัดลอกเฉพาะช่วง
        
        int[] numbers5 = {10, 20, 30, 40, 50};
        int[] copyRange = Arrays.copyOfRange(numbers5, 1, 3);
        
        System.out.println(Arrays.toString(copyRange)); // [20, 30]

        // 8. stream() = แแปลง Array ให้เป็น Stream เพื่อให้สามารถประมวลผลข้อมูลได้สะดวกขึ้น 
        //               เช่น หาผลรวม ค่าเฉลี่ย ค่าสูงสุด กรองข้อมูล หรือแปลงข้อมูล โดยไม่ต้องเขียน for loop
        
        int[] numbers6 = {10, 20, 30};
        
        // Ex.หาผลรวม
        int sum = Arrays.stream(numbers6).sum();
        System.out.println(sum); // 60

        // Ex.หาค่าเฉลี่ย
        double avg = Arrays.stream(numbers6)
                   .average()
                   .orElse(0);
        System.out.println(avg); // 20.0

        // 9. deepToString() = ใช้กับ Array หลายมิติ (2D Array)

        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        
        System.out.println(Arrays.deepToString(matrix)); // [[1, 2], [3, 4]]

    }
}
