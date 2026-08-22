package a01basic;

import java.util.Scanner;

public class A4Input {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input = การรับข้อมูลจากผู้ใช้หรือแหล่งข้อมูลอื่นเข้ามาในโปรแกรม เพื่อนำไปประมวลผล

        String word = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        scanner.nextLine(); // ล้าง Enter
        
        char letter = scanner.nextLine().charAt(0);
        boolean isStudent = scanner.nextBoolean();

        System.out.println(word);
        System.out.println(age);
        System.out.println(height);
        System.out.println(letter);
        System.out.println(isStudent);

        scanner.close();
    }
}
