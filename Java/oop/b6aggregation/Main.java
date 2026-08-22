package oop.b6aggregation;

public class Main {
    public static void main(String[] args) {
        
        // Aggregation = แสดงความสัมพันธ์แบบ "has-a" (มีเป็นส่วนประกอบ) ระหว่างอ็อบเจ็กต์
        //               อ็อบเจ็กต์หนึ่งมีอีกอ็อบเจ็กต์หนึ่งเป็นส่วนหนึ่งของโครงสร้าง
        //               แต่อ็อบเจ็กต์ที่ถูกเก็บไว้สามารถดำรงอยู่ได้อย่างอิสระ

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Tower", 352);
        Book book3 = new Book("The Return of the King", 416);
    
        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        /*for(Book list : books){
            System.out.println(list.displayInfo());
        }*/

        library.displayInfo();
    }
}
