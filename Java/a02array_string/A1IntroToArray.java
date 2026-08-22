package a02array_string;

public class A1IntroToArray {
    public static void main(String[] args) {
        
        // Array = โครงสร้างข้อมูล (Data Structure) ที่ใช้เก็บข้อมูลหลายค่า โดยข้อมูลทุกตัวต้องเป็นชนิดเดียวกัน

        // การประกาศ Array

        // แบบที่ 1
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[0]); // 10

        // แบบที่ 2
        String[] fruits = {"Apple", "Banana", "Orange"};

        System.out.println(fruits[2]); // Orange

        // จำนวนสมาชิกใน array
        
        System.out.println(fruits.length); // 3

        // เข้าถึงสมาชิกด้วย for loop
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // เข้าถึงสมาชิกด้วย for each
        
        for(String item : fruits){
            System.out.println(item);
        }

    }
}
