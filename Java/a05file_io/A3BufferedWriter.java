package a05file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A3BufferedWriter {
    public static void main(String[] args) {
        
        // BufferedWriter = เป็นคลาสที่ใช้สำหรับ เขียนข้อความลงไฟล์โดยมี Buffer ช่วยเก็บข้อมูลชั่วคราว ทำให้เขียนได้เร็วขึ้น
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("hello.txt"))) {

            writer.write("Hello");
            writer.newLine();
            writer.write("Java");

        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
