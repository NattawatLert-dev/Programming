package a05file_io;

import java.io.FileReader;
import java.io.IOException;

public class A2FileReader {
    public static void main(String[] args) {
        
        // FileReader = เป็นคลาสใน Java ที่ใช้สำหรับ อ่านข้อมูลตัวอักษร (Text) จากไฟล์

        try (FileReader reader = new FileReader("hello.txt")) {

            int ch;

            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);

            }

        } catch (IOException e) {

            System.out.println("Error");

        }

    }
}
