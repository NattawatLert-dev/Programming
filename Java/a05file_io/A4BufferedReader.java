package a05file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A4BufferedReader {
    public static void main(String[] args) {
        
        // BufferedReader = คลาสสำหรับอ่านข้อมูลข้อความโดยใช้ Buffer เพื่อเพิ่มประสิทธิภาพ
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println("Error");

        }
    }
}
