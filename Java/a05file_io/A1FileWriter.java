package a05file_io;

import java.io.FileWriter;
import java.io.IOException;

public class A1FileWriter {
    public static void main(String[] args) {
        
        // FileWriter = เป็นคลาสที่ใช้สำหรับเขียนข้อมูลตัวอักษร (Text) ลงไฟล์
        try {

            FileWriter writer = new FileWriter("hello.txt");

            writer.write("Name : Title\n");
            writer.write("Age : 20\n");
            writer.write("Major : Computer Science");

            writer.close();

            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
