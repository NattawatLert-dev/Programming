package oop.a7super;

public class Main {
    public static void main(String[] args) {
        
        // super = ใช้อ้างอิงถึงคลาสแม่ (Superclass) จากคลาสลูก (Subclass)
        //         ใช้ภายใน Constructor และการ Override เมธอด
        //         ใช้เรียก Constructor ของคลาสแม่เพื่อกำหนดค่าเริ่มต้นให้กับตัวแปร (Attributes)

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Tom", "Riddle", 3.5);
        Employee employee = new Employee("Ruberus", "Hagrid", 50000);

        person.showName();     // Harry Potter
        student.showGpa();     // Tom's gpa is: 3.5
        employee.showSalary(); // Ruberus's salary is $50000
    
    }
}
